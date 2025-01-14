package com.sau.tech;

public class MyClass01 {

    public static void main(String[] args) {
        System.out.println("AAAA");
        met1();  // Call without arguments
        System.out.println("BBBB");
        met2();  // Call without arguments
    }
    public static void met2() {
        System.out.println(222);
    }
    public static void met1() {
        System.out.println(111);
    }
}
