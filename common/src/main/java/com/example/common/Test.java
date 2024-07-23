package com.example.common;

/**
 * description：TODO
 * time：2024/6/13 16:17
 * auther：zhaopengfei
 */
public class Test {
    public Test() {
        System.out.println("e");
    }
    private Test(Integer a){
        System.out.println("c");
    }
    {
        System.out.println("f");
    }
    static {
        System.out.println("b");
    }
    public static void main(String[] args) {
        Test test = new Test();
        System.out.println("a");
    }
}
