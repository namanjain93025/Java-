import java.util.ArrayList;
import java.util.Objects;

class Student{
    int id;
    Student(int a){
        this.id =a;
    }
    @Override
    public String toString(){
        return "id  : "+id;
    }
}
class Abc <T>{
    T id ;
    public Abc(T i) {
        this.id = i;
    }

    public String toString(){
        return "id is  : "+id;
    }

}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        ArrayList<Student>al = new ArrayList();
        al.add(new Student(34));
        al.add(new Student(23));
        al.add((new Student(12)));
        for (Object c: al){
            System.out.println(c);
        }
        Abc a  = new Abc(12);
        Abc b  = new Abc(92);
        Abc c  = new Abc(82);
        System.out.println(a);

    }
}