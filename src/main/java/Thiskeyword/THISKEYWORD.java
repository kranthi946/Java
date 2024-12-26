package Thiskeyword;

public class THISKEYWORD {


    int x  ;

    int y ;
    String s = "kranthi";



public THISKEYWORD() {

    System.out.println("THISKEYWORD   DEAFULT");
}

    public THISKEYWORD(int x , int y ) {


   this.x = x ;
    this.y = y ;

    System.out.println("parameterised constructor values adding" + (x+y));

        System.out.println("THISKEYWORD   PARAMETERISED");
    }


    public static void main(String[] args) {


      //  THISKEYWORD obj = new THISKEYWORD();

       // obj.getData();



       // THISKEYWORD obj2 = new THISKEYWORD(5,9);


      //  obj.getData();



        THISKEYWORD obj3 = new THISKEYWORD(5,9);  //  suppose in globally the values are not iniitalised then , we have to make sure these values are initialised in constructor using this.x = x


          obj3.getData2();
    }



    public void getData(){
  // here local variable given preference not global variable
        int x = 50 ;
        int y = 45;
System.out.println("without this key word: " + (x + y));   // local variable
System.out.println("with this key word: " + (this.x + this.y));  //global variable

this.getData1();   // implicilty this key word is added so we can call simply getData1();


    }

    public void getData1(){
        // here local variable given preference not global variable
        int x = 50 ;
        int y = 45;
        System.out.println("without this key word: " + (x + y));   // local variable
        System.out.println("with this key word: " + (this.x + this.y));  //global variable




    }


    public void getData2(){


        System.out.println("with this key word: " + (this.x + this.y));  //global variable




    }





}
