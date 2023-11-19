package w9;

class BankAcc {
    private int accountNum;
    private int balance;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }


    public int getAccountNum() {
        return accountNum;
    }


    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

}
public class Qs12{
    public static void main(String[] args){
        BankAcc ba1=new BankAcc();
        ba1.setAccountNum(123233);
        System.out.println(ba1.getAccountNum());
        ba1.setBalance(1000);
        System.out.println(ba1.getBalance());
    }
}