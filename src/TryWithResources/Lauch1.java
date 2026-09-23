package TryWithResources;
class Alien implements AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("Application Closed here---");
    }


}
public class Lauch1 {
    public static void main(String[] args){
        try(Alien a =new Alien()){
            System.out.println("inside try block");
        }catch (Exception e){

        }
    }
}
/*
* inside try block
Application Closed here-
* */
