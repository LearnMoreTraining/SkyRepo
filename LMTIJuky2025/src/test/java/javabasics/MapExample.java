package javabasics;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {

        Map<Integer, String > m = new HashMap<Integer, String>();
        m.put(123,"abc");
        m.put(789, "xyx");
        m.put(123,"aravinth");

        System.out.println(m);

        System.out.println( m.get(123));
    }

}
