package mod7;

public class Book {
    private int id;
    private String title;

    public Book() {
        this.id = 0;
        this.title = "Unknown Title";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        } else {
            System.out.println("Invalid ID. Must be greater than 0.");
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title != null && !title.trim().isEmpty()) {
            this.title = title;
        } else {
            System.out.println("Invalid title. Cannot be empty.");
        }
    }
}