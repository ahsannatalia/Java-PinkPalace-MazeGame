import java.util.ArrayList;

/**
 * Write a description of class Items here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Items
{
    // instance variables - replace the example below with your own
    private int weight;
    private String itemName;
    private boolean canBePicked;
    private Room currentRoom;
    

    /**
     * Constructor for objects of class Items
     */
    public Items(int weight, String itemName, boolean canBePicked)
    {
        // initialise instance variables
        this.weight = weight;
        this.itemName = itemName;
        this.canBePicked = canBePicked;
    }
    
    public String getName(){
        return itemName;
    }
    
    public int getWeight(){
        return weight;
    }
    
    public boolean getPicked(){
        return canBePicked;
    }
    
}
