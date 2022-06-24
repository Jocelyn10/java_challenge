import java.util.Scanner;

public class SumAndMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0, prod = 1;

        if (a < b) {
            for (int i = a + 1; i < b; i++) {
                sum = sum + i;
                prod = prod * i;
            }

            System.out.println("Sum : " + sum + " and Prod : " + prod);
        }

    }
}
