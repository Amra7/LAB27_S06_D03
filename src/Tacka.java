
public class Tacka {
	/*
	 * Klasa Tacka koja oznacava tacku u koordinatnom sistemu
	 */

	private  double x;
	private double y;
	
	/*
	 * Konstruktor koji pravi tacku koja je centar koordinatnog sistema i ima vrijednost (0,0)
	 */
	public Tacka (){
		
		this.x=0;
		this.y=0;
	}
	
	/*
	 * Konstruktor koji prima dvije vrijednosti i postavlja ih kao koordinate
	 */
	public Tacka ( double x, double y){
		this.x=x;
		this.y=y;
	}
	
	/*
	 * Konstruktor koji kopira atribute jedne klase
	 */
	public Tacka ( Tacka other){
		this.x=other.x;
		this.y=other.y;
		
		
	}
	
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	/*
	 * Metoda koja pretvara sve atribute klase u String i vraca String
	 */
	public String toString(){
		String str="";
		str+="( "+x +", "+y+" )";
	
		return str;
	}
	
	/*
	 * Metoda koja vraca da li su dvije tacke jednake( tj. ako su im svi atributi jednaki) u protivnom nisu jednake
	 */
	public boolean equals (Tacka other){
		if ( this.x==other.x && this.y==other.y)
			return true;
		return false;
	}
	
	/*
	 * Metoda koja racuna distancu izmedju dvije tacke i vraca vrijednost distance
	 */
	public double getDistance (Tacka other){
		return (double)Math.sqrt((this.x - other.x )*(this.x - other.x ) + (this.y - other.y )*(this.y - other.y ));
	}
	
}
