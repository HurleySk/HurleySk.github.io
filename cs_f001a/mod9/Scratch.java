package mod9;

import java.util.Random;

public class Scratch {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] testArr = new int[10];
        for (int i = 0; i < testArr.length; i++) {
            testArr[i] = rand.nextInt(10000);
        }
        
        printArr(testArr);
        bubbleSort(testArr);
        printArr(testArr);
        
    }

    public static void bubbleSort(int[] arr) {
        int temp;
        Boolean changed = false; 
        Boolean firstRun = true;
        while(changed || firstRun) {
            firstRun = false;
            changed = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    changed = true;
                }
            }
        }
    }
    

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
}