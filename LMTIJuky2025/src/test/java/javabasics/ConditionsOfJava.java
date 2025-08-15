package javabasics;

public class ConditionsOfJava {

    public static void main(String[] args) {

        int a = 12 ;

        if(a > 50){
            System.out.println("a is greater than 50");
        }
        else{
            System.out.println("a is less than 50");
        }

        String nameOne = "LMTI" ;
        String nameTwo = "LMTI" ;
        if(nameOne.equals(nameTwo)){
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }

    }
}
