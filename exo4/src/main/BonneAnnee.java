package main;

public class BonneAnnee {

	public static void main(String[] args) {
		
		for (int i=10; i>0; i--) {
			
			// i++ => i = i + 1 (incrémentation avec un pas (step en anglais de 1)
			// i-- => i = i - 1 (décrémentation avec un pas de 1
			// i = i + 2
			
			System.out.println(i); // print on line (affichage sur une ligne) / retour à la ligne
			// affichage simple => .print()
			
			// le système doit attendre 1 seconde
			// 1 thread = 1 fil (francais) 
			// 1 second = 1000 milliseconds
			
			// c'est possible de créer ou personnaliser les classes exceptions 
			// en bref: on doit traiter les exceptions dans l'odre des instructions
			int calcul; 
			
			// pourquoi réinventer la roue // on the shoulders of giants (sur les épaules de géants)
			try {
				Thread.sleep(1000); // 1 second
				calcul = 1/0;
				
			} 
			/*catch (Exception e) {
				System.out.println(e.getMessage());
			}*/
			catch (InterruptedException e) {
				
				// méthode divisée pour régner (divide and conquer)
				
				e.printStackTrace();
				// printStackTrace = print Stack Trace = afficher empiler/(pile) trace = afficher trace des erreurs
				
				System.out.println("L'erreur est: " + e.getMessage());
}
			catch(ArithmeticException ar) {
				//ar.printStackTrace();
				System.out.println(ar.getMessage());
			}
			
		}
		
		// pour afficher la nouvelle année
		System.out.println("Youpiii: BONNE ANNEE !!!");

	}

}
