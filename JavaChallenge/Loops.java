public class Loops {
    public static void main(String[] args) {
        // Exercise 1
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j); // We use print instead of println because we want to print the value in the
                                     // same line
            }

            for (int k = 6; k > i; k--) {
                System.out.print("*");
            }

            System.out.println();
        }

        System.out.println();

        // Exercise 2
        for (int i = 6; i > 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(j);
            }

            for (int k = 6; k >= i; k--) {
                System.out.print("&");
            }

            System.out.println();
        }

        // Exercise 3
        for (int i = 6; i > 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(j);
            }

            for (int k = 6; k >= i; k--) {
                System.out.print("&");
            }

            System.out.println();
        }
    }
}
