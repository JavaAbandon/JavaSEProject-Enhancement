package com.itheima.reflect.demo;

import com.itheima.reflect.demo.obj.Dog;
import com.itheima.reflect.demo.obj.Student;
import com.itheima.reflect.demo.obj.Teacher;
import org.junit.jupiter.api.Test;

/**
 * 简易框架
 */
public class FrameTest {

    public static void main(String[] args) throws Exception {
        Dog d = new Dog("大黄",1);

        Student s = new Student("小王", 18,"爱玩滑板");

        Teacher t = new Teacher("李老师", 25,"看书",8000,"艺术班",'女',"上海市黄埔区青浦路10086号","12345678901");

        String path = "day-6-senior/src/com/itheima/reflect/demo/out/obj.txt";
        Frame.save(d, path);
        Frame.save(s, path);
        Frame.save(t, path);

        System.out.println("当前工作目录: " + System.getProperty("user.dir"));
    }

    @Test
    public void testSave() throws Exception {
        Dog d = new Dog("大黄",1);

        Student s = new Student("小王", 18,"爱玩滑板");

        Teacher t = new Teacher("李老师", 25,"看书",8000,"艺术班",'女',"上海市黄埔区青浦路10086号","12345678901");

        String path = "src/com/itheima/reflect/demo/out/obj.txt";
        Frame.save(d, path);
        Frame.save(s, path);
        Frame.save(t, path);
        System.out.println("当前工作目录: " + System.getProperty("user.dir"));
    }
}
