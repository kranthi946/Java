package ENCAPSULATION;

public class CreateBox {


    public static void main(String[] args) {
    Common cb = new Common();

   /*  int h =    cb.height. = 10 ;
      int l  =   cb.length = 20 ;
                                           // before using private variables and getters and setter
     int w =    cb.width = 30 ;

     cb.setDimensionofBox(h,l,w);*/


        //after private getters and setter using


      int h =   cb.setHeight(20);

      int l =   cb.setLength(34);

       int w =  cb.setWidth(433);


       cb.setDimensionofBox(l,w,h);



    }
}











