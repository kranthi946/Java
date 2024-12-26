package org.Super;

public class Child extends Parent {



    String empName = "bob";  // Child class field, will shadow Parent's empName
    int empNo = 23232332;


    public Child(){

        // by default the child class having default super class constructor which calls parent class

    }




    public Child(String empName, int empNo) {

        super(empName,empNo);//This will call parent constructor

    System.out.println("Child Constructor with parameters");

    }
    public void getData() {     // this method is non  - static so , super will works , if it static super wont work
        super.getData();  // Calls Parent's getData method
        System.out.println("Data from Child: " + super.empName); // Accessing the Child's empName
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.getData();  // This will call getData in Child, which also calls getData in Parent

        // Accessing Child class's empNo
        System.out.println("Employee No from Child: " + c.empNo);



    }
}
