public class App {
    public static void main(String[] args) {
        System.out.println("Horizontal Line:");
        drawHorizontalLine();
        System.out.println("Vertical Line:");
        drawVerticalLine();
        System.out.println("Rectangle:");
        drawRectangle();
        System.out.println("Square:");
        drawSquare();
        System.out.println("Up Triangle:");
        drawUpTriangle();
        System.out.println("Down Triangle:");
        drawDownTriangle();
        System.out.println("Cross:");
        drawCross();
        System.out.println("House:");
        drawUpTriangle();
        drawRectangle();
        System.out.println("Hourglass:");
        drawHorizontalLine();
        drawCross();
        drawHorizontalLine();
    }
    public static void drawHorizontalLine() {
        System.out.println("*********");
    }
    public static void drawVerticalLine() {
        System.out.println("*");
        System.out.println("*");
        System.out.println("*");
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
        System.out.println("    *  ");
        System.out.println(" *     * ");
        System.out.println("*       *");
    }
}
