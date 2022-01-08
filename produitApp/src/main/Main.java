package main;

import model.Produit;

import java.util.Scanner;
import java.util.List;
import java.util.Locale;
import java.util.ArrayList;


// import model.*; // importer plusieurs classes en m�me temps

public class Main {

	// Charles: une classe est un moule qui permet de cr�er des objets (Conventionel)
	// Meriem: classe = attributs + m�thodes
	// Classe = Type
	// visibilit�: public, private, protected
	// JVM = Java Virtual Machine
	// new = est un op�rateur pour cr�er un objet (en se basant sur son contructeur) (espace m�moire est r�serv�)
	
	// EDI = Environnement de D�veloppement Int�gr�, ex: VS Code (Microsoft, open source)
	// Eclipse, Netbeans, etc... --> clicker pour faire compilation + ex�cution
	// EDI (IDE en anglais) c'est juste un �diteur de texte avec plus de fonctionnalit�s
	
	// Editeur de texte: Sublime Text, Atom, Nodepad++
	// Ex�cuter une commande1 pour faire la compilation
	// Ex�cuter une commande2 pour faire l'ex�cution
	
	// java 7
	// compilation (g�n�re du bytecode): javac  programme.java  ===> g�n�re programme.class (bytecode)
	// ex�cution (transforme bytecode en code machine): java programme
	// programme.java --> programme.class (bytecode) ---> langage binaire (suite de 0, 1) code machine
	
	// � partir de java 8, 
	// version LTS actuelle de Java: 17
	// compilation + ex�cution: java programme.java
	
	// m�thode static: peut �tre utilis�e sans cr�er un objet
	
	// En Java, une m�thode (ou une fonction) a toujours un type de <retour>
	// void: ne retourne rien ==> une proc�dure
	// type de base de java: byte, short, int, long, float, double, char, boolean, String
	// type complexe (ou compos�): une classe
	
	// ------------------------------------------------------------------------------
	// SDK = Software Development Kit (= Kit de D�veloppement Logiciel/Applicatif)
	// JDK (SDK de Java) = Java Development Kit (= Kit de D�veloppement Java)
	
	// Runtime = Run (= courir/ex�cuter) time (= temps)
	// Java 1 � 10: JRE, JDK
	// LTS: Java 6, Java 7, Jave 8, Java 11
	// JRE = Java Runtime Environment (= Environnement d'Ex�cution Java)
	// JDK est utilis� pour le d�veloppement de programme Java (C'est le programmeur qui l'installe)
	// JRE est utilis� pour l'utilisation de programme Java (C'est sur la machine de l'utilisateur du programme Java)
	// JDK = JRE + outils qui facilitent la programmation
	// JVM = Java Virtual Machine (= Machine Virtuelle de Java)
	// le fichier de JRE p�se plus que celui du JDK (espace m�moire / performance)
	
	
	// En Java: phase de compilation et phase d'ex�cution
	// A la phase de compilation: v�rification des erreurs synthaxiques 
	// A la phase d'ex�cution: �valuation du c�t� s�mantique
	//   
	// Exemple (Acad�mie francaise): Je vais partir me r�veiller.
	// <Synthaxique>: respect des r�gles pr�-�tablies
	// R�gle de phrase: correcte
	// Regle de phrase -mots (espace): correcte
	// R�gle signification mots (dictionnaire francais): correcte
	// <S�mantique> - le c�te <logique>
	// logique: cette phrase est fausse
	
	
	//------------------------------------------------------------------------------
	//JShell (Java Shell) � partir de Java 9 pour faire du <Read-Evaluate-Print Loop (REPL)>
	// entrer <jshell>
	// quitter </exit>
	
	// Question: Quand utiliser jshell par rapport � Editeur de texte/IDE ?
	// David + Jean-Michel: pour les petites op�rations et les tests
	
	// En r�sum�:
	// - � partir de java 9, on peut utiliser jshell pour des op�rations rapides ou faire des tests
	// - � partir de java 10, var est un mot cl� ==> pour l'inf�rence de type (type inference) (inspir� de JavaScript)
	// nb: var n'est pas vraiment un type de donn�es Java. il fait juste l'inf�rence de type (d�terminer 
	// le type de la variable de mani�re dynamique
	
