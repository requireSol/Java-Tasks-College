public class Person {
  
  String Name, LastName, Address;
  
  public void setName (String name) {
    Name = name;
  }
  
  public void setLastName (String lastName) {
    LastName = lastName;
  }
  
  public void setAddress (String address) {
    Address = address;
  }
  
  public String getAddress() {
    return Address;
  }
  
  public void print() {
    Out.println(Name + " " + LastName + "\n" + Address);
  }

} 