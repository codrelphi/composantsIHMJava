package model;

/*
 * Produit
 * ----------------
 * - code: String
 * - description: String
 * - prix: double
 * ----------------
 * - getCode()
 * - setCode()
 */

/* OOP
 * - Classe / Objet
 * - Encapsulation --> Encapsuler ---> Capsule (capsule navette spatiale)
 * - Abstraction
 * - Héritage
 * - Polymorphisme
 */

/* encapsulation: ce qui est à l'intérieur est caché pour l'extérieur. On accède aux
 * éléments de l'intérieur <<QUE>> via des méthodes définies.
 * ex: pour thomas pesquet, c'est la caméra/téléphone/visioconférence qui est le moyen de
 * communication avec l'extérieur
 * 
 */

/*
 *  Produit produit1 = new Produit(); // pour créer un objet // utilisation de construteur sans paramètre
 *  Produit produit2 = new Produit("01", "description", 2.0); // utilisation de constructeur avec paramètres
 */
// casser l'utilité de POO
public class Produit {

	// attributs de la classe
	private String code;
	private String description;
	private double prix;
	
	private static final double PRIXINITIAL = 5;
	private static final String DESCRIPTIONINITIALE = "Non mentionnée";
	
	// variable simple: variable
	// variable composée: variableComposee
	
	// constructeur par défaut - abus de langage
	// réellement c'est le constructeur <sans paramètre>
	
	// en réalité, si c'est la jvm qui contruit l'objet (constructeur par défaut), alors
	// il va assigner des <valeurs par défaut> aux attributs
	// si c'est <int>, par défaut, on aura: 0 (zéro)
	// si c'est <float> => 0f (0.0 en flottant)
	// si c'est <double> => 0.0
	// si c'est <char> => ''
	// si c'est <String> (objet) => null (valeur par défaut)
	
	// types primitifs: byte, short, int, long, float, double, boolean, char
	// type classe/complexe/composé (ex: String)
	// exemple: int => équivalent en type classe Integer
	// double => Double
	
	// méthode divisé pour régner 
	// constructor = constructeur => construire => bâtir => créer 
	
	/*public Produit() {
		// this.code = "";
		// this.description = "";
		// this.prix = 0.0;
	}*/
	
	// NB: une fonction a un type de retour (ex: void, int, String, String[], etc.)
	// Mais un constructeur n'a pas de type de retour et le constructeur a le même nom que la Classe
	
	// constructeur sans parametre
	public Produit() {
		this.code = "C0";
		this.prix = PRIXINITIAL;
	}
	
	// constructeur avec 1 paramètre 
	public Produit(String pCode) {
		this.code = pCode;
		this.description = Produit.DESCRIPTIONINITIALE;
		this.prix = Produit.PRIXINITIAL;
	}
	
	
	
	// constructeur avec 2 paramètres 
	public Produit(String pCode, String pDescription) {
		this.code = pCode;
		this.description = pDescription;
		this.prix = Produit.PRIXINITIAL;
	}
	
	// constructeur avec tous les paramètres
	public Produit(String pCode, String pDescription, double pPrix) {
		this.code = pCode;
		this.description = pDescription;
		this.prix = pPrix;
	}
	
	// <this> signifie l'objet courant
	
	/* pour communiquer avec l'extérieur, on va utiliser
	 * les accesseurs et les mutateurs
	 * accesseurs ---> accéder --> avoir: vont permettre d'accéder à l'élément
	 * mutateurs ---> mutation ---> muter ---> modifier: vont permettre de modifier l'élément
	 * mutateurs = accesseurs en modification (accéder pour modifier)
	 */
	
	// accesseurs et mutateurs de <code>
	// ce sont des méthodes/fonctions: vous pouvez y faire des manipulations
	public String getCode() {
		/*String newCode = "C4";
		return newCode + code;*/
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	/*@Override
	public String toString() {
		return "Produit [code=" + code + ", description=" + description + ", prix=" + prix + "]";
	}*/
	
	/*public void toString(int nbr, Produit pObjet) {
		
		System.out.println("Constructeur avec " + nbr + " paramètres ");
		System.out.println("Code: " + pObjet.getCode());
		System.out.println("Description: " + pObjet.getDescription());
		System.out.println("Prix: " + pObjet.getPrix() + " Euros");
	}*/
	
	/*public void toString(int nbr) {
			
			System.out.println("Constructeur avec " + nbr + " paramètres ");
			System.out.println("Code: " + this.getCode());
			System.out.println("Description: " + this.getDescription());
			System.out.println("Prix: " + this.getPrix() + " Euros");
		}*/
	
	@Override
	public String toString() {
		
		System.out.println("Code:\t" + this.getCode());
		System.out.println("Description:" + this.getDescription());
		System.out.println("Prix:\t" + this.getPrix() + " Euros");
		
		return "";
	}
	
	
	
	/*
		elouaryaghli@hotmail.fr
		jmamar78@gmail.com
		sehili.nordine@gmail.com
		meriama.mokrani@gmail.com
		davidmalinen@outlook.com
		christian.lunge@gmail.com
		stephane.bottius@neuf.fr
		nkoloben@gmail.com
		moustakilalbi@laposte.net
	*/
	
	
	
	
}
