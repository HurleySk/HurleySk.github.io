package mod6;

public class LoopyArrays {
    public static void main(String[] args) {
        //Declare values
        double[] values;
        values = new double[]{7.8, 9.3, 2.22, 3.1, 5.678, 9.1, 3.1, 8.86, 9.3, 6.3};

        //Call getAverage with values
        System.out.println("The average of these values is: " + String.valueOf(getAverage(values)));

        //Declare squarePrinter variables
        int[] numbers = {2, 4, 6, 8, 10};

        //Call squarePrinter
        squarePrinter(numbers);

        int[] bigBalls = {1, 2, 3};
        bigBalls[0] = 500;
        for (int ball : bigBalls) {
            System.out.println(ball);
        }

    }

    public static double getAverage(double[] values) {
        //Get count of values
        int count = values.length;

        //Sum values
        double sum = 0;
        for (double value : values) {
            sum += value;
        }

        //Return average
        return sum / count;
    }

    public static void squarePrinter(int[] numbers) {
        System.out.println("Squaring numbers using a for loop:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + " squared is " + (numbers[i] * numbers[i]));
        }
    }
}
