
public class TackaTest {

	public static void main(String[] args) {
		
		Tacka prva = new Tacka ();
		Tacka druga = new Tacka (5,8);
		Tacka treca = new Tacka (druga);
		
		System.out.println(prva.toString());
		System.out.println(druga.toString());
		System.out.println(treca.toString());
		
		System.out.println(prva.equals(druga));
		System.out.println(druga.equals(treca));
		
		System.out.println(prva.getDistance(druga));
		System.out.println(druga.getDistance(treca));
	}
}
