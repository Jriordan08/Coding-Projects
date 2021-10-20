public class BankAccount {
    //instance variable represent the state of any BankAccount object
    private double balance;         // 8 bytes
    private String name;            // atleast 8 bytes
    private String ssnum;           // atleast 8 bytes
    private double lastDeposit;     // 8 bytes
    private double lastWithdrawl;   // 8 bytes

    //constructor
    public BankAccount(String name,String ssnum,double initialDeposit){
        this.name = name;
        this.ssnum = ssnum;
        this.balance = initialDeposit;
    }



    //behaviors or methods
    public  double deposit(double amt){
        if (amt>0)
            balance += amt;
        else 
            System.out.println("Insufficent funds");
        lastDeposit = amt;
        return balance;
    }

    public  double withdrawl(double amt){
        if (balance>amt)
            balance -= amt;
        else 
            System.out.println("Insufficent funds");
        lastWithdrawl = amt;
        return balance;
    }

    public  double checkBalance(){
        return balance;
    }

    public  void accountInfo(){
       System.out.println(name + " has a balance of " + balance);
    }
   
   // testing methods
    public static void main(String[]args){
        BankAccount jarred = new BankAccount("Jarred" , "100-08-0956", 100.57);   //alteast 40 bytes 
        jarred.accountInfo();
        jarred.deposit(100);
        jarred.accountInfo();
        jarred.withdrawl(67);
        jarred.accountInfo();
    }
}