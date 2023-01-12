import java.util.UUID;

public class BankProcess implements  BankDetails {
    private int Balance ;
    private String Name ;
    private String password ;
    private double RateOfInterest ;
    private String AccountNo ;

    public BankProcess(int balance, String name, String password) {
        Balance = balance;
        Name = name;
        this.password = password;
        AccountNo = String.valueOf(UUID.randomUUID()) ;
        RateOfInterest = 5 ;
    }

    public int getBalance() {
        return Balance;
    }


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setBalance(int balance) {
        Balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getRateOfInterest() {
        return RateOfInterest;
    }

    public void setRateOfInterest(double rateOfInterest) {
        RateOfInterest = rateOfInterest;
    }

    public String getAccountNo() {
        return AccountNo;
    }

    public void setAccountNo(String accountNo) {
        AccountNo = accountNo;
    }

    @Override
    public String AddMoney(int amount) {
        Balance += amount ;
        return amount+ " rs Amount added into your Account & updated Balance is : "+Balance ;
    }

    @Override
    public String CheckBalance(String password1) {
        if ( password1.equals(password)){
            return "Your Balance is : "+Balance ;
        } else {
            return "Wrong Password" ;
        }
    }

    @Override
    public String WithdrawMoney(int Money , String password1 ) {
        if ( password.equals(password1)){
            if ( Balance >= Money){
                Balance -= Money ;
                return "After withdraw "+Money+" ammount , Now updated Balance is :"+Balance ;
            } else {
                return "Insufficient Fund , Initially you have to add Balance to your Account" ;
            }
        } else {
            return "Wrong Password , Please try with currect Password" ;
        }
    }

    @Override
    public Double CalculateInterest(int Years) {
        Double interest = ( Balance*Years*RateOfInterest) / 100 ;
        return interest ;
    }
}
