package ABSTRACTION;

public class CIRCLE extends Shapes{


@Override
    public  void colorshape(){

System.out.println("drawing CIRCLE");

    }

@Override
    public  void moveshape(){

    System.out.println(" moving CIRCLE");
    }

    public static void main(String[] args) {


    CIRCLE circle = new CIRCLE();

    circle.colorshape();

    }
}
