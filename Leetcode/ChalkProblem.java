

public class ChalkProblem {
  public static void main(String[] args) {
    

  }
    //normal Solution that is brutalforece approach
   public int chalkReplacer(int[] chalk, int k) {
        // while(true){
        // for(int i=0;i<chalk.length;i++){
        //     if(k<chalk[i]){
        //         return i;
        //     }
        //     k=k-chalk[i];
        // }
        // }
        //Above is Simple Simulation Approach
        int n=chalk.length;
        long sum=0;
        for(int i=0;i<chalk.length;i++){
            sum+=chalk[i];
            if(sum>k){
                break;
            }
        }
        int it=(int)(k%sum);
        for(int i=0;i<chalk.length;i++){
            if(it<chalk[i]){
                return i;
            }
            it =it -chalk[i];
        }
        return -1;
    }
}
