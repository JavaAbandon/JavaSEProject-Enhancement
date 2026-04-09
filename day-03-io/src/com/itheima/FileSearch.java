package com.itheima;

import java.io.File;
import java.io.IOException;

public class FileSearch {
    public static void main(String[] args) {
        File dir = new File("C:/");
        searchFile(dir, "QQMusic.exe");
    }

    private static void searchFile(File dir, String fileName) {
        if (dir == null||dir.isFile()||!dir.exists()){
            return;
        }
        File[] files = dir.listFiles();// 获取当前目录下的所有一级文件对象

        //遍历
        if (files != null){
            for (File file : files) {
                if (file.isFile()){
                    if (file.getName().equals(fileName)){
                        System.out.println(file.getAbsolutePath());
                        try {
                            new ProcessBuilder(file.getAbsolutePath()).start();
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }

                    }
                }else {
                    searchFile(file,fileName);
                }
            }
        }
    }
}
