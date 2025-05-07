public class proj1 {
    public static void main(String[] args) {
        //Horizontal Line
        System.out.println("Horizontal Line:");
        drawHorizontalLine();

        //Vertical Line
        System.out.println("Vertical Line:");
        drawVerticalLine();

        //Rectangle
        System.out.println("Rectangle:");
        drawRectangle();

        //Square
        System.out.println("Square:");
        drawSquare();

        //Up Triangle
        System.out.println("Up Triangle:");
        drawUpTriangle();

        //Down Triangle
        System.out.println("Down Triangle:");
        drawDownTriangle();

        //My custom shape: Cross
        System.out.println("Cross:");
        drawCross();

        //Complex shape: House
        System.out.println("House:");
        drawUpTriangle();
        drawRectangle();

        // My complex shape: Hourglass
        System.out.println("Hourglass:");
        drawHorizontalLine();
        drawCross();
        drawHorizontalLine();

        //Created by Bailey Palmaffy - Complex Shape: Crystal
        System.out.println("Crystal");
        drawUpTriangle();
        drawHorizontalLine();
        drawRectangle();
        drawRectangle();
        drawHorizontalLine();
        drawDownTriangle();

        /*Created by Katherine Castillo - Complex Shape: Double-Sided Arrow 
        NOTE: I modified the method names to match my capitlization.*/
        System.out.println("double sided arrow");//arguement
        drawUpTriangle();      
        drawVerticalLine();          
        drawDownTriangle();          

    }
    public static void drawHorizontalLine() {
        System.out.println("*********");
    }
    public static void drawVerticalLine() {
        System.out.println("    *    ");
        System.out.println("    *    ");
        System.out.println("    *    ");
    }
    public static void drawRectangle() {
        drawHorizontalLine();
        System.out.println("*       *");
        System.out.println("*       *");
        drawHorizontalLine();
    }
    public static void drawSquare() {
        System.out.println("**");
        System.out.println("**");
    }
    public static void drawUpTriangle() {
        System.out.println("    *    ");
        System.out.println("  *   *  ");
        System.out.println(" *     * ");
        drawHorizontalLine();
    }
    public static void drawDownTriangle() {
        drawHorizontalLine();
        System.out.println(" *     * ");
        System.out.println("  *   *  ");
        System.out.println("    *    ");
    }
    public static void drawCross() {
        System.out.println("*       *");
        System.out.println(" *     * ");
        System.out.println("    *    ");
        System.out.println(" *     * ");
        System.out.println("*       *");
    }
}
