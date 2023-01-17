import java.util.Scanner;

/**
 * RecursiveFibonacci is a standalone class that uses recursion to yield
 * the resulting Fibonacci number for a given an integer, which output is
 * plainly displayed in the form of descriptive text.
 *
 * @author Richmond Lao
 * @version %I% %G%
 */
public class RecursiveFibonacci {

    /**
     * Calculates the Fibonacci sequence using a number from given integer input.
     * This method will return the argument <code>n</code> if it is less than 2.
     * If <code>n</code> is greater than 2, it will return the sum of two method calls
     * to itself with modified arguments: <code>(n-1)</code> and <code>(n-2)</code>.
     *
     * @param n the integer to be calculated
     * @return <code>n</code> if <code>n</code> is less than 2;
     *         <code>Fibonacci(n-1) + Fibonacci(n-2)</code> otherwise
     */
    public static int Fibonacci(int n)
    {
        if(n < 2) return n;
        return Fibonacci(n-1) + Fibonacci(n-2);
    }

    /**
     * Displays a descriptive text denoting a given integer input and the
     * resulting Fibonacci number.
     * This main method calls on <code>Fibonacci(int n)</code>.
     *
     * @param args command line arguments
     */
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int input = scan.nextInt();

        System.out.println("Term " + input + " of the Fibonacci sequence is " + Fibonacci(input) + ".");
    }
}
