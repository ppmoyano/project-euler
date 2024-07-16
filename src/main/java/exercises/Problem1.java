package exercises;

public class Problem1 {
    /*
    If we list all the natural numbers below $10$ that are multiples of $3$ or $5$, we get $3, 5, 6$ and $9$. The sum of these multiples is $23$.
    Find the sum of all the multiples of $3$ or $5$ below $1000$.
     */
    public static void main(String[] args) {
        int sumatoria = 0;
        for (int i = 0; i < 1000; i++) {
            if (is3Multiply(i) || is5Multiply(i)) {
                sumatoria = sumatoria + i;
            }
        }
        System.out.println("El resultado es " + sumatoria);
    }

    public static boolean is3Multiply(int num) {
        return (num % 3) == 0;
    }

    public static boolean is5Multiply(int num) {
        return (num % 5) == 0;
    }
}

