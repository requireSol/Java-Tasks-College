public class CanteenIf {
	
	//Preis: Studierende 
	static final int Preis_SA = 2;
	static final int Preis_SB = 4;
	static final int Preis_SC = 7;
	//Preis: Bedienstete
	static final int Preis_BA = 4;
	static final int Preis_BB = 5;
	static final int Preis_BC = 8;
	
	public static void main(String[] args) {
		

		
		int gericht, s_oder_b, preis = 0;
	
		//Eingabe
		Out.print("Sind sie 1. Studierender oder 2 Bediensteter ?: ");
		s_oder_b = In.readInt();
		
		Out.print("Welches Gericht moechten sie essen (1, 2 oder 3)?: ");
		gericht = In.readInt();
		
		//Berechnung
		if (s_oder_b == 1) {
			if (gericht == 1){preis = Preis_SA;}
			if (gericht == 2){preis = Preis_SB;} 
			else {preis = Preis_SC;} 	
		} else {
			if (gericht == 1){preis = Preis_BA;}
			if (gericht == 2){preis = Preis_BB;}
			else {preis = Preis_BC;}
		}
		
		
		//Ausgabe
		if (s_oder_b == 1) {	
				Out.print("Bitte Zahlen sie " +  preis  + " EUR.");
				} else {
					Out.print("Bitte Zahlen sie " + preis + " EUR.");
			}
		}
	}