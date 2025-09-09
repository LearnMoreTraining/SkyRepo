package javabasics;

public class ExceptionExamples {

    public static void main(String[] args) {

        String name = "Learn More Trainings";
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.trim());
        System.out.println(name.substring(6,10));
        String productValue = "139";
        System.out.println(productValue.replace("₹","t"));
        System.out.println(productValue.replace("₹",""));
        int Quantity = 2;
        try{
           int val = Integer.parseInt(productValue);
            System.out.println(val * Quantity);
        }
        catch(NumberFormatException e){
            int val = Integer.parseInt(productValue.substring(1));
            System.out.println(val * Quantity);
        }




    }
}
