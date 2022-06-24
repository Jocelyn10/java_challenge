public class ArrayLoop {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 13, 4, 5, 6, 17, 8, 9, 10 };
        int[] arr2 = { 11, 12, 13, 2, 15, 16, 17, 9, 19, 20 };

        // Find duplicate values from two arrays
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.println(arr1[i]);
                }
            }
        }

        int[] arr3 = new int[10];

        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr1[i];
        }

        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + "   ");
        }
        System.out.println();
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr2[i] + "   ");
        }
    }

}
