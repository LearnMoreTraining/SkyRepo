package javabasics;

public class StaticMethodExample {

   static int a = 1;

    public static void main(String[] args) {

        StaticMethodExample.m2();
        StaticMethodExample sm = new StaticMethodExample();
        sm.m1();

    }

    public void m1(){
        int a = 500;
        System.out.println("a");
        System.out.println(a);
        System.out.println(this.a);
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
