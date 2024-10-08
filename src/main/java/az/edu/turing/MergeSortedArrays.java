package az.edu.turing;

public class MergeSortedArrays {

    public static void main(String[] args) {
        int[] a = {2, 4, 5, 6};
        int[] b = {1, 3, 7, 8};
        int[] mergedArray = mergeSortedArrays(a, b);
        System.out.println("Merged array: ");
        for (int num : mergedArray) {
            System.out.println(num + " ");
        }

    }

    public static int[] mergeSortedArrays(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                result[k++] = a[i++];
            } else {
                result[k++] = b[j++];
            }
        }
        while (i < a.length) {
            result[k++] = a[i++];
        }
        while (j < b.length) {
            result[k++] = b[j++];
        }
        return result;
    }
}
