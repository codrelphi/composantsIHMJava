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
 * - H�ritage
 * - Polymorphisme
 */

/* encapsulation: ce qui est � l'int�rieur est cach� pour l'ext�rieur. On acc�de aux
 * �l�ments de l'int�rieur <<QUE>> via des m�thodes d�finies.
 * ex: pour thomas pesquet, c'est la cam�ra/t�l�phone/visioconf�rence qui est le moyen de
 * communication avec l'ext�rieur
 * 
 */

/*
 *  Produit produit1 = new Produit(); // pour cr�er un objet // utilisation de construteur sans param�tre
 *  Produit produit2 = new Produit("01", "description", 2.0); // utilisation de constructeur avec param�tres
 */
// casser l'utilit� de POO
public class Produit {

	// attributs de la classe
	private String code;
	private String description;
	private double prix;
	
	private static final double PRIXINITIAL = 5;
	private static final String DESCRIPTIONINITIALE = "Non mentionn�e";
	
	// variable simple: variable
	// variable compos�e: variableComposee
	
	// constructeur par d�faut - abus de langage
	// r�ellement c'est le constructeur <sans param�tre>
	
	// en r�alit�, si c'est la jvm qui contruit l'objet (constructeur par d�faut), alors
	// il va assigner des <valeurs par d�faut> aux attributs
	// si c'est <int>, par d�faut, on aura: 0 (z�ro)
	// si c'est <float> => 0f (0.0 en flottant)
	// si c'est <double> => 0.0
	// si c'est <char> => ''
	// si c'est <String> (objet) => null (valeur par d�faut)
	
	// types primitifs: byte, short, int, long, float, double, boolean, char
	// type classe/complexe/compos� (ex: String)
	// exemple: int => �quivalent en type classe Integer
	// double => Double
	
	// m�thode divis� pour r�gner 
	// constructor = constructeur => construire => b�tir => cr�er 
	
	/*public Produit() {
		// this.code = "";
		// this.description = "";
		// this.prix = 0.0;
	}*/
	
	// NB: une fonction a un type de retour (ex: void, int, String, String[], etc.)
	// Mais un constructeur n'a pas de type de retour et le constructeur a le m�me nom que la Classe
	
	// constructeur sans parametre
	public Produit() {
		this.code = "C0";
		this.prix = PRIXINITIAL;
	}
	
	// constructeur avec 1 param�tre 
	public Produit(String pCode) {
		this.code = pCode;
		this.description = Produit.DESCRIPTIONINITIALE;
		this.prix = Produit.PRIXINITIAL;
	}
	
	
	
	// constructeur avec 2 param�tres 
	public Produit(String pCode, String pDescription) {
		this.code = pCode;
		this.description = pDescription;
		this.prix = Produit.PRIXINITIAL;
	}
	
	// constructeur avec tous les param�tres
	public Produit(String pCode, String pDescription, double pPrix) {
		this.code = pCode;
		this.description = pDescription;
		this.prix = pPrix;
	}
	
	// <this> signifie l'objet courant
	
	/* pour communiquer avec l'ext�rieur, on va utiliser
	 * les accesseurs et les mutateurs
	 * accesseurs ---> acc�der --> avoir: vont permettre d'acc�der � l'�l�ment
	 * mutateurs ---> mutation ---> muter ---> modifier: vont permettre de modifier l'�l�ment
	 * mutateurs = accesseurs en modification (acc�der pour modifier)
	 */
	
	// accesseurs et mutateurs de <code>
	// ce sont des m�thodes/fonctions: vous pouvez y faire des manipulations
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
		
		System.out.println("Constructeur avec " + nbr + " param�tres ");
		System.out.println("Code: " + pObjet.getCode());
		System.out.println("Description: " + pObjet.getDescription());
		System.out.println("Prix: " + pObjet.getPrix() + " Euros");
	}*/
	
	/*public void toString(int nbr) {
			
			System.out.println("Constructeur avec " + nbr + " param�tres ");
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
