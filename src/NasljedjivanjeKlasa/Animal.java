package NasljedjivanjeKlasa;

public class Animal {

	public String ime;
	public int brNogu;
	public String  tip;
	
	/*
	 * Konstrukturuktor koji pravi  novi objekat zivotinja
	 */
	public Animal(String ime, int brNogu, String tip){
		this.ime=ime;
		this.brNogu=brNogu;
		this.tip=tip;
		
	}
	
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public int getBrNogu() {
		return brNogu;
	}
	public void setBrNogu(int brNogu) {
		this.brNogu = brNogu;
	}
	public String getTip() {
		return tip;
	}
	public void setTip(String tip) {
		this.tip = tip;
	}
	/*
	 * Metoda koja vraca -1
	 */
	private int test(){
		return -1;
	}
	
	/*
	 * Metoda koja pretvara sve atribute klase u String i vraca String
	 */
	public String toString(){
		String str ="";
		str+="Ime: "+ime;
		str+="\nBroj nogu: "+brNogu;
		str+="\nTip: "+tip+ "\n";
		return str;
	}
	
	/*
	 * Metoda koja vraca da li su atributi jedne zivotinje (objekta) jednaki drugoj
	 */
	public boolean equals(Animal other){
		if (this.ime==other.ime && this.brNogu==other.brNogu && this.tip==other.tip)
			return true;
		return false;
	}
}
