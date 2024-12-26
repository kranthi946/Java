package FinalPackage;

public final class Parent { // class level we cant inherit this class
String empName = "kranthi";

  int empNo = 23232;

public final   int i = 20 ;   // variable level

  public Parent(){

      System.out.println("Parent Constructor");
  }


  public final   void setData(){   // method level

      System.out.println("setData : "+ i);
  }




}
