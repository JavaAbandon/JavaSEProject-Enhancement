package com.itheima.reflect;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class Reflect {
    @Test
    public void test1() throws Exception {
        // 反射第一步：获取Class对象
        Class c1 = Student.class;
        System.out.println(c1);
        //获取类本身的Class对象
        Class c2 = Class.forName("com.itheima.reflect.Student");
        System.out.println(c2);
        System.out.println(c1 == c2);

        // 获取类本身，通过对象获取
        Student s = new Student( "张三", 18);
        Class c3 = s.getClass();
        System.out.println(c3);
        System.out.println(c1 == c3);
    }

    @Test
    public void getClassInfo() {
        // 获取类的信息
        Class c1 =Student.class;
        System.out.println(c1.getName());// com.itheima.reflect.Student 全类名
        System.out.println(c1.getSimpleName());// Student 简单类名
    }

    /**
     *  获取类的构造器对象并对其进行操作
     */
    @Test
    public void getConstructor() throws Exception {
        Class c1 = Student.class;
        // 获取构造器对象
        Constructor[] constructors = c1.getDeclaredConstructors();
        for (Constructor c : constructors) {
            System.out.println(c.getName() + "(" + c.getParameterCount() + ")");
        }

        //获取单个构造器
        Constructor con = c1.getDeclaredConstructor();
        System.out.println(con.getName() + "(" + con.getParameterCount() + ")");

        Constructor con2 = c1.getDeclaredConstructor(String.class, int.class);
        System.out.println(con2.getName() + "(" + con2.getParameterCount() + ")");


        // 创建对象
        //暴力反射，临时攻破权限，强行绕过私有
        con.setAccessible(true);
        Student s = (Student)con.newInstance();
        System.out.println(s);

        Student s2 = (Student)con2.newInstance("张三", 18);
        System.out.println(s2);

    }

    @Test
    public void getFieldInfo() throws Exception {
        Class c1 = Student.class;
        Field[] fields = c1.getDeclaredFields();
        for (Field f : fields) {
            System.out.println(f.getName() + "(" + f.getType().getName() + ")");
        }

        Field field = c1.getDeclaredField("hobby");
        System.out.println(field.getName() + "(" + field.getType().getName() + ")");

        Student s = new Student( "张三", 18);
        field.setAccessible(true);// 暴力反射，临时攻破权限，强行绕过私有
        field.set(s, "看电影");
        System.out.println(s.getHobby());
    }

    @Test
    public void getMethodInfo() throws Exception {
        Class c1 = Student.class;
        for (Method m : c1.getDeclaredMethods()) {
            System.out.println(m.getName() + "(" + m.getParameterCount() + ")");
        }
        Method method = c1.getDeclaredMethod("show");
        System.out.println(method.getName() + "(" + method.getParameterCount() + ")");

        Method method2 = c1.getDeclaredMethod("showHome", String.class);
        System.out.println(method2.getName() + "(" + method2.getParameterCount() + ")");

        Student s = new Student( "张三", 18);
        method2.setAccessible(true);
        method2.invoke(s, "北京");
        method.invoke(s);
        System.out.println(s.getName());
        System.out.println(s.getAge());
        System.out.println(s.getHobby());
        System.out.println(s);
    }

    //绕过泛型的约束
    @Test
    public void test() throws Exception {
        ArrayList<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");

        Class c1 = list.getClass();
        Method m = c1.getDeclaredMethod("add", Object.class);
        m.invoke(list, 123);
        m.invoke(list, true);
        System.out.println(list);
    }
}
