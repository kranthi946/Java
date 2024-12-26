package org.Super;

public class Parent {
String empName = "kranthi";

  int empNo = 23232;



  public Parent(){

      System.out.println("Parent Constructor");
  }


  public Parent(String empName, int empNo){
      System.out.println("Parent Constructor with parameters" );

  }
public  void getData(){


    System.out.println("parent" + empName);
    System.out.println("parent" + empNo);





}


}
