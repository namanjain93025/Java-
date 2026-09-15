package com.Array;

import java.util.Arrays;

public class LaunchArray1 {
    public static void main(String[] args){

        int []marks = new int[5];
        int [][]arr = new int[5][4];
        System.out.println(marks);//this will store the address
        System.out.println(marks.getClass().getName());//class name
        //[I@27716f4
        //[I

        System.out.println(arr);//this will store the address
        System.out.println(arr.getClass().getName());//class name
        //[[I@8efb846
        //[[I

        int array[] = {8,43,2,5};
        Arrays.sort(array);

        for(int it: array){
            System.out.println(it);
        }
    }
}
