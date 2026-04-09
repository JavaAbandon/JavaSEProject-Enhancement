package com.itheima.io;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Buffered {
    public static void main(String[] args) {
        try (
                BufferedReader bis = new BufferedReader(new FileReader("day-03-io/src/com/itheima/aaa/csb.txt"));
                BufferedWriter bos = new BufferedWriter(new FileWriter("day-03-io/src/com/itheima/aaa/csb_out.txt"))
        ) {
            List<String> lines = new ArrayList<>();
            String line;
            while ((line = bis.readLine()) != null) {
                lines.add(line);
            }
            Collections.sort(lines);//自动排序，手动定义的话要这么写：lines.sort((o1, o2) -> o2.length() - o1.length());
            System.out.println(lines);

            for (String s : lines) {
                bos.write(s);
                bos.newLine();
            }

            System.out.println("处理完毕");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
