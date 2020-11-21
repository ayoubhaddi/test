package testEnumeration;

public class EssaiJourPlus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JourPlus unJour = JourPlus.SAMEDI ;
		System.out.println("numero de "+unJour+" : "+unJour.ordinal());
		System.out.println(unJour +" : "+unJour.action());
		for(JourPlus jour : JourPlus.values())
			System.out.println("nombre d heures de "+ jour + " : "+jour.getNbHeures());
	}

}
