import java.util.Map;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;

/**
 * Write a description of class Characters here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Characters
{
    // instance variables - replace the example below with your own
    private String name;
    private Room currentRoom;

    
    public Characters(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public Room setCurrentRoom(Room room) {
        currentRoom = room;
        return currentRoom;
    }
    


}