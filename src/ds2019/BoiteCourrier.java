package ds2019;

	

public class BoiteCourrier {
	Courrier[] c;
	
	BoiteCourrier(int n){
		c = new Courrier[n];
	}
	double affranchir() {
		double total =0;
		for(int i =0;i<c.length;i++) {
			total += c[i].affranchir();
			
		}
		return total ;
	}
	
	int courrierInvalides(){
		int k =0;
		for(int i=0 ; i<c.length ;i++) {
			if(!c[i].estValide())
				k++;
		}
		return k;
	}
	void affiche() {
		for(int i=0;i<c.length;i++) {
			c[i].decrire();
			if(!c[i].estValide())
				System.out.println("non valide");
		}
	}
	public static void main(String [] args) {
		int n = 3 ;
		BoiteCourrier tab = new BoiteCourrier(n);
		tab.c[0]=new Lettre(true,"",2.3,"aaa");
		tab.c[1]=new Colis(2.3,8.1,false,"ppp");
		tab.c[2]=new Colis(7,3.1,false,"");
		tab.affiche();
	}
}
