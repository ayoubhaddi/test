package testEnumeration;

public class EssaiJour {

	public static void main(String[] arg) {
		// TODO Auto-generated method stub
		Jour jour = Jour.valueOf(arg[6]);
		if (jour == Jour.SAMEDI) System.out.println("fin de la semaine");
		switch(jour) {
		case SAMEDI : 
		case DIMANCHE : 
			System.out.println("se reposer");
			break ;
		default : 
			System.out.println("travailler");
			break ;
		}
	}

}
