package javabasics;

public class StaticMethodExample {

   static int a = 1;

    public static void main(String[] args) {

        StaticMethodExample.m2();
        System.out.println(a);

    }

    public void m1(){
        System.out.println("a");
        System.out.println(a);
    }

    public static void m2(){
        System.out.println("b");
        System.out.println(a);
    }

    public void m3(){
        System.out.println("a");
        System.out.println(a);
    }
}
