package com.itheima.reflect.demo;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;

// 框架类
public class Frame {
    //定义一个保存任意对象的静态方法
    public static void save(Object obj,String outPath) throws  Exception {
        PrintStream out = new PrintStream(new FileOutputStream(outPath, true));
        // 获取对象类型
        Class c = obj.getClass();
        String simpleName = c.getSimpleName();
        out.println("=================="+simpleName+"==================");
        // 获取对象的所有属性
        Field[] fields = c.getDeclaredFields();
        // 遍历属性
        for (Field field : fields) {
            // 获取属性名称
            String name = field.getName();
            // 获取属性值
            field.setAccessible(true);
            Object value = field.get(obj)+"";
            out.println(name+" = "+value);
            try {
                value = field.get(obj);
            }catch (Exception e){
                e.printStackTrace();
            }
        }

        // 保存数据到一个文件

    }
}
