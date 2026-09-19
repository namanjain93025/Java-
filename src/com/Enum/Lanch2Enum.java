package com.Enum;
enum Result{
    PASS,FAIL,NR;
    //behind the seen
    //public static final Result PASS = new Result();
    //public static final Result FAIL = new Result();
    //public static final Result  = new Result();
  //
    //    enum Week{
////        MON,TUR;
//    }
    int marks ;
    Result(){
     System.out.println("Constructor of Enum");
    }
    public void setMarks(int marks){
        this.marks = marks;
    }
    public int  getMarks(){
        return marks;
    }
}

public class Lanch2Enum {
     public static void main(String[] args){
         Result result = Result.FAIL;
         result.setMarks(33);
         System.out.println(result.getMarks());
            /*
            * Constructor of Enum
Constructor of Enum
Constructor of Enum
 33
            * */
       int marks2 =  Result.PASS.getMarks();
        System.out.println(marks2);//0  in background every time class is created
    }
}
