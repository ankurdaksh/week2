package Assignment;



public class Bank extends Interest{

    private String bankName;
    private double month;
    private double amount;

    public  Bank(String bankName, double month, int amount){
        this.bankName = bankName;
        this.month = month;
        this.amount = amount;
    }

    @Override
    public double calculateInterest() {
        double rate = 0.05;
        return amount *month* rate/100;
    }
}
