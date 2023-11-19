package w9;

class Employee {

    double baseSalary;

    public double calculateSalary() {

        return 0;
    }
}
class Manager extends Employee{
    public double calculateSalary() {
        baseSalary = 50000;
    return baseSalary;
    }
}

class Programmer extends Employee {
    public double calculateSalary() {
        baseSalary = 30000;
        return baseSalary;
    }
}

public class Qs8 {
    public static void main(String[] args) {
       Manager s1=new Manager();
       Programmer s2=new Programmer();
       System.out.println(s1.calculateSalary());
        System.out.println(s2.calculateSalary());    }
}