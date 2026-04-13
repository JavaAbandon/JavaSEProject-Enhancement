package com.itheima.notation;

public @interface MyStar {
    String name();
    int age() default 18;
    String[] skills() default {"java","python"};
}
