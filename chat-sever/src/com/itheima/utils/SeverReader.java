package com.itheima.utils;


import com.itheima.Sever;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collection;

public class SeverReader extends Thread {
    private final Socket socket;
    public SeverReader(Socket socket) {
        this.socket = socket;
    }
    @Override
    public void run()  {
        // 获取输入流，接收数据
        try {
            //从socket中接收客户端发送来的消息类型编号
            DataInputStream dis = new DataInputStream(socket.getInputStream());

            while (true) {
                int type = dis.readInt();
                switch (type) {
                    case 1:
                        // 客户端发来登录消息，接下来要接收昵称数据在更新在线客户端的在线人数列表
                        String nickname = dis.readUTF();
                        // 添加昵称到在线列表
                        Sever.onlineUsers.put(socket, nickname);
                        updateOnlineUsers();
                        break;
                    case 2:
                        // 客户端发来了群聊消息， 接下来要接收群聊消息内容，再把消息转发给客户端
                        String content = dis.readUTF();
                        sendMessage(content);
                        break;
                    case 3:
                        // 客户端发来了私聊消息， 接收私聊消息内容，再把消息转发给指定客户端
                        break;

                }
            }

        } catch (Exception e) {
            System.out.println("客户端退出了：" + socket.getInetAddress().getHostAddress() + ":" + socket.getPort());
            Sever.onlineUsers.remove(socket);// 把下线用户从列表中移除
            updateOnlineUsers();

        }

    }

    private void sendMessage(String content) {
        StringBuilder sb = new StringBuilder();
        String name = Sever.onlineUsers.get(socket);
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss EEE a");
        String format = df.format(now);
        String message = sb.append(name).append(" ").append(format).append(":\r\n").append(content).append("\r\n").toString();
        for (Socket socket : Sever.onlineUsers.keySet()) {
            try {
                DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
                dos.writeInt(2);// 告诉客户端，这是群聊消息 1：登录消息 3：私聊消息
                dos.writeUTF(message);
                dos.flush();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void updateOnlineUsers() {
        //拿到全部在线客户端的用户名然后发送给所有在线的socket管道
        // 拿到当前在线的用户列表
        Collection<String> onlineUsers = Sever.onlineUsers.values();
        // 把用户列表推送给全部客户端管道
        for (Socket socket : Sever.onlineUsers.keySet()) {
            try {
                DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
                dos.writeInt(1);// 告诉客户端，这是在线人数列表信息 2：群聊消息 3：私聊消息
                dos.writeInt(onlineUsers.size());
                for (String user : onlineUsers) {
                    dos.writeUTF(user);
                }
                dos.flush();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}