	// -----------------------------------------------------------------------------
	// C'est bien d'avoir � port�e de mains la documentation Java (javadoc)
	// -----------------------------------------------------------------------------
	//

	
	/* attributs de la classe Main */
	private static Scanner lectureClavier;
	
	
	public static String infoCours() {
		return "Bienvenue au cours <D�velopper des composants de la couche de pr�sentation IHM";
	}
	
	
	// se retrouve au niveau de la classe principale (l'entr�e du programme/application)
	public static void main(String[] args) {
		
		//JVM: compteur1 ==> infoCours(), etc.. 
		//Compteur compteur1 = new Compteur();
		//String message = compteur1.infoCours();
		String message = Main.infoCours();
		System.out.println(message);
		
		System.out.println("\nNombre de caract�re du message: " + message.length());
		
		if (message.length() < 50) {
			System.out.println("\nMessage de bienvenue inf�rieur � 50 caract�res. \n");
		}
		else {
			System.out.println("\nMessage de bienvenue sup�rieur � 50 caract�res.\n");
		}
		
		String msg = "trois";
		
		switch(msg) {
			case "zero":
				System.out.println("Message 0: " + msg);
				break;
			case "un":
				System.out.println("Message 1: " + msg);
				break;
			case "deux":
				System.out.println("Message 2: " + msg);
				break;
			case "trois": 
			case "quatre":
				System.out.println("Message 3 ou 4: " + msg);
				break;
			default:
				System.out.println("Message non obtenu !");
				
		}
		
		System.out.println("\nComptons de 1 � 5: ");
		
		// boucle for
		/*for (int cpt = 1; cpt <= 5; cpt++) {
			System.out.println(cpt);
		}*/
		
		// boucle while
		/*int cpt = 0;
		while (cpt < 5) {
			cpt++; // cpt = cpt + 1 incr�mentation
			System.out.println(cpt);
		}*/
		
		// boucle do .. while
		
		int cpt = 0;
		do {
			cpt++;
			System.out.println(cpt);
		} while (cpt < 5);
		
		/****************** Manipulation de l'objet Produit **************/
		
		System.out.println("\n************ Manipulation de PRODUIT ********\n");
		
		// Utilisation du construteur sans param�tre 
		Produit p0 = new Produit(); // Produit(code, description, prix)
		System.out.println("Constructeur avec 0 param�tre ");
		System.out.println("Code: " + p0.getCode());
		System.out.println("Description: " + p0.getDescription());
		System.out.println("Prix: " + p0.getPrix() + " Euros");
		
		System.out.println(""); 
		
		// Utilisation du constructeur avec 1 param�tre
		System.out.println("Constructeur avec 1 param�tre ");
		Produit p1 = new Produit("F1");
		p1.toString();
		//p1.toString(1);
		//p1.toString(1, p1);
		/*System.out.println("Constructeur avec 1 param�tre ");
		System.out.println("Code: " + p1.getCode());
		System.out.println("Description: " + p1.getDescription());
		System.out.println("Prix: " + p1.getPrix() + " Euros");*/
		
		System.out.println(""); 
		
		System.out.println("Constructeur avec 2 param�tres ");
		// Utilisation du constructeur avec 2 param�tres
		Produit p2 = new Produit("M33", "Cosm�tique pour jolie femme");
		p2.toString();
		//p2.toString(2);
		
		System.out.println(""); 
		
		System.out.println("Constructeur avec 3 param�tres ");
		// Utilisation du constructeur avec 3 param�tres
		Produit p3 = new Produit("N4", "C'est Nordine", 16000);
		p3.toString();
		//p3.toString(3);
		//p3.toString(3, p3);
		/*System.out.println("Constructeur avec 3 param�tres ");
		System.out.println("Code: " + p3.getCode());
		System.out.println("Description: " + p3.getDescription());
		System.out.println("Prix: " + p3.getPrix() + " Euros");*/
		
		//System.out.println("\n" + p3.toString());

		System.out.println("========================================");
		
		System.out.println("\nBienvenue dans l'application <Gestion de Produits>\n");
		System.out.println("COMMANDES DU MENU");
		System.out.println("liste\t - Liste tous les produits");
		System.out.println("ajoute\t - Ajoute un produit");
		System.out.println("suppr\t - Supprime un produit");
		System.out.println("aide\t - Affiche ce menu");
		System.out.println("quitter\t - Quitte l'application");
		System.out.print("\nEntrer une commande: ");
		
		lectureClavier = new Scanner(System.in);
		
		// pour avoir 14.5 � l'�ntr�e clavier au lieu de 14,5
		lectureClavier.useLocale(Locale.US); // Locale.ENGLISH
		
		String choix = lectureClavier.next();
		choix = choix.toLowerCase(); // transformer en minuscule
		//System.out.println("\nVotre choix: " + choix);
		
		
		List<Produit> produits = new ArrayList<Produit>();
		produits.add(p0);
		produits.add(p1);
		produits.add(p2);
		produits.add(p3);
		
		switch (choix) {
			case "liste":
				System.out.println("LISTE DES PRODUITS\n");
				if (produits.isEmpty()) {
					// la liste <Produits> est vide
					System.out.println("Il n'y a aucun produit en stock !");
				}
				else {
					// boucle for
					/*for (int i =0; i < produits.size(); i++) 
					{}*/
					
					// for pour parcourir des objets
					for (Produit p : produits) {
						p.toString();
						System.out.println();
					}
				}
				// autres choses
				break;
			case "ajoute":
				System.out.println("AJOUTER UN PRODUIT\n");
				// Produit (code, description, prix)
				System.out.print("Code du produit ?: ");
				String uCode = lectureClavier.next(); // avoir un mot
				
				System.out.print("Description du produit ?: ");
				String uDescription = lectureClavier.nextLine();
				lectureClavier.nextLine();
				System.out.print("Prix du produit ?: ");
				double uPrix = lectureClavier.nextDouble();
				
				
				Produit tmpProduit = new Produit(uCode, uDescription, uPrix);
				try {
					produits.add(tmpProduit);
				}
				catch (Exception e) {
					System.out.println(e.getMessage());
				}
				
				System.out.println("Prix finale: " + uPrix);
				System.out.println("\nLe produit a �t� bien ajout�");
				
				
				break;
			case "suppr":
				System.out.println("Supprimer un produit");
				// autre chose
				break;
			case "aide":
				System.out.println("Aide***");
				// autre chose
				break;
			case "quitter":
				System.out.println("Quitter - au revoir !");
				// autre chose
				break;
			default:
				System.out.println("SVP: Veuillez faire un choix !");
		}
	}


	private static Locale Locale(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
