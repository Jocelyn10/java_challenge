import java.util.Scanner;

public class PowerNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Base : ");
        int b = sc.nextInt();
        System.out.print("Exp : ");
        int e = sc.nextInt();

        int result = 1, i = 1;

        do {
            result = result * b;
            i++;
        } while (i <= e);

        System.out.println("Result : " + result);
    }
}
