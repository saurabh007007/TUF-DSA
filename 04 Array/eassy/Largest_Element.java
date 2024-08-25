public class Largest_Element {

    static int largestElement(int[] arr, int n) {
        int large = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > large) {
                large = arr[i];
            }
        }
        return large;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 45, 5, 9 };
        int n = 6;
        System.out.println(largestElement(arr, n));
    }
}
