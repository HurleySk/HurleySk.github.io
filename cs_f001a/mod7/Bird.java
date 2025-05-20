package mod7;

import java.util.List;
import java.util.ArrayList;

public class Bird {
    //Declare instance variables with defaults
    private int id = -1;
    private String type = "Unknown";

    //Declare one static variable to keep track of previously used IDs and ensure uniqueness; another to determine next ID.
    private static List<Integer> idsInUse = new ArrayList<>();
    private static int nextId = 1;

    //Declare list of valid bird types for validation
    private static List<String> validTypes = List.of("Cardinal", "Bluejay", "Owl", "Hawk", "Robin", "Eagle", "Dove");

    //Constructor
    public Bird(String type) {
        //Set type to type passed in constructor
        if (validTypes.contains(type)) {
            this.type = type;
        } else {
            throw new IllegalArgumentException("Please enter a valid bird type");
        }
        
        
        //Identify if nextId already in use to account for potential user-set IDs and increment up to next largest integer
        while(idsInUse.contains(nextId)) {
            nextId++;
        }
        
        //Set ID to nextId then increment next nextId
        this.id = nextId++;

        //Add new ID to idsInUse
        idsInUse.add(this.id);
    }

    //Getter for id instance variable
    public int getId() {
        return this.id;
    }

    //Setter for ID
    public int setId(int newId) {
        //If new ID below current nextId level, throw error
        if (newId <= nextId) {
            String errorMessage = "Please select an ID greater than " + nextId;
            throw new IllegalArgumentException(errorMessage);
        } else {
            nextId = newId + 1;
            this.id = newId;
            return this.id;
        }
    }

    //Getter for type
    public String getType() {
        return this.type;
    }

    //Setter for type
    public String setType(String newType) {
        if (validTypes.contains(newType)) {
            this.type = newType;
        } else {
            throw new IllegalArgumentException("Please enter a valid bird type");
        }
        return this.type;
    }
}