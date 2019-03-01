package print.printable;
import print.*;

public class Person implements Printable {
  
	private String []infoPerson = new String[3];
  
	public Person(String vorName, String name, String addresse, String plz, String ort){
		this.infoPerson[0] = vorName + " " + name;
		this.infoPerson[1] = addresse;
		this.infoPerson[2] = plz + " " + ort;
	}
  
	public String[] getText(){
		return infoPerson;
	}
  
	public int getMaxLineWidth(){
		
		int maxLineWidth = infoPerson[0].length();
		
		for(int i = 1; i < infoPerson.length; i++){
			if (this.infoPerson[i].length() > maxLineWidth){
				maxLineWidth = this.infoPerson[i].length();
			}
		}
		return maxLineWidth;
	}
  
} 
