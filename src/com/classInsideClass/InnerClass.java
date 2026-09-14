package com.classInsideClass;

class Person{

    public void primeName(){
        System.out.println("Suresh");
    }
    class Phone{
        public void details(){
            System.out.println("onePlus");
        }
    }
}
class A{
    void show(){
        System.out.println("In A show");
    }
    public void display(){
        System.out.println("Annonymous inner class, i can be used ony once");
    }
}
class B extends A{
    void show(){
        System.out.println("In B show");
    }
}
public class InnerClass {
    public static void main(String[] args){ //we cant create dieratly obect of inner class
        //we do  this if we want to restrict class scope within class
        //we cant make our class static but can make inner class static
        //
//        // if inner class declared as static
//        Person obj = new Person();
//        Person.Phone ph = new Person.Phone();
//        ph.details();

//        // non static innner clas
//        Person obj = new Person();
//        Person.Phone ph = obj.new Phone();
//        ph.details();


        //```````````Annonymous inner  class ***********************************
        A ooject = new A(){
           public void show(){
               System.out.println("Annonymous inner class, i can be used ony once");
           }
            public void display(){
                System.out.println("Annonymous inner class, i can be used ony once");
            }
            public void getData(){
                System.out.println("Annonymous inner class, i can be used ony once");
//                return null;
            }
        };
        ooject.show();
        ooject.display();
//        ooject.getData(); gives error

        new B().show(); //annonymous object

        new A(){
            public void show(){
                System.out.println("Annonymous inner class, i can be used ony once");
            }
            public void display(){
                System.out.println("Annonymous inner class, i can be used ony once");
            }
            public void getData(){
                System.out.println("Annonymous inner class, i can be used ony once");
//                return null;
            }
        }.getData();
    }
}
