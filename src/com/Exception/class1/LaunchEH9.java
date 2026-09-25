package com.Exception.class1;

import java.io.IOException;
import java.sql.SQLException;

class X1{
    public void x()  throws  InterruptedException//Exception//InterruptedException    only parent of check exception or
    {
        System.out.println("this is x");
    }
}
class Y1 extends X1{
    public void x() throws ArithmeticException {
        System.out.println("this is class  y");
    }
}
class Z1 extends X1{
    public void x() throws InterruptedException {
        System.out.println("this is class  Z");
    }
}
class V1 extends X1{
    public void x(){
        System.out.println("this is function v");
    }
}
public class LaunchEH9 {

    public static void main(String[] args) throws Exception{
        Y1 y=new Y1();
        X1 x1=new Y1();
        y.x();
        x1.x();
    }
}
