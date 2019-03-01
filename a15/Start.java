public class Start {
  
  public static void main(String[] args) {
    
      Rational.readRationalsFromFile("rationalNummbers.txt");
      System.out.print("\n// printing all loaded entries:\n");
        
      for(int i = 0; i < 20;i++){
        if(Rational.nummbers[i] != null ){
          System.out.print(Rational.toString(Rational.nummbers[i]));
        }
      } 
  }
}