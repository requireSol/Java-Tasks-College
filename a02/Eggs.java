public class Eggs {

	public static void main(String[] args) {
		
		int anzahl;

			Out.print("Wie viele Eier haben Sie?: ");
			anzahl = In.readInt();
			
			Out.print("Das sind: " + anzahl / 12  +
					" Dutzend Eier und " + anzahl%12 +
					" einzelne Eier.");
	}
}
