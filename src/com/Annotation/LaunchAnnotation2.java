package com.Annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface CricketPlayer{
        String country() default "India";
        int age()default 34;
}
//@ this specifies the compiler annotation is creatd
//@CricketPlayer(country = "India",age = 35)
//@CricketPlayer(country = "India")
@CricketPlayer()
//virat kohli is a creiccketer who lives in india and play for india this class if for him
class ViratKohli{
//    @CricketPlayer
    private int innings;
    public ViratKohli(){

    }
    public int getInnings(){
    return innings;
    }
    public void setInnings(int innings){
        this.innings =innings;
    }
}
public class LaunchAnnotation2 {
    public static void main(String[] args){
        ViratKohli vk  =  new ViratKohli();
        vk.setInnings(223);
        //***********************************
        Class<? extends ViratKohli> c=vk.getClass();
        Annotation an = c.getAnnotation(CricketPlayer.class);
        CricketPlayer cp = (CricketPlayer)an;
        int age = cp.age();
        String co = cp.country();
        System.out.println("Info of atrib of annotation "+age+" "+co );

    }
}
