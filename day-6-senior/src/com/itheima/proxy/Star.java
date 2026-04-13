package com.itheima.proxy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Star implements StarService{
    private String name;


    @Override
    public void sing(String name) {
        System.out.println(name+"正在唱歌...");
    }

    @Override
    public String dance() {
        return "dance";
    }
}
