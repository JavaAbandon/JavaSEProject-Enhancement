package com.itheima.collection;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieService {
    private static final List<Movie> movies = new ArrayList<>();
    private static Scanner scanner;

    public void start() {
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
            String command = scanner.next();
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
                    return;
                default:
                    System.out.println("输入命令有误，请重新输入！");
            }
        }
    }

    private void listMovie() {
        System.out.println("=====查看电影=====");
        // 打印电影列表
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }

    /**
     * 添加电影
     * 根据电影名称查询电影
     */
    private void addMovie() {
        System.out.println("====上架电影====");
        Movie movie = new Movie();
        System.out.println("请输入电影名称：");
        movie.setName(scanner.next());
        System.out.println("请输入主演：");
        movie.setActor(scanner.next());
        System.out.println("请输入价格：");
        movie.setPrice(scanner.nextDouble());
        System.out.println("请输入电影评分：");
        movie.setScore(scanner.nextDouble());


    }

    private void queryMovie() {
        System.out.println("=====查看电影=====");
        System.out.println("请输入电影名称");
        String name = scanner.next();
        Movie movie = queryMovieByName(name);
        if (movie != null) {
            System.out.println(movie);
        } else {
            System.out.println("没有此电影");
        }


    }

    private Movie queryMovieByName( String name) {

        for (Movie movie : movies) {
            if (movie.getName().equals(name)) {
                return movie;
            }
        }
       return null;
    }

    private void updateMovie() {
        System.out.println("=====修改电影=====");
        System.out.println("请输入电影名称：");
        String name = scanner.next();
        Movie movie = queryMovieByName(name);
        if (movie != null) {

        }

    }

    private void deleteMovie() {

    }
}
