
public class Krug {

	private double radijus;
	private Tacka centar;
	
	public Krug (){
		this.radijus=1;
		this.centar = new Tacka (0,0);
	}
	
	public Krug ( Tacka centar, double radijus ){
		this.radijus=radijus;
		this.centar = new Tacka (centar);
	}
	
	public Krug (double x, double y, double radijus){
		this.centar = new Tacka (x,y);
		this.radijus=radijus;
	}
	
	public String toString(){
		String str="";
		str += "Centar je "+centar.toString()+"\nRadijus je "+radijus;
		return str;
	}
	
	/*
	 * Metoda koja poredi parametre dva kruga i vraca da li jednaki ili ne
	 */
	public boolean equals (Krug other){
		if (this.radijus==other.radijus && this.centar.equals(other))
			return true;
		return false;
	}
	
	/*
	 * Metoda koja kopira atribute jednog kurga u drugi
	 */
	public Krug ( Krug other){
		this.radijus=other.radijus;
		this.centar = new Tacka (other.centar);
	}
	
	public int isInside (Tacka other) {
//		double r2 =radijus*radijus;
//		double razlika = ((this.x - other.getX())*(this.x - other.getX()) + (this.y - other.getY())*(this.y - other.getY()));
//		
		
		double udaljenost = centar.getDistance(other);
				
		if (radijus == udaljenost)
			return 0;
		if (udaljenost > radijus)
			return -1;
		if ( udaljenost < radijus)
			return 1;
		
		return 2;
	
	}
	
	/*
	 * Metoda kojom provjeravamo da li dva kruga se sijeku
	 */
	public boolean sectionKrug (Krug other){
		double sumR = this.radijus + other.radijus;
		double razR = this.radijus - other.radijus;
		double udaljenost = centar.getDistance(other.centar);
		
		if ( razR< udaljenost && udaljenost > razR){
			return true;
		}
		return false;
	}
	
	
}
