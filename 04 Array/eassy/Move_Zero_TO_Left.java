public class Move_Zero_TO_Left {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 67, 02, 0, 2, 0, 0 };
        Move_Zero(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    public static void Move_Zero(int arr[]) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }
        if (j == -1)
            return;
        for (int i = j + 1; i < arr.length; i++) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j++;
        }
    }
}
