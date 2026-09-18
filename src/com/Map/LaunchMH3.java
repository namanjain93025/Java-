package com.Map;

import java.util.*;

class User{
     String name;
     Integer id;
    User(String s ,int i){
        this.id = i;
        this.name =s;
    }


}
public class LaunchMH3 {
    public  static void main(String[] args){
        HashMap<Integer,User> mp = new HashMap<>();
        User u1= new User("Naman",101);
        User u2= new User("Aman",102);
        User u3= new User("Ayush",103);
        User u4= new User("Darshan",104);

        Integer i1 = Integer.valueOf(1);
        Integer i2 = Integer.valueOf(2);
        Integer i3 = Integer.valueOf(3);
        Integer i4 = Integer.valueOf(4);

        mp.put(i1,u1);
        mp.put(i2,u2);
        mp.put(i3,u3);
        mp.put(i4,u4);

        System.out.println("Enter your id");
        Scanner scan = new Scanner(System.in);
        Integer uid = scan.nextInt();

        Set st=mp.entrySet();
        Iterator itr =st.iterator();
        boolean flag =false;
        while (itr.hasNext()){
            Map.Entry<Integer,User>e = (Map.Entry) itr.next();
//            System.out.println();
            if(e.getValue().id == uid){
                System.out.println("Hello user welcome to cell");
                flag =true;
                break;
            }

        }
        if(!flag){
            System.out.println("Wron user id ");
        }
    }
}
