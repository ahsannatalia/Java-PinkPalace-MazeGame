import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Collections;
import java.util.Arrays;

/**
 *  This class is the main class of the "World of Zuul" application. 
 *  "World of Zuul" is a very simple, text based adventure game.  Users 
 *  can walk around some scenery. That's all. It should really be extended 
 *  to make it more interesting!
 * 
 *  To play this game, create an instance of this class and call the "play"
 *  method.
 * 
 *  This main class creates and initialises all the others: it creates all
 *  rooms, creates the parser and starts the game.  It also evaluates and
 *  executes the commands that the parser returns.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 2016.02.29
 */

public class Game 
{
    private Parser parser;
    private Room currentRoom;
    private Room room;
    private Player player;
    private Random rdm;
    private Graphics graphic;
    
    /**
     * Create the game and initialise its internal map.
     */
    public Game() 
    {
        createRooms();
        parser = new Parser();
        player = new Player(20, currentRoom);
        rdm = new Random();
        graphic = new Graphics();
    }

    /**
     * Create all the rooms and link their exits together.
     */
    private void createRooms()
    {
        Room hall, study, bedroom, tunnel, circusRoom, teaRoom, magicRoom, kitchen, outside;
      
        // create the rooms
        outside = new Room("outside the Pink Palace Apartments");
        hall = new Room("in the hall");
        study = new Room("in your Father's Study. \nThere is a book./nThere is a desk");
        bedroom = new Room("in your bedroom.\nThere is a cuddly rabbit");
        tunnel = new Room("in the tunnel. \n There are three Ghost Children waiting for you");
        magicRoom = new Room ("in the MaGiC rOoM");
        teaRoom = new Room("in Miss Spink's Tea Room.\nThere is a Pearl Ring");
        circusRoom = new Room("in Mr. Bobinsky's Circus.\nThere is a jack-in-the-box");
        kitchen = new Room("in the kitchen");

        
        // initialise room exits
        outside.setExit("south", teaRoom);
        outside.setExit("north", circusRoom);
        outside.setExit("east", kitchen);

        kitchen.setExit("west", outside);
        kitchen.setExit("south", magicRoom);
        kitchen.setExit("east", study);

        magicRoom.setExit("north", kitchen);
        magicRoom.setExit("north-north", circusRoom);
        magicRoom.setExit("south", teaRoom);
        magicRoom.setExit("east", hall);
        magicRoom.setExit("east-east", bedroom);
        magicRoom.setExit("north-east", study);
        magicRoom.setExit("south-east", tunnel);
    
        study.setExit("south", hall);
        
        bedroom.setExit("west", hall);
        bedroom.setExit("south", tunnel);
        
        tunnel.setExit("north", hall);
        
        hall.setExit("north", study);
        hall.setExit("south", tunnel);
        hall.setExit("east",bedroom);
        hall.setExit("west", kitchen);
        
        teaRoom.setExit("north", outside);
        circusRoom.setExit("south", outside);
        
        currentRoom = hall;  // start game outside
        
        //create items
        Items book = new Items( 15,"Book", true);
        Items rabbit = new Items( 5, "rabbit",true);
        Items ring = new Items(2,"ring",true);
        Items desk = new Items(50,"desk",false);
        Items jackinthebox = new Items(10, "jack-in-the-box", true);

        // Add items to rooms
        study.addItem("Book", book);
        bedroom.addItem("rabbit", rabbit);
        teaRoom.addItem("ring",ring);
        circusRoom.addItem("jack-in-the-box", jackinthebox);
        study.addItem("desk",desk);
        
        //create stationary character
        Characters beldam = new Characters("beldam");
        Characters spink = new Characters("Miss Spink");
        Characters bobinsky = new Characters("Mr Bobinsky");
        // add stationary character to a the office
        hall.addCharacter("beldam", beldam);
        outside.addCharacter("Miss Spink", spink);
        study.addCharacter("Mr Bobinsky", bobinsky);
    }

    /**
     *  Main play routine.  Loops until end of play.
     */
    public void play() 
    {            
        printWelcome();
        // Enter the main command loop.  Here we repeatedly read commands and
        // execute them until the game is over.
                
        boolean finished = false;
        while (! finished) {
            Command command = parser.getCommand();
            finished = processCommand(command);
          if (player.check() && player.checkRoom()){
           System.out.println("\nYou win!");
           break;
           }
           }
        System.out.println("Thank you for playing.  Good bye.");
        }
      
    

    /**
     * Print out the opening message for the player.
     */
    private void printWelcome()
    {
        System.out.println();
        graphic.welcomeMessage();
        System.out.println("");
        graphic.pinkPalace();
        System.out.println("");
        System.out.println("Welcome to the Pink Palace Apartments. You are Coraline, help her avenge the three ghost children");
        System.out.println("Items: ");
        System.out.println("1. Cuddly Rabbit");
        System.out.println("2. Jack-in-the-box");
        System.out.println("3. Pearl Ring");
        System.out.println("");
        System.out.println("Type 'help' to see the commands.");
        System.out.println("Collect these items and return them back to the ghost children, to win the game");
        System.out.println("this is where you start ... ");
        System.out.println(currentRoom.getLongDescription());
    }
    
