package javabasics;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {

        Set<Integer> s = new HashSet<>();
        s.add(67);
        s.add(89);
        s.add(99);
        System.out.println(s);

    }
}
