package javabasics;

public class VaraibleExamples {

    int g = 700 ; //Global variable
    String h ;

    public void m1(){
        int a = 1;
        System.out.println(a); // 1
        System.out.println(g);
        h = "abc";
        System.out.println(h);
    }


    public void m2(){
        String name = "lmti";  //local variable
        System.out.println(name);
        System.out.println(g);
        System.out.println(h);
    }


}
