package print.printer;
import print.*;
	
public class IndentPrinter implements Printer {
  
	int indent;
  
	public IndentPrinter(int indent) {
		this.indent = indent;
	}
  
  
	public void print(Printable printable) {
    
		for(int z = 0; z < printable.getText().length; z++) {
			StringBuilder text = new StringBuilder();
			for (int i = 0; i < this.indent; i++) {
				text.append(" ");
			}
			Out.print(text);
			Out.println(printable.getText()[z]);
		}
	} 	
  
}
