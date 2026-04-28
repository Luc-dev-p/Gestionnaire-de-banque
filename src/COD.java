public class COD extends BankAccount {
    int durationMonths;

    public COD(String account, double balance, int durationMonths) {
        super(account, balance);
        this.durationMonths = durationMonths;
    }
}
