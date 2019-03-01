package print.printer;
import print.*;

public class BoxPrinter implements Printer {
  
	public void print(Printable printable){
		
		Out.print("**");
		for (int i = 0; printable.getMaxLineWidth() > i; i++){
			Out.print("*");
		}
		Out.println("**");
    
		for(int i = 0; i < printable.getText().length;i++){
			Out.print("* "); 
			Out.print(printable.getText()[i]);
			for(int z = 0; z < (printable.getMaxLineWidth() - printable.getText()[i].length()); z++){
				Out.print(" ");
			}
			Out.println(" *");
		}
      
		Out.print("**");
		for (int l = 0; printable.getMaxLineWidth() > l; l++) {
			Out.print("*");
		}
		Out.println("**");
    }
    
} 
  
