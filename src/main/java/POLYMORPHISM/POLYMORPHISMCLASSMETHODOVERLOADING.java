package POLYMORPHISM;

public class POLYMORPHISMCLASSMETHODOVERLOADING {



    // compile time  - method overloading  - early binding , static binding
    // run time poly morphism   - overriding   // late binding , dyanamic method dispatch



    // // compile time  - method overloading


    // we increase or decrease parameters


    //same method name but different signatures

    // early binding , static binding


    public void login(String s , String p ){

        System.out.println("login sucesfull using username and password");
    }


    public void login(String s ,int i , String p ){

        System.out.println("login sucesfull using username and password and phonenumber");
    }

    public void login(int s ,int i , String p ){

        System.out.println("login sucesfull using  int int and password");
    }








    public static void main(String[] args) {



        POLYMORPHISMCLASSMETHODOVERLOADING p = new POLYMORPHISMCLASSMETHODOVERLOADING();

        p.login("sds","sd");   // here it will take the method based on the parameters we passed here


   p.login(1,2,"asa");

    }



}
