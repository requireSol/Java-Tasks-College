public class LeapYear {

	public static void main(String[] args) {
		
		int jahr;
		
		Out.print("Bitte geben Sie eine Jahr ein: ");
		jahr = In.readInt();
		
		
		if(((jahr % 4 == 0)  &&  (jahr % 100 != 0)) || (jahr % 400 == 0)){
			Out.print(jahr + " ist ein Schaltjahr.");
		}
		else {
			Out.print(jahr + " ist kein Schaltjahr.");
		}

	}

}
