package javabasics;

public class ConstructorExample {

   static int a ;

       public ConstructorExample(){
           a =1;
       }

        public ConstructorExample(int a){
        a =1;
     }


    public static void main(String[] args) {

        ConstructorExample c = new ConstructorExample(2);
            System.out.println(a);
    }
}
