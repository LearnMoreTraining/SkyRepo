package javabasics;

public class Loops {

    public static void main(String[] args) {

        int [] b = {7,1,4,9,10 ,12};

        for(int j:b){
            System.out.println(j);
        }

        for(int h=0 ; h < b.length ; h++ ){

            System.out.println(b[h]);
        }

        String [] p = {"lmti","learnmore","LMTI"};

        for(String d:p){
            System.out.println(d);
        }

        for(int k = 0 ; k < p.length ; k++){

            System.out.println(p[k]);
        }

    }

}
