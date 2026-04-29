Gestionnaire Bancaire (Héritage POO)
Description
Application console démontrant le concept d'héritage en Java. Elle modélise une hiérarchie bancaire avec une classe parente BankAccount et trois classes enfants spécialisées (CheckingAccount, SavingsAccount, COD).

Concepts clés utilisés
Héritage (extends) : Les classes enfants héritent des attributs account et balance sans les redéclarer.
Mot clé super() : Appel des constructeurs parents pour initialiser les attributs communs.
Constructeurs paramétrés : Initialisation des attributs spécifiques à chaque classe.
Polymorphisme : Un objet enfant est manipulé via les attributs de son parent.

Comment lancer le projet ?
Clonez ce dépôt.
Ouvrez le projet dans IntelliJ.
Lancez la classe Main. La console affichera les informations des 3 types de comptes, prouvant que l'héritage fonctionne.
