public class Single_Number {
  public static void main(String[] args) {
    int arr[]={1,2,2};
    System.out.println(Single(arr));
  }
  public static int Single(int arr[]){
    int s=0;
    for(int i=0;i<arr.length;i++){
      s^=arr[i];
    }
    return s;
  }
}
