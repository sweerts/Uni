import java.util.InputMismatchException;
import java.util.Scanner;

// BASED ON https://github.com/jasleenkaur/Graphics-in-console--in-Java-

class Geometry {
    private static final Class[] SHAPES = new Class[] {
            Circle.class,
            ArcOfCircle.class,
            HorizontalSine.class,
            VerticalSine.class,
            Rectangle.class,
            Cardiod.class,
            Hypocycloid.class,
            Epicycloid.class,
            Nephroid.class
    };

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {

        int choice;
        Scanner in = new Scanner(System.in);

        System.out.print("\n\t~~~~~~ Welcome to Geometry World ~~~~~~");
        System.out.print("\n\t\tWe have codes for Geometry shapes");
        System.out.print("\n\t\tWhich shape do you want?");
        System.out.print("\n\n\t------------------------------------");
        System.out.print("\n\t\tEnter 1 for Circle");
        System.out.print("\n\t\tEnter 2 for Arc of Circle");
        System.out.print("\n\t\tEnter 3 for Horizontal sine wave");
        System.out.print("\n\t\tEnter 4 for Vertical sine wave");
        System.out.print("\n\t\tEnter 5 for Rectangle");
        System.out.print("\n\t\tEnter 6 for Cardiod");
        System.out.print("\n\t\tEnter 7 for Hypocycloid");
        System.out.print("\n\t\tEnter 8 for Epicycloid");
        System.out.print("\n\t\tEnter 9 for Nephroid");
        System.out.print("\n\t-------------------------------------\n");

        try {
            choice = in.nextInt();
        } catch (InputMismatchException e) {
            System.err.println("Thats not a number!");
            return;
        }

        if(choice >= Geometry.SHAPES.length || choice < 0) {
            (new Geometry()).draw();
        } else {
            ((Geometry) Geometry.SHAPES[choice-1].newInstance()).draw();
        }
    }

    protected void draw() {
        System.err.println("Chosen shape does not exist.");
    }
}
