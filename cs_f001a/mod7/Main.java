package mod7;

public class Main {
    public static void main(String[] args) {
        Bird bird0 = new Bird("Cardinal");
        bird0.setId(5);
        System.out.println(bird0.getId());

        Bird bird1 = new Bird("Robin");
        System.out.println(bird1.getId());
        System.out.println(bird1.setId(3));
    }
}