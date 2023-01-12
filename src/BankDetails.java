public interface BankDetails {
    String AddMoney ( int amount) ;
    String CheckBalance ( String password) ;
    String WithdrawMoney ( int Money , String password );
    Double CalculateInterest ( int Years ) ;
}
