package com.String;

public class LaunchStringclass1 {
    public  static  void main(String[] args){
     //string in java  are immutable , this mean if we can make any changes inn the same object id anty changes is made
        // that the new string object will be created
        //this is referencing to string constant pool
        String s = "Naman ";
        System.out.println(s);//Naman
        //this is ref to heap memory
        String str = new String("Naman");
        System.out.println(str);//Naman
        //here str and s are referance but still giving String val this mean that toString method of obj class is overridden by String class

        System.out.println(s==str);//hence  both are ref to diff locations
        s  = s+" jain" ;
        System.out.println(s);// the new meory is allocated on heap as wll as string constant pool , but ref is pointing to heap addres
        String str2 = "jain Naman";//the memort is allocated on string consatant pool
        System.out.println(str2==s);//Naman

        String  t  = "Telusko";
        String  s2 = new String(" Java");
        String s3 = "Telusko Java";//string constant pool
        String s4 = t+s2;//heap
        String s5 = t.concat(s2);//heap
        //here ref are being comparred
        System.out.println(s5==s3);//false;
        System.out.println(s4==s3);//false
        System.out.println(s4==s5);//false

        //here char are compared
        System.out.println(s5.equals(s3));//t;
        System.out.println(s4.equals(s3));//t
        System.out.println(s4.equals(s5));//t
    }
}
