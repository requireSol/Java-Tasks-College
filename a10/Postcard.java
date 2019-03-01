public class Postcard {
  
  String From, To, Text, FromAddress, ToAddress;
  
  public void setFrom (Person absender) {
    From = absender.Name + " " + absender.LastName;
    FromAddress = absender.Address;
  }
  
  public void setTo (Person empfaenger) {
    To = empfaenger.Name + " " + empfaenger.LastName;
    ToAddress = empfaenger.Address;
  }
  
  public void setText (String text) {
    Text = text;
  }
  
  public void print() {
    Out.println("-----------\nPostcard\n");
    Out.println("From: " + From + "\n" + FromAddress);
    Out.println("\nTo: " + To + "\n" + ToAddress);
    Out.println("\nText: " + Text + "\n" + "-----------");
  }
} 