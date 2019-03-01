public class MailOffice {
  
  public static void main(String[] args) {
    Person marco = new Person();
    marco.setName("Marco");
    marco.setLastName("Bungart");
    marco.setAddress("Wilhelmshöher Allee 71-73, R. 2309, 34121 Kassel");
    marco.print();
    
    Person niko = new Person();
    niko.setName("Niko");
    niko.setLastName("Luke");
    niko.setAddress("Wilhelmshöher Allee 71-73, R. 2310, 34121 Kassel");

    Person jonas = new Person();
    jonas.setName("Jonas");
    jonas.setLastName("Posner");
    jonas.setAddress(marco.getAddress());
    
    Postcard card1 = new Postcard();
    card1.setFrom(niko);
    card1.setTo(marco);
    card1.setText("Hallo Marco, ich wuensche dir ein schoenes Fest!");
    card1.print();
    
    Postcard card2 = new Postcard();
    card2.setFrom(jonas);
    card2.setTo(niko);
    card2.setText("Hi Niko, komm gut ins neue Jahr!");
    card2.print();
  }
}