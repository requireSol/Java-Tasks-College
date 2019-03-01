import In;
public class Costs {

	public static void main(String[] args) {
		
		int b, t, a, p;
		
		Out.print("Bitte Breite der Holzplatte (in m) eingeben: ");
			b = In.readInt();
		Out.print("Bitte Tiefe der Holzplatte (in m) eingeben: ");
			t = In.readInt();
		Out.print("Bitte Anzahl der Aussparungen eingeben: ");
			a = In.readInt();

		Out.println("Berechnung laeuft...");
		
		Out.print("Groesse der Platte: " + b*t + " qm \n"
						+ "Materialkosten: " + (b*t)*8 + " Euro \n"
						+ "Kosten für die Aussparungen: " + a*10 + " Euro \n"
						+ "Gestamtkosten: " + ((b*t*8) + (a*10)) + " Euro");
	
	}
}
