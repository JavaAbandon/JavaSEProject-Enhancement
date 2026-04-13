package com.itheima.collection;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 电影服务类
 * 提供电影信息管理功能，包括添加、查询、删除、修改等操作
 * 使用控制台交互方式管理电影数据
 */
public class MovieService {
    // 存储电影信息的列表集合，使用静态变量保证数据共享
    private static final List<Movie> movies = new ArrayList<>();
    // 用于读取用户输入的扫描器对象
    private static Scanner scanner;

    /**
     * 启动电影管理系统
     * 显示主菜单并根据用户输入执行相应操作
     * 系统会持续运行直到用户选择退出
     */
    public void start() {
        // 无限循环保持系统运行
        while (true){
            System.out.println("=====电影信息操作系统=====");
            System.out.println("1.添加电影");
            System.out.println("2.查看电影");
            System.out.println("3.删除电影");
            System.out.println("4.修改电影");
            System.out.println("5.展示电影");
            System.out.println("6.封杀");
            System.out.println("5.退出系统");
            System.out.println("请您输入操作命令：");
            // 读取用户输入的命令
            String command = scanner.next();
            // 根据命令执行对应操作
            switch (command) {
                case "1":
                    addMovie();
                    break;
                case "2":
                    listMovie();
                    break;
                case "3":
                    deleteMovie();
                    break;
                case "4":
                    updateMovie();
                    break;
                case "5":
                    System.out.println("欢迎下次光临！");
                    return;  // 退出系统
                default:
                    System.out.println("输入命令有误，请重新输入！");
            }
        }
    }

    /**
     * 查看所有电影
     * 遍历电影列表并打印每部电影的详细信息
     */
    private void listMovie() {
        System.out.println("=====查看电影=====");
        // 增强for循环遍历电影列表
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }

    /**
     * 添加电影
     * 从控制台读取用户输入的电影信息并添加到列表中
     */
    private void addMovie() {
        System.out.println("====上架电影====");
        // 创建新的电影对象
        Movie movie = new Movie();
        // 读取电影名称
        System.out.println("请输入电影名称：");
        movie.setName(scanner.next());
        // 读取主演信息
        System.out.println("请输入主演：");
        movie.setActor(scanner.next());
        // 读取电影价格
        System.out.println("请输入价格：");
        movie.setPrice(scanner.nextDouble());
        // 读取电影评分
        System.out.println("请输入电影评分：");
        movie.setScore(scanner.nextDouble());
        // TODO: 将电影添加到列表中


    }

    /**
     * 查询电影
     * 根据用户输入的电影名称查找并显示电影信息
     */
    private void queryMovie() {
        System.out.println("=====查看电影=====");
        // 读取用户要查询的电影名称
        System.out.println("请输入电影名称");
        String name = scanner.next();
        // 调用私有方法查询电影
        Movie movie = queryMovieByName(name);
        if (movie != null) {
            // 找到电影，打印信息
            System.out.println(movie);
        } else {
            // 未找到电影
            System.out.println("没有此电影");
        }


    }

    /**
     * 根据电影名称查询电影
     * @param name 电影名称
     * @return 找到的电影对象，未找到返回null
     */
    private Movie queryMovieByName( String name) {
        // 遍历电影列表进行查找
        for (Movie movie : movies) {
            if (movie.getName().equals(name)) {
                return movie;  // 找到匹配的电影，立即返回
            }
        }
       return null;  // 未找到匹配的电影
    }

    /**
     * 修改电影信息
     * 根据电影名称查找电影并更新其信息
     */
    private void updateMovie() {
        System.out.println("=====修改电影=====");
        // 读取要修改的电影名称
        System.out.println("请输入电影名称：");
        String name = scanner.next();
        // 查询电影是否存在
        Movie movie = queryMovieByName(name);
        if (movie != null) {
            // TODO: 实现电影信息修改逻辑
        }

    }

    /**
     * 删除电影
     * 根据电影名称从列表中移除电影
     */
    private void deleteMovie() {
        // TODO: 实现删除电影逻辑

    }
}
