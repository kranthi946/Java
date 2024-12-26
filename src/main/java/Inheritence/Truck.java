package Inheritence;

public class Truck  extends Vechilecommon {


// single in heritence

    public  void loadcapacity(){

        System.out.println("Load capacity");
    }

    public static void main(String[] args) {


        Truck truck = new Truck();

        truck.start();
        truck.stop();

    }
}
