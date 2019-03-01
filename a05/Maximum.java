public class Maximum {
  
  public static void main(String[] args) {
    
    Out.println("Bitte geben Sie die erste Zahl ein: ");
    double a = In.readDouble();
    Out.println("Bitte geben Sie die zweite Zahl ein: ");
    double b = In.readDouble();
    Out.println("Bitte geben Sie die dritte Zahl ein: ");
    double c = In.readDouble();
    Out.println("Das Maximum ist: " + maximum(a, b, c));// Vereinfachung des Orginals
  }
  
  static double maximum(double a,double b, double c){
    
    double max;
    
    if(a>b){
      max = a;
    } else max = b;
    
    if (max < c) {
      max = c;
    } 
    return max;
  }
}
