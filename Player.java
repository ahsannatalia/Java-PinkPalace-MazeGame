import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

/**
 * Write a description of class Player here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Player
{
    // instance variables - replace the example below with your own
    private Room currentRoom;
    private int maxWeight;
    private int currentWeight;
    private ArrayList<Room> visitedRooms;
    private ArrayList<Items> inventory;
    private ArrayList<Items> bag;
    private Characters character;

    /**
     * Constructor for objects of class Player
     */
    public Player(int maxWeight, Room startingRoom)
    {
        // initialise instance variables
        this.maxWeight = maxWeight;
        this.currentWeight = 0;
        this.currentRoom = startingRoom;
        this.visitedRooms = new ArrayList<>();
        this.visitedRooms.add(startingRoom);
        inventory = new ArrayList<>();
        bag = new ArrayList<>();
    }
    
    public String getCurrentRoomDescription() {
        return currentRoom.getLongDescription();
    }

    public Room setCurrentRoom(Room room) {
        currentRoom = room;
        visitedRooms.add(room);
        return currentRoom;
    }
    
    public Room getCurrentRoom(){
        return currentRoom;
    }
    
    public void pickUpItem(String itemName, Room currentRoom) {
        List<Items> roomItems = currentRoom.getItems();
        for (Items item : roomItems) {
            if (item.getName().equalsIgnoreCase(itemName)) {
                if (item.getPicked() && (currentWeight + item.getWeight()) <= maxWeight) {
                    currentWeight += item.getWeight();
                    currentRoom.removeItem(itemName);
                    inventory.add(item);
                    System.out.println("You picked up " + itemName);
                    return;
                } else {
                    System.out.println("You can't carry this item, you have exceeded your weight limit or you have already picked it up");
                    return;
                }
            }
        }
        System.out.println("That item is not in this room.");
    }
    
    public ArrayList<Room> getVisitedRooms() {
        return visitedRooms;
    }
    
    public void showInventory() {
        if (inventory.isEmpty()) {
            System.out.println("Your inventory is empty.");
        } else {
            System.out.println("Inventory:");
            for (Items item : inventory) {
                System.out.println(item.getName() + " (Weight: " + item.getWeight() + ")");
            }
            System.out.println("Total Weight: " + currentWeight + "/" + maxWeight);
        }
    }
    
    public ArrayList<Items> getInventory(){
        return (inventory);
    }
    
    public void dropItem(String itemName){
        Iterator<Items> it = inventory.iterator();
        while(it.hasNext()){
            Items item = it.next();
            if (item.getName().equalsIgnoreCase(itemName)){
                it.remove();
                currentRoom.addItem(itemName, item);
                System.out.println("Item " + itemName + " has been removed");
            }
            else{
                System.out.println("no such item");
            }
        }
        
    }
    
    public void giveItem(String itemName, String character){
        boolean itemFound = false;
        for (Items item : inventory){
            if (item.getName().equalsIgnoreCase(itemName)){
                bag.add(item);
                System.out.println("you have given " + itemName);
                System.out.println(character + " has accepted the " + itemName);
                inventory.remove(item);
                itemFound = true;
                return;
            }
            
        }
        if (!itemFound){
        System.out.println("you have not given the item");
        System.out.println(character + " is are not carrying this item");
    }
    }
    
    public void showBag(String character){
        if (bag.isEmpty()){
            System.out.println(character + " bag is empty");
        }
        else{
            System.out.println(character + " Bag: ");
            for (Items item : bag){
                System.out.println(item.getName());
            }
        }
    }
    
    public boolean check(){
        int itemCount = 0;

        for (Items item : bag) {
            if (item.getName().equalsIgnoreCase("rabbit") || item.getName().equalsIgnoreCase("ring") || item.getName().equalsIgnoreCase("jack-in-the-box")) {
                itemCount++;
            }
        }
        if (itemCount == 3) {
            System.out.println("you have completed the tasks. Well done! you have won!");
            System.out.println("Three Ghost Children: Thank you Coraline! ");
            return true;
        
        }
        return false;
    }

    public boolean checkRoom(){
        if (visitedRooms.size() >= 2){
            return true;
        }
        else{
            return false;
        }
    }
    
    public void goBack(){
        int lastVisitedIndex = visitedRooms.size() - 2;
        if (lastVisitedIndex >= 0 ){
            currentRoom = visitedRooms.get(lastVisitedIndex);
            visitedRooms.remove(lastVisitedIndex + 1);
            System.out.println(currentRoom.getLongDescription());
        }
        else{
            System.out.println("You can't go back further");
        }
    }
    }

    