    private void moveCharacters(){
        List<String> roomCharacters = currentRoom.getCharacter();
        String [] Rooms = new String [] {"outside", "tea room", "kitchen", "bedroom", "study", "circus room", "hall"};
        List<String> rooms = Arrays.asList(Rooms);
        for (String character : roomCharacters){
            String moveRoom = Rooms[rdm.nextInt(Rooms.length)];
            System.out.println(character + " has moved to " + moveRoom);
        }
        Collections.shuffle(rooms);
        Rooms = rooms.toArray(new String [rooms.size()]);
    }
    

    /**
     * Given a command, process (that is: execute) the command.
     * @param command The command to be processed.
     * @return true If the command ends the game, false otherwise.
     */
    private boolean processCommand(Command command) 
    {
        boolean wantToQuit = false;

        if(command.isUnknown()) {
            System.out.println("I don't know what you mean...");
            return false;
        }

        String commandWord = command.getCommandWord();
        if (commandWord.equals("help")) {
            printHelp();
        }
        else if (commandWord.equals("go")) {
            goRoom(command);
        }
        else if (commandWord.equals("quit")) {
            wantToQuit = quit(command);
        }
        else if (commandWord.equals("back")){
            goBack();
        }
        else if (commandWord.equals("pick")) {
            pick(command);
        }
        else if (commandWord.equals("inventory")) {
            win();
        }
        else if (commandWord.equals("drop")) {
            drop(command);
        }
        else if (commandWord.equals("give")) {
           giveItem(command);
        }
        else if (commandWord.equals("map")) {
           map(command);
        }
        // else command not recognised.
        return wantToQuit;
    }

    // implementations of user commands:

    /**
     * Print out some help information.
     * Here we print some stupid, cryptic message and a list of the 
     * command words.
     */
    private void printHelp() 
    {
        System.out.println("You are lost. You are alone. You wander");
        System.out.println("around at the Pink Palace Apartments");
        System.out.println();
        System.out.println("Your command words are:");
        parser.showCommands();
    }

    /** 
     * Try to in to one direction. If there is an exit, enter the new
     * room, otherwise print an error message.
     */
    private void goRoom(Command command) 
    {
        if(!command.hasSecondWord()) {
            // if there is no second word, we don't know where to go...
            System.out.println("Go where?");
            return;
        }
        
        String direction = command.getSecondWord();

        // Try to leave current room.
        Room nextRoom = currentRoom.getExit(direction);
        
        if (nextRoom == null) {
            System.out.println("There is no door!");
            }
        
        else {
            currentRoom = player.setCurrentRoom(nextRoom);
            System.out.println(currentRoom.getLongDescription());
            if (currentRoom.getShortDescription().equals("in the MaGiC rOoM")){
                String [] exits = {"north", "south", "east", "west", "north north", "east east", "north east", "south east"};
                String randomDirection = exits[rdm.nextInt(exits.length)]; 
                Room randomRoom = currentRoom.getExit(randomDirection);
                currentRoom = player.setCurrentRoom(randomRoom);
                System.out.println(currentRoom.getLongDescription());
            }
        }
        moveCharacters();
    }   
    
    private void goBack(){
        player.goBack();
    }
    
    private void pick(Command command){
        if (command.hasSecondWord()) {
                player.pickUpItem(command.getSecondWord(), player.getCurrentRoom());
            } else {
                System.out.println("Pick what?");
            }
    }
    
    private void win(){
       player.showInventory();
    }
    
    private void drop(Command command){
        if (command.hasSecondWord()) {
                player.dropItem(command.getSecondWord());
            } else {
                System.out.println("Drop what?");
            }
    }
    
    private void giveItem(Command command){
        if (command.hasSecondWord() && command.hasThirdWord()){
            player.giveItem(command.getSecondWord(), command.getThirdWord());
            player.showBag(command.getThirdWord());
        }
        else {
            System.out.println("Give what? and to who?");
        }
    }
    
    private void map(Command command){
        if (!command.hasSecondWord()){
            if (currentRoom.getShortDescription().equalsIgnoreCase("outside the Pink Palace Apartments")){
                graphic.mapOutside();
            }
            else if (currentRoom.getShortDescription().equalsIgnoreCase("in the hall")){
                graphic.mapHall();
            }
            else if(currentRoom.getShortDescription().equalsIgnoreCase("in your Father's Study. \nThere is a book.\nThere is a desk")){
                graphic.mapStudy();
            }
            else if(currentRoom.getShortDescription().equalsIgnoreCase("in your bedroom.\nThere is a cuddly rabbit")){
                graphic.mapBedroom();
            }
            else if(currentRoom.getShortDescription().equalsIgnoreCase("in the tunnel. \n There are three Ghost Children waiting for you")){
                graphic.mapTunnel();
            }
            else if(currentRoom.getShortDescription().equalsIgnoreCase("in Miss Spink's Tea Room.\nThere is a Pearl Ring")){
                graphic.mapTeaRoom();
            }
            else if(currentRoom.getShortDescription().equalsIgnoreCase("in Mr. Bobinsky's Circus.\nThere is a jack-in-the-box")){
                graphic.mapCircus();
            }
            else if (currentRoom.getShortDescription().equalsIgnoreCase("in the kitchen")){
                graphic.mapKitchen();
            }
        }
        }
    
    /** 
     * "Quit" was entered. Check the rest of the command to see
     * whether we really quit the game.
     * @return true, if this command quits the game, false otherwise.
     */
    private boolean quit(Command command) 
    {
        if(command.hasSecondWord()) {
            System.out.println("Quit what?");
            return false;
        }
        else {
            return true;  // signal that we want to quit
        }
    }
    
}
