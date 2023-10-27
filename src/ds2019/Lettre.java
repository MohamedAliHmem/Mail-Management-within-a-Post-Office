package ds2019;

public class Lettre extends Courrier{
	private double poids ;
	private String format ;
	
	Lettre (boolean c , String adress,double poids , String format){
		super(c,adress);
		this.poids = poids ;
		if(format.toUpperCase().equals("A3") || format.toUpperCase().equals("A4"))
			this.format = format.toUpperCase() ;
		else
			this.format = "A3";
	}
	void decrire() {
		super.decrire();
		System.out.println(" poids = "+this.poids+" format = "+this.format);
	}
	double affranchir() {
		if(this.format == "A4") {
			if(this.mode)
				return (2.5 + 0.5*(this.poids/1000))*2 ;
			else
				return 2.5 + 0.5*(this.poids/1000) ;
		}else {
			if(this.mode)
				return (3.5 + 0.5*(this.poids/1000))*2 ;
			else
				return 3.5 + 0.5*(this.poids/1000) ;
		}
	}
}
