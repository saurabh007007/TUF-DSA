import java.util.*;
public class Majority_Element {
  public static void main(String[] args) {
    int arr[]={2,2,1,1,1,2,2};
    System.out.println(Majority(arr));
  }
  public static int Majority(int arr[]){
    Arrays.sort(arr);
    int n =arr.length;
    return arr[n/2];
  }
}
