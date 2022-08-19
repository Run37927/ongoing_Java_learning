

public class printPrime {
    public static void main(String[] args) {
        printPrimesBetween(1, 50);
    }

    public static boolean isPrime(int n) {
        if (n == 1)
            return false;

        for (int i = 2; i <= n/2; i ++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }

    public static void printPrimesBetween(int start, int end) {
        for (int i = start; i <=end; i ++) {
            if (isPrime(i))
                System.out.print(i+ " ");
        }
    }
}
