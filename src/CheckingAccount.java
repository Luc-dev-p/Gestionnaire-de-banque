public class CheckingAccount extends BankAccount {
        double limit;
        //Construction de l'enfant 1
        public CheckingAccount(String account, double balance, double limit) {
            super(account, balance); // LA LIGNE LA PLUS IMPORTANTE !
            this.limit = limit;
        }
}
