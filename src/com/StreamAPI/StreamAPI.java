package com.StreamAPI;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args){
        ArrayList<Integer>al = new ArrayList<>();
        al.add(30);
        al.add(20);
        al.add(10);
        al.add(42);
        al.add(8);
        Stream<Integer>stream1 =al.stream().sorted().map(n->2*n);
        stream1.forEach((n)->System.out.println(n));
    }
}
