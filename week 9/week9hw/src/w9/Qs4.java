package w9;

class Animal {
    public void move() {
        System.out.println("hiii");
    }
}

class Cheetah extends Animal {
    @Override
    public void move() {
        System.out.println("its cheetah");
    }

    public static void main(String[] args) {
        Cheetah c = new Cheetah();
        c.move();
    }
}





