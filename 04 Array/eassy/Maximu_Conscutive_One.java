public class Maximu_Conscutive_One {
  
  public static void main(String[] args) {
    int arr[]={1,1,0,1,1,1};
    System.out.println(MaximumOne(arr));

  }
  public static int MaximumOne(int arr[]){
    int c=0;
    int m=0;
    for(int i=0;i<arr.length;i++){
      if(arr[i]==1){
        c++;
      }else{
        c=0;
      }
      m=Math.max(m, c);

    }
    return m;
  }
}
