package ds2019;

public class Courrier {
	boolean mode ;
	String adresse ;
	final double tarif = 0.5 ;

	Courrier(boolean mode , String adresse){
		this.mode = mode ;
		this.adresse = adresse ;
	}
	
	
	boolean estValide() {
		if(this.adresse.isEmpty())
			return false ;
		return true ;
	}
	
	void decrire() {
		System.out.println("mode = "+this.mode+" adresse = "+this.adresse);
	}
	
	double affranchir() {
		if (!this.estValide())
			return 0 ;
		if(this.mode)
			return this.tarif*2 ;
		else
			return this.tarif ;
	}

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Courrier c = new Courrier(false,"mm");
		System.out.println(c.affranchir());
		c.decrire();
		*/

	//}

}
