import java.util.Scanner;

public class RecursiveFibonacci {

    public static int Fibonacci(int n)
    {
        if(n < 2) return n;
        return Fibonacci(n-1) + Fibonacci(n-2);
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int input = scan.nextInt();

        System.out.println("Term " + input + " of the Fibonacci sequence is " + Fibonacci(input) + ".");
    }
}
