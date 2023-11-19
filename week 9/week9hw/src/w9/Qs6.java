package w9;

class animals {
    public void Sound() {
        System.out.println("Animal sound.");
    }
}

class Bird extends animals {
    @Override
    public void Sound() {
        System.out.println("Bird chirps.");
    }
}

class Cat extends animals {
    @Override
    public void Sound() {
        System.out.println("Cat meows.");
    }

    public static void main(String[] args) {
        animals ani = new animals();
        Bird b = new Bird();
        Cat c = new Cat();

        System.out.println("Generic Animal Sound:");
        ani.Sound();

        System.out.println("\nBird Sound:");
        b.Sound();

        System.out.println("\nCat Sound:");
        c.Sound();
    }
}