package calcChallenge;

public class calcChallenge {
    public static void main(String[] args) {
        System.out.print("Compound interest test: ");
        System.out.println(calcCompoundInterest(500, .05, 10, 365));

        System.out.print("Inches to centimeters test: ");
        System.out.println(conversion(12));

        System.out.print("Miles to kilometers test: ");
        System.out.println(convertMilestoKil(10));
    }

    /*
    * I implement the compound interest formula below.
    *
    * NOTE: Formula on provided website incorrect. 
    * I discovered this in testing when the formula, as written, returned values which were too large.
    * Corrected version below.
    * Correction: Changed r/t --> r/n
    */

    public static double calcCompoundInterest(double P, double r, double t, double n) {
        double amt;
        amt = P * Math.pow(1 + (r/n), n * t);
        return amt;
    }

    // Credit to Bailey Palmaffy for this method, which converts from inches to centimeters.

    public static double conversion(double inches){
        double centimeters = inches * 2.54;
        return centimeters;
    }

    // Credit to Karin Horowitz for this method, which converts from miles to kilometers.
    public static double convertMilestoKil(double miles)
    { 
        double MilesToKilo = miles * 1.609344;
        return MilesToKilo;
    }

}

//Output below:

/* 
* Compound interest test: 824.3324068826173
* Inches to centimeters test: 30.48
* Miles to kilometers test: 16.09344
*/