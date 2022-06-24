import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        boolean isPrime = true;

        for (int i = 2; i < a / 2; i++) {
            if (a % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
