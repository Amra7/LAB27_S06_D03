package NasljedjivanjeKlasa;

public class AnimalTest {
public static void main(String[] args) {
	
	Animal pas = new Animal ("Pujdo" , 4, "pas");
	Animal macka = new Animal ("Mrnjau" , 4, "macka");
	Animal ptica = new Animal ("Lasta" , 2, "ptica");
	
	System.out.println(pas.toString());
	System.out.println(macka.toString());
	System.out.println(ptica.toString());
	
	Dog dog2 = new Dog("Boby",4);
	System.out.println(dog2.toString());
	
	Dog dog3 = new Dog("Lesi",4);
	System.out.println(dog3.toString());

	Animal dog4 = new Dog("Sapi",4);
	System.out.println(dog2.toString());
	
	Animal dog5 = (Dog) new Animal("KIKI",4, "dog");
	System.out.println(dog5.toString());
	
//	System.out.println(dog2.lajanje());
//	System.out.println(dog.lajanje());
//	System.out.println(dog3.lajanje());
//	System.out.println(dog4.lajanje());
	
}
}
