public class FacultyDoWhile {

	public static void main(String[] args) {
		
		int eingabe, ausgabe = 1, z = 0;
		
		do {
			Out.print("Wert fuer n (n! wird berechnet): ");
			eingabe = In.readInt();
		} while(eingabe < 0);
		
		do {
			ausgabe = ausgabe + (ausgabe * z);
			++z;
		}	while(eingabe > z);
	
		Out.println(ausgabe);
	}
}
