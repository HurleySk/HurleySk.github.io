package mod_3;

import java.util.Scanner;

public class Mod_3 {
    public static void main(String[] args) {
        MyVars instance = new MyVars();
        instance.getValues();
        instance.displayValues();
    }
}

class MyVars {
    private double totalCount;
    private double n;
    private String finalString;

    public void getValues() {
        // Declare local variables
        double count = 0;
        String first, last;
        Scanner input = new Scanner(System.in);

        // Get data
        System.out.print("Enter a number: ");
        count = input.nextDouble();
        System.out.print("Enter another number: ");
        n = input.nextDouble();
        System.out.print("Enter a name: ");
        first = input.next();
        System.out.print("Enter a name: ");
        last = input.next();

        // Add and subtract doubles
        n++;
        totalCount = n + count;

        // Concatenate strings
        finalString = first + " " + last;
    }

    public void displayValues() {
        System.out.println(" ");
        System.out.println("Total count: " + totalCount);
        System.out.print("Total count * 5 = ");
        System.out.println(totalCount * 5);
        System.out.print("Total count / 2 = ");
        System.out.println(totalCount / 2);
        System.out.println("Final string: " + finalString);
    }
}