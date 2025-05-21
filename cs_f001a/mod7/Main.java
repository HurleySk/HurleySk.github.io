package mod7;

public class Main {
    public static void main(String[] args) {
        Book firstBook = new Book();
        firstBook.setId(1);
        System.out.println(firstBook.getId());
        firstBook.setTitle("Anna Karenina");
        System.out.println(firstBook.getTitle());

        Task task = new Task();
        task.setDescription("Fold laundry");
        task.setPriority(2);
        System.out.println(task.getID());
        System.out.println(task.getDescription());
        System.out.println(task.getPriority());
    }
}