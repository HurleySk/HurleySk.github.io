package mod4;

import java.util.Scanner;

public class scratchWork {
    public static void main(String[] args) {  
        System.out.println("Select your option:");
        System.out.println("");
        System.out.println("1: Poop");
        System.out.println("2: Pooop");
        System.out.println("3: Poooop");
        System.out.println("");

        Scanner input = new Scanner(System.in);
        int poop_selection = input.nextInt();

        switch(poop_selection) {
            case 1: {
                System.out.println("Poop");
                break;
            }
            case 2: {
                System.out.println("Pooop");
                break;
            }
            case 3: {
                System.out.println("Pooop");
                break;
            }
                
        }
    }
}
