package com.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class Launch1 {
    public  static  void main(String[] args){
        List<Integer>list = new ArrayList<>();
        List<Integer>l = Arrays.asList(10,20,30,40);
    }
    public static Iterable<Integer> getIntegers(){
//        return new ArrayList<Integer>();
//        return new TreeSet<Integer>();
//        return new TreeSet<Integer>();
        return new TreeSet<>();//why this is valid
    }
}

