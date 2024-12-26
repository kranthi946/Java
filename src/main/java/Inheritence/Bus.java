package Inheritence;

public class Bus extends  Truck{    // multi level , here truck already extends gobal vechile comman class so , if bus stends trucks it will get truck and vechile co,,on class properties also

// multi level inheritence

    public static void main(String[] args) {


        Bus bus = new Bus();

        bus.loadcapacity();

        bus.start();

        bus.stop();
    }
}
