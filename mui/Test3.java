package mui;

public class Test3 {
    static int isMercurial(int a[], int len) {
        if (a == null) {
            return 1;
        }

        if (len == 0 || len == 1) {
            return 1;
        }

        int indexFirstOne = 0;
        int indexSecondOne = 0;
        int indexThreeValue = 0;

        for (int i = 0; i < len - 1; i++) {
            if (a[i] == 1) {
                if (indexFirstOne == 0) {
                    indexFirstOne = i;
                } else {
                    indexSecondOne = i;
                }
            }

            if (a[i] == 3) {
                indexThreeValue = i;
            }

            if (indexFirstOne < indexThreeValue && indexThreeValue < indexSecondOne) {
                return 0;
            }
        }

        return 1;

    }

    public static void main(String[] args) {
        // System.out.println(is123Array([1,2]));
    }
}
