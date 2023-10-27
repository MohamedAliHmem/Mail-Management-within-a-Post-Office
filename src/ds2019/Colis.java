package ds2019;

public class Colis extends Courrier{
	
	double poids ;
	double volume ;
	
	Colis(double p,double v,boolean m,String a){
		super(m,a);
		this.poids=p;
		this.volume = v ;
	}
	
	void decrir() {
		super.decrire();
		System.out.println(" poids = "+this.poids+" volume = "+this.volume);
	}
	
	double affranchir() {
		return 0.25*this.volume + (this.poids/1000) ;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
