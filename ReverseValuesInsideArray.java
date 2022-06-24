import java.util.Scanner;

public class ReverseValuesInsideArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        System.out.println("Array values : ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Num 1 : ");
        int a = sc.nextInt();
        System.out.println("Num 2 : ");
        int b = sc.nextInt();

        int index_a = 0, index_b = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                index_a = i;
            }

            if (arr[i] == b) {
                index_b = i;
            }
        }

        int c = arr[index_a];
        arr[index_a] = arr[index_b];
        arr[index_b] = c;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "  ");
        }

    }
}
