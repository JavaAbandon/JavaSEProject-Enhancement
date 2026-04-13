package com.itheima.notation;

@MyStar(name = "张三", age = 20, skills = {"java","python","c++"})
//@A("delete")// 仅有一个value属性需要赋值时才能这么简化（仅有一个value属性或者别的属性都用默认值）
@A(value = "张三",hobby = "吃吃吃")
public class Test {
    @MyStar(name = "鞠婧祎", age = 31, skills = {"唱歌","跳舞","演戏"})
    public static void main(String[] args) {

    }
}
