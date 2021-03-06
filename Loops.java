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

        System.out.println();

        // Exercise 3

        final int MAX_NUMBER = 6;

        for (int i = 1; i <= MAX_NUMBER; i++) {
            for (int j = 1; j <= i; j++) {
                if (i < MAX_NUMBER) {
                    if (j == 1) {
                        System.out.print("@");
                    } else if (j == i) {
                        System.out.print(" @");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    System.out.print("@");
                }
            }

            System.out.println();
        }

        System.out.println();

        // Exercise 4

        for (int i = 6; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            for (int k = 6; k >= i; k--) {
                System.out.print("$");
            }

            for (int k = 6; k >= i; k--) {
                System.out.print("$");
            }

            System.out.println();
        }

        System.out.println();

        // Exercise 5

        System.out.println("      #");

        for (int i = 6; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            System.out.print("#");

            for (int k = 6; k >= i; k--) {
                System.out.print(" ");
            }

            for (int k = 6; k >= i; k--) {
                System.out.print(" ");
            }

            System.out.print("#");
            System.out.println();
        }

        for (int k = 7; k >= 0; k--) {
            System.out.print("# ");
        }

    }
}
