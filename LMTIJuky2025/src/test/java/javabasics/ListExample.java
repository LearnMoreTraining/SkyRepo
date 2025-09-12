package javabasics;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>();
        l.add(55);
        l.add(78);
        System.out.println(l);
        l.add(90);
        l.add(700);
        System.out.println(l);
        l.add(55);
        System.out.println(l);
        l.add(700);
        l.add(0,59);
        System.out.println(l);

        System.out.println(l.get(0));

        for(int k:l){
            System.out.println(k);
        }
    }
}
