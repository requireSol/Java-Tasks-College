public abstract class CommunicationDevice {
  
  CommunicationDevice[] allContacts = new CommunicationDevice[10];
  String name;

  abstract void printInformations();
  abstract void receiveMessage(CommunicationDevice massageFrom);
  abstract void sendMessage(CommunicationDevice massageTo); 
  abstract void broadcast();
  
  abstract String getInfo();
  abstract String getName();
  //GEHT ALLES DURCH um passende stelle in dem fall
  //eine nicht ausgefüllte stelle zu finden
  void addContact(CommunicationDevice contact) {
    for (int i= 0; i < allContacts.length; i++) {
      if (allContacts[i] == null){
        allContacts[i] = contact;
      break;
      }
    }
  } 
}
