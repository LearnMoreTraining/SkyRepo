package javabasics;

public class ConstructorExample {

   static int a ;

       public ConstructorExample(){
           a =1;
       }

        public ConstructorExample(int a){

           this.a = a;
     }

    public ConstructorExample(String a){

    }


    public static void main(String[] args) {

        ConstructorExample c = new ConstructorExample("lmti");
            System.out.println(a);
    }
}
