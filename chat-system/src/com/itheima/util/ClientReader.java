package com.itheima.util;

import com.itheima.ui.ClientChatFrame;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.*;

public class ClientReader extends Thread{
        private Socket socket;
        private DataInputStream dis;
        private ClientChatFrame win;
        public ClientReader(Socket socket, ClientChatFrame win) {
            this.win = win;
            this.socket = socket;
        }
        @Override
        public void run()  {
            // 获取输入流，接收数据
            try {
                //从socket中接收客户端发送来的消息类型编号 1：登录消息 2：群聊消息 3：私聊消息
                dis = new DataInputStream(socket.getInputStream());
                while (true) {
                    int type = dis.readInt();
                    switch (type) {
                        case 1:
                            //服务端发来登录消息，接下来要接收昵称数据在更新在线客户端的在线人数列表
                            updateOnlineUsers();
                            break;
                        case 2:
                            // 服务端发来了群聊消息，
                            getGroupChatMsg();
                            break;
                        case 3:
                            // 服务端发来了私聊消息
                            break;

                    }
                }

            } catch (Exception e) {
                System.out.println("和服务端断开了连接..."+socket.getInetAddress().getHostAddress()+":"+socket.getPort());
            }

        }

    private void getGroupChatMsg() throws Exception {
            String msg = dis.readUTF();
            win.sendMsgToWin(msg);
    }

    /**
     * 更新客户端的在线人数列表
     */
    private void updateOnlineUsers() throws Exception {
        int onlineCount = dis.readInt();// 拿到当前在线的用户个数
        String[] onlineUsers = new String[onlineCount];
        for (int i = 0; i < onlineCount; i++) {
            //读取每个用户信息
            String onlineUser = dis.readUTF();
            // 添加用户到在线数组
            onlineUsers[i] = onlineUser;
        }
        //将集合中的数据展示到窗口上
        win.updateOnlineUsers(onlineUsers);
    }
}
