public class Remove_Duplicate {
    public static void main(String[] args) {
        int arr[]={1,2,3,43,43,43,3,37};
        System.out.println(Remove_Duplicate_Sorted(arr));
    }
    public static int Remove_Duplicate_Sorted(int arr[]){
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }
}
