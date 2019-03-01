public class FacultyFor {

	public static void main(String[] args) {
		
		int eingabe, ausgabe = 1;
		
		do {
			Out.print("Wert fuer n (n! wird berechnet): ");
			eingabe = In.readInt();
		} while(eingabe < 0);
		
		for(int z = 0; eingabe > z; z++){
			ausgabe = ausgabe + (ausgabe * z);
		}
		Out.print(ausgabe);
	}

}
