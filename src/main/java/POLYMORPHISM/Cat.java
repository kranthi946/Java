package POLYMORPHISM;

public class Cat  extends Animal{


    public static void main(String[] args) {
        Cat cat = new Cat();

        cat.makeNoise();
    }



    @Override
    public void makeNoise() {
System.out.println("I am a fish i wont make noise");


    }

}
