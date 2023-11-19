package w9;

class vehicle {
    public void drive() {
        System.out.println(" test vehicle.");
    }
}

class car extends vehicle {
    @Override
    public void drive() {
        System.out.println("Repairing a car.");
    }

    public static void main(String[] args) {
        car x = new car();
        x.drive();
    }
}
