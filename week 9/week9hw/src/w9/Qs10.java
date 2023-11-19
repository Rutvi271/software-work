package w9;

class BankAccounts {

    public void deposit(){

    }

    public void withdraw(){
        System.out.println("your default withdraw limit is 300");

    }
}
class SavingsAccount extends BankAccounts{
    @Override
    public void withdraw() {
        System.out.println("your withdraw limit is 100");
    }
}

class CheckingAccount extends BankAccounts {
    @Override
    public void withdraw() {
        System.out.println("your limit is 50");
    }
}


public class Qs10 {
    public static void main(String[] args) {
        SavingsAccount sa1=new SavingsAccount();
        CheckingAccount ca2=new CheckingAccount();
    sa1.withdraw();
    ca2.withdraw();}
}