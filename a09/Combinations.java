public class Combinations {

	public static void main(String[] args) {             
        
		int tries = Integer.parseInt(args[0]);
		int faces = Integer.parseInt(args[1]);
    
        printAllCombinations("", tries, faces);
                    
    }    
  
	static void printAllCombinations(String trenner,int tries,int faces) {
  
		int wuerfelaugen[] = new int[faces];
    
		for(int i = 0; i < faces ; i++) {
			wuerfelaugen[i] = i + 1;
		}

		int n = wuerfelaugen.length;      

		if (tries == 0) {
			System.out.println(trenner);
			return;
		}
    
		for (int i = 0; i < n; ++i) {
			
			String trenner_2;
            
		if (tries > 1) {
			trenner_2= trenner + wuerfelaugen[i] + "  "; 
        } else {
			trenner_2 = trenner + wuerfelaugen[i];
		}
        
		printAllCombinations(trenner_2, tries - 1,faces); 
      
    }
  
  } 

}