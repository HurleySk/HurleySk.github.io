import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String q1 = "Enter your first name: ";
        System.out.print(q1);
        String first = input.next();

        String q2 = "Enter your last name: ";
        System.out.print(q2);
        String last = input.next();

        System.out.println(first + ' ' + last);
    }
}
