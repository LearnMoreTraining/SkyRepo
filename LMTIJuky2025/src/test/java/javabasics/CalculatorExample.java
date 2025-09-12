package javabasics;

public class CalculatorExample  {

    public static void main(String[] args) {

        int a = 500 ;
        int b = 70 ;
        String operator  = "-";

        if(operator.equals("+")){
            System.out.println( a + b);
        }
        else if(operator.equals("-")){

            if( a > b){
                System.out.println( a - b);
            }
            else{
                System.out.println( b -a);
            }
        }
        else if(operator.equals("*")){
            System.out.println(a * b);
        }
        else if(operator.equals("/")){
            System.out.println( a / b);
        }
        else{
            System.out.println("enter the valid operator");
        }


    }
}
