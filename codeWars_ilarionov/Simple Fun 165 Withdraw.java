public class Solution {

    public static int[] withdraw(int n) {
        int dollars[] = {0, 0, 0};
      do{
        if(n>=100 && (n>130 || n%20==0)){
          dollars[0]++;
          n -= 100;
        }else if(n>=50 && n%20!=0){
          dollars[1]++;
          n -= 50;
        }else{
          dollars[2]++;
          n -= 20;
          }
          
      }while(n>0);
      
      
        return dollars;
    }
}