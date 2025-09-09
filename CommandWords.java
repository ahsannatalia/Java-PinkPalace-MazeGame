/**
 * This class is part of the "World of Zuul" application. 
 * "World of Zuul" is a very simple, text based adventure game.
 * 
 * This class holds an enumeration of all command words known to the game.
 * It is used to recognise commands as they are typed in.
 *
 * @author  Michael Kölling and David J. Barnes
 * @version 2016.02.29
 */

public class CommandWords
{
    // a constant array that holds all valid command words
    private static final String[] validCommands = {
        "go", "quit", "help", "back", "pick", "inventory", "drop", "give", "map"
    };

    /**
     * Constructor - initialise the command words.
     */
    public CommandWords()
    {
        // nothing to do at the moment...
    }

    /**
     * Check whether a given String is a valid command word. 
     * @return true if it is, false if it isn't.
     */
    public boolean isCommand(String aString)
    {
        for(int i = 0; i < validCommands.length; i++) {
            if(validCommands[i].equals(aString))
                return true;
        }
        // if we get here, the string was not found in the commands
        return false;
    }

    /**
     * Print all valid commands to System.out.
     */
    public void showAll() 
    {
        for(String command: validCommands) {
            System.out.print(command + "  ");
        }
        System.out.println();
        System.out.println("go -> to move to another room, provided there is a direction");
        System.out.println("quit -> to end the game");
        System.out.println("help -> to show the commands");
        System.out.println("back -> to move into the previous room");
        System.out.println("pick -> to pick up an item, provided that you mention the item name");
        System.out.println("inventory -> to show your inventory");
        System.out.println("drop -> to drop the item, provided that you mention the item name and in the same room the item is in");
        System.out.println("give -> to give the item to the children, provided that you mention the item name and the character");
        System.out.println("map -> to show the map, the asterisk presents where you are ");
    }
}
