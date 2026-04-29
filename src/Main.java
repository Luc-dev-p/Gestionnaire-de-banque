public class Main {
        public static void main(String[] args) {

            //Création d'un compte courant
            CheckingAccount courant = new CheckingAccount("CV-001", 1500.0, 500.0);

            // Création d'un compte d'épargne
            SavingsAccount epargne = new SavingsAccount("EP-002", 3000.0, 2.5);

            // Création d'un certificat de dépôt
            COD certificat = new COD("CD-003", 10000.0, 12);

            // TEST : Vérifier que les enfants ont bien hérité des attributs du parent
            System.out.println("--- COMPTE COURANT ---");
            System.out.println("Compte : " + courant.account);     // Hérité de BankAccount
            System.out.println("Solde : " + courant.balance);      // Hérité de BankAccount
            System.out.println("Limite : " + courant.limit);       // Propre à CheckingAccount

            System.out.println("\n--- COMPTE D'ÉPARGNE ---");
            System.out.println("Compte : " + epargne.account);
            System.out.println("Solde : " + epargne.balance);
            System.out.println("Taux : " + epargne.interestRate + "%"); // Propre à SavingsAccount

            System.out.println("\n--- CERTIFICAT DE DÉPÔT ---");
            System.out.println("Compte : " + certificat.account);
            System.out.println("Solde : " + certificat.balance);
            System.out.println("Durée : " + certificat.durationMonths + " mois"); // Propre à COD
        }

}
