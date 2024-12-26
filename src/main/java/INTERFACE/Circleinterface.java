package INTERFACE;

public class Circleinterface  implements  Shapes{

//we cqant instaitate interface
    // we should implemented the implements class methods



    @Override
    public void drawshape() {
        System.out.println("Circle Draw Shape");
    }

    @Override
    public void moveshape() {
System.out.println("Circle Move Shape");
    }


    public static void main(String[] args) {
        Circleinterface circle = new Circleinterface();
        circle.drawshape();
    }
}
