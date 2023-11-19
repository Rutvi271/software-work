package w9;

class Animals1{
    public void move(){
        System.out.println("");
    }

    public void makeSound(){
        System.out.println("");
    }
}
class Birds extends Animals1{
    public void move(){
        System.out.println("Birds fly");
    }

    public void makeSound(){
        System.out.println("bird chirp");
    }
}
class Panthera extends Animals1{
    public void move(){
        System.out.println("Panthera walks");
    }

    public void makeSound(){
        System.out.println("Hiss");
    }
}

public class Qs9{
    public static void main(String[] args) {
        Birds ani1 = new Birds();
        Panthera p1 = new Panthera();
        ani1.makeSound();
        ani1.move();
        p1.makeSound();
        p1.move();

    }
}