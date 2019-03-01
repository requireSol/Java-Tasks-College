public class AgeCheck {
  
  public static void main(String[] args) {
    
    printGreeting();
    
    Out.print("Bitte geben Sie Ihren Nachnamen ein: ");
    String name = In.readLine();
    
    Out.print("Sind Sie (1) weiblich oder (2) maennlich? ");
    int gender = In.readInt();
    
    Out.print("Wie alt sind Sie? ");
    int age = In.readInt();
    
    String anrede = (gender == 1)? "Frau" : "Herr";
    Out.println("Hallo " + anrede + " " + name + "!");
    
    checkAgeAndPrint(age); 
    
  } 
  
  static void printGreeting(){
    Out.println("Willkommen zur Alterskontrolle!");
  } 
  
  static void checkAgeAndPrint(int x){
    String ja_nein = (x < 18)? " noch nicht" : "";
    Out.println("Sie sind" + ja_nein + " volljeahrig.");
  }
}