public class FacultyWhile {

	public static void main(String[] args) {
		
		int eingabe, ausgabe = 1,z = 1;
		
		do {
			Out.print("Wert fuer n (n! wird berechnet): ");
			eingabe = In.readInt();
		} while(eingabe < 0);
		
		while (eingabe > z){
			ausgabe = ausgabe + (ausgabe * z);
			++z;
		}
			
		Out.print(ausgabe);
	}

}
