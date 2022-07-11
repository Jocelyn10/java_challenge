package mui;

public class Test1 {
    static int is123Array(int[] a) {
        if (a == null) {
            return 0;
        }

        if (a.length == 1) {
            return 1;
        }

        int maxValue = 0;

        for (int i = 1; i < a.length; i++) {
            if (a[i] > a[i - 1]) {
                maxValue = a[i];
            } else if (a[i] == a[0]) {
                continue;
            } else {
                return 0;
            }

            if (i == a.length - 1) {
                if (maxValue == a[a.length - 1]) {
                    return 1;
                } else {
                    return 0;
                }
            }
        }

        return 1;

    }

    public static void main(String[] args) {
        System.out.println(is123Array([1,2]));
    }
}
