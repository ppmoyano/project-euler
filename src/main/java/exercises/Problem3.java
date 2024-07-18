package exercises;
/*
result: 6857
The prime factors of $13195$ are $5, 7, 13$ and $29$.
What is the largest prime factor of the number $600851475143$?
 */
public class Problem3 {
    public static void main(String[] args) {
        long number = 600851475143L;
        for (int i = 3; i <= (number / 2); i++) {
            if (number % i == 0) {
                number = number / i;
            }
        }
        System.out.println("Factor primo más grande: " + number);
    }
}