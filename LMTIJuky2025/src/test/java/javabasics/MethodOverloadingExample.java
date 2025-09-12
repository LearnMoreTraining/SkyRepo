package javabasics;

public class MethodOverloadingExample {

    public static void main(String[] args) {

        MethodOverloadingExample overloadingExample = new MethodOverloadingExample();
        overloadingExample.m1(7,8);
    }

    public void m1(int a){

    }

    public void m1(String a){

    }

    public void m1(int b, int c){

    }

    public void m1(int h , String f){

    }
}
