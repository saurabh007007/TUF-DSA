public class Find_Missing_Number {
    public static void main(String[] args) {
        int arr[]={1,0,3};
        System.out.println(missingNumber(arr));
    }
    public static int missingNumber(int[] nums) {
        int sum = 0;
        int n = nums.length;
        int orgsum = n*(n+1) / 2;
        for(int i=0; i<n; i++) {
            sum += nums[i];
        }
        
        return orgsum - sum;
    }
}
