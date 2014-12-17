package NasljedjivanjeKlasa;

public class Dog extends Animal{
	
	private String pasmina;
	
    public Dog (String ime, int brNogu){
    	super(ime, brNogu, "pas");
    	this.pasmina="Nepoznata";
   	
    }
    
    public String getPasmina() {
		return pasmina;
	}

	public void setPasmina(String pasmina) {
		this.pasmina = pasmina;
	}

	public Dog (String ime, int brNogu, String pasmina){
    	super(ime, brNogu, "pas");
    	this.pasmina = pasmina;
   	
    }
    
    public int testAnmal(){
		return this.getBrNogu();
	}
    
    public String lajanje(){
    	return "Avav";
    }
    
    @Override
    public String toString(){
    	return "Pas " + this.getIme();
    }
}
