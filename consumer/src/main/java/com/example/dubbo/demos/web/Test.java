package com.example.dubbo.demos.web;

import java.util.*;

/**
 * description：TODO
 * time：2023/7/29 14:27
 * auther：zhaopengfei
 */
public class Test {

    public static void main(String[] args) {
        "1".equals("1");
        Integer integer = 12;
        integer.equals(12);
        Map map = new HashMap<>();
        Object put = map.put("1", 2);
        Object put1 = map.put("1", 2);

        map.get("1");
        System.out.println(put);
        System.out.println(put1);

        Object object = "efefef";
        int i = object.hashCode();
        int x = object.hashCode();
        System.out.println(i);
        System.out.println(x);

        map.equals(object);

        Set<String> set = new HashSet();
        set.add("Java");
        set.add("Java");
        set.add("MySQL");
        set.add("MySQL");
        set.add("Redis");
        System.out.println("Set 集合长度:" + set.size());
        System.out.println();
        // 打印 Set 中的所有元素
        set.forEach(d -> System.out.println(d));

//        Objects.hash()

    }
}
