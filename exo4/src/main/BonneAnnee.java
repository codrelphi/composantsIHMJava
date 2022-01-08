package main;

public class BonneAnnee {

	public static void main(String[] args) {
		
		for (int i=10; i>0; i--) {
			
			// i++ => i = i + 1 (incr�mentation avec un pas (step en anglais de 1)
			// i-- => i = i - 1 (d�cr�mentation avec un pas de 1
			// i = i + 2
			
			System.out.println(i); // print on line (affichage sur une ligne) / retour � la ligne
			// affichage simple => .print()
			
			// le syst�me doit attendre 1 seconde
			// 1 thread = 1 fil (francais) 
			// 1 second = 1000 milliseconds
			
			// c'est possible de cr�er ou personnaliser les classes exceptions 
			// en bref: on doit traiter les exceptions dans l'odre des instructions
			int calcul; 
			
			// pourquoi r�inventer la roue // on the shoulders of giants (sur les �paules de g�ants)
			try {
				Thread.sleep(1000); // 1 second
				calcul = 1/0;
				
			} 
			/*catch (Exception e) {
				System.out.println(e.getMessage());
			}*/
			catch (InterruptedException e) {
				
				// m�thode divis�e pour r�gner (divide and conquer)
				
				e.printStackTrace();
				// printStackTrace = print Stack Trace = afficher empiler/(pile) trace = afficher trace des erreurs
				
				System.out.println("L'erreur est: " + e.getMessage());
}
			catch(ArithmeticException ar) {
				//ar.printStackTrace();
				System.out.println(ar.getMessage());
			}
			
		}
		
		// pour afficher la nouvelle ann�e
		System.out.println("Youpiii: BONNE ANNEE !!!");

	}

}
