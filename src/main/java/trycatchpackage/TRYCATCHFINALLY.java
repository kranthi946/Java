package trycatchpackage;

public class TRYCATCHFINALLY {


    public static void main(String[] args) {

        int i = 0 ;


        System.out.println("before division");

        try{
            System.out.println(i/0);
        }
        catch(Exception e){

            System.out.println(e.getMessage());

            System.out.println(e.getCause());
         e.printStackTrace();

        }
finally {
            System.out.println("This is finally block ");    // this statement always executed
        }





        System.out.println("AFTER DIVISION");


    }
}
