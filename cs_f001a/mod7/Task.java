package mod7;

public class Task {
    private static int nextID = 1; // Static variable to ensure unique IDs
    private int ID; // Unique identifier for each task
    private String description; // Task description
    private int priority; // Priority from 1 (low) to 5 (high)

    // Constructor: sets default values
    public Task() {
        this.ID = nextID++;
        this.description = "New Task";
        this.priority = 3; // Default to medium priority
    }

    // Getter for ID (no setter — ID is auto-assigned)
    public int getID() {
        return ID;
    }

    // Getter and Setter for description
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if (description != null && !description.trim().isEmpty()) {
            this.description = description;
        }
    }

    // Getter and Setter for priority
    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        if (priority >= 1 && priority <= 5) {
            this.priority = priority;
        }
    }
}