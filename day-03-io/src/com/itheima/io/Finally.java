package com.itheima.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Finally {
    public static void main(String[] args) throws Exception {

    }
    public static void writeFile() throws Exception {
        OutputStream out = null;
        try {
            out = new FileOutputStream("day-03-io/src/com/itheima/aaa/a.txt");
            out.write(97);
            out.write('b');
            out.write("\r\n".getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (out != null) {
                    out.close();
                }
        }
    }
    public static void writeFile2() {
        try (// 只能放资源，资源都集成了自动关闭接口
             OutputStream out = new FileOutputStream("day-03-io/src/com/itheima/aaa/a.txt")
        ){
            out.write(97);
            out.write('b');
            out.write("\r\n".getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


