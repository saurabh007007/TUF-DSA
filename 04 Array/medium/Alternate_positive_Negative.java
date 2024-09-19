class Solution {
    public int[] rearrangeArray(int[] nums) {
        int p=0;
        int ni=1;
        int[] result=new int [nums.length];
        for(int num:nums){
            if(num>=0){
                result[p]=num;
                p+=2;
            }else{
                result[ni]=num;
                ni+=2;
            }
        }
        return result;
    }
}