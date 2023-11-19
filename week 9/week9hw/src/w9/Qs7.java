package w9;
class Vehicle1 {
    int speed=3;

    public void speedUp() {
        System.out.println("Current speed:"+speed);
    }
}

class Car1 extends Vehicle1 {
    @Override
    public void speedUp() {
        speed += 20;
        System.out.println("Current speed of car: " + speed);
    }
}

class Bicycle extends Vehicle1 {
    @Override
    public void speedUp() {
        speed += 5;
        System.out.println(" Current speed of bicycle: " + speed);
    }
}

public class Qs7 {
    public static void main(String[] args) {
        Car1 myCar = new Car1();
        Bicycle myBicycle = new Bicycle();
        Vehicle1 v1= new Vehicle1();
        v1.speedUp();
        myCar.speedUp();
        myBicycle.speedUp();
    }
}