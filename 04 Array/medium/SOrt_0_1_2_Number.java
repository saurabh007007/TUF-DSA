public class SOrt_0_1_2_Number {
  public static void main(String[] args) {
    int arr[]={1,0,0,1,2,1,0,1,2};
    sortColors(arr);
    for(int i=0;i<arr.length;i++){
      System.out.println(arr[i]);
    }
  }
  
  public static void sortColors(int[] nums) {
        int n=nums.length;
        int arr[]=new int[3];
        for(int i=0;i<n;i++){
            int element=nums[i];
            arr[element]++;
        }
        int j=0;
        for(int i=0;i<3;i++){
            while(arr[i]>0){
                nums[j]=i;
                j++;
                arr[i]--;
            }
        }
  
}
}
