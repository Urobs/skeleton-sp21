/** Class that prints the Collatz sequence starting from a given number.
 *  @author YOUR NAME HERE
 */
public class Collatz {

    public static boolean isOddNumber(int n) {
        return n % 2 != 0;
    }

    /** Returns the nextNumber in a Collatz sequence. */
    public static int nextNumber(int n) {
        if (n == 1) {
            return 1;
        }
        if (isOddNumber(n)){
            return 3 * n + 1;
        } else {
            return n / 2;
        }
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.print(n + " ");
        while (n != 1) {
            n = nextNumber(n);
            System.out.print(n + " ");
        }
        System.out.println();
    }
}

