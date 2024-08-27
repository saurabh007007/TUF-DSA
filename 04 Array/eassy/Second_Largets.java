public class Second_Largets {
public static void main(String[] args) {
    int arr[]={12,35,1,10,34,1};
    System.out.println(Second(arr));
}
public static int Second(int arr[]){
    int largest=arr[0];
    int slarge=-1;
    for(int i=1;i<arr.length;i++){
        if (arr[i]>largest) {
            slarge=largest;
            largest=arr[i];
        }else if(arr[i]>slarge && arr[i]!=largest){
            slarge=arr[i];
        }
        
    }
    return slarge;
}
}
