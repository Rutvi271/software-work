package encapsulation26;

 class Encapsulate {


    private String name;

    private int rollNo;
    private int age;

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getRollNo() {
        return rollNo;
    }


    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    // get method for age to access private variable age
    public int getAge() {
        return age;
    }

    // set method for age to access private variable age
    public void setAge(int age) {
        this.age = age;
    }

    public class TestEncapsulation {
        public static void main(String[] args) {
            Encapsulate obj = new Encapsulate();
// setting values of the variables
            obj.setName("Bhavesh");
            obj.setAge(19);
            obj.setRollNo(51);

// Displaying values of the variables
            System.out.println("CodeBusters name: " + obj.getName());

            System.out.println("CodeBuster age: " + obj.getAge());

            System.out.println("CodeBuster rollNo: " + obj.getRollNo());


        }
    }
}