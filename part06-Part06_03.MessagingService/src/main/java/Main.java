
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        Message message = new Message("Diego", "Hello Macy");
        Message message1 = new Message("Diego", "Hello Macy2345");
        Message message2 = new Message("Diego", "sunflower blueprint starlight moonstone driftwood meadowing nightfall riverbend goldspark firetrail windchime sandstorm quicklime frostbite pinecones lakeshore skyliner overcasts thundrous graniteer brightens wildflows starfield moonbeams duskshade dawnlight evergreen mistcover1.");
        MessagingService msgService = new MessagingService();
        
        msgService.add(message);
        msgService.add(message1);
        msgService.add(message2);
        
        System.out.println(msgService.getMessages());
        
    }
}
