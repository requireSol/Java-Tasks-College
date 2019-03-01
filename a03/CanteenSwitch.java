public class CanteenSwitch {

	public static void main(String[] args) {
		int g, sb;
		
		Out.print("Sind sie 1. Studierende/r oder 2. Bedienstete/r?: ");
		sb = In.readInt();
		
		Out.print("Welches Gericht moechten Sie essen (1, 2 oder 3)?: ");
		g = In.readInt();
		
		
		switch (sb){
		case 1:
			switch (g){
			case 1:
				Out.print("Bitte Zahlen sie 2 EUR.");
				break;
			case 2:
				Out.print("Bitte Zahlen sie 4 EUR.");
				break;
			case 3:
				Out.print("Bitte Zahlen sie 7 EUR.");
				break;
			}
		break;
		case 2:
				
			switch (g){
			case 1:
				Out.print("Bitte Zahlen sie 4 EUR.");
				break;
			case 2:
				Out.print("Bitte Zahlen sie 5 EUR.");
				break;
			case 3:
				Out.print("Bitte Zahlen sie 8 EUR.");
				break;
			}
		
		}
		
	}
	
}

