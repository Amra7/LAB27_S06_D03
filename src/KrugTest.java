
public class KrugTest {
public static void main(String[] args) {
	
	Tacka t1 = new Tacka(3,6);
	Tacka t2 = new Tacka(2,7);
	Tacka t3 = new Tacka(5,6);
	
	Krug k1 = new Krug (0, 0, 2);
	Krug k2 = new Krug (new Tacka(1,1), 3);
	
	System.out.println(k1.equals(k2));
	System.out.println(k1.toString());
	
	System.out.println(k1.isInside(t3));
	System.out.println(k2.isInside(t1));
	
	System.out.println(k1.sectionKrug(k2));

	
}
}
