package NasljedjivanjeKlasa;

public class Cat extends Animal{
	
	private String pasmina;
	
	public Cat (String ime, int brNogu){
		super(ime, brNogu, "macka");
	}
	
	public String getPasmina (){
		return pasmina;
	}
	
	public void setPasmina (String pasmina){
		this.pasmina=pasmina;
	}
	
	public String toString(){
		return "Macka" + getIme();
	}
	
	public String oglasavanje (){
		return "Mrnjauuuu";
	}
	

}
