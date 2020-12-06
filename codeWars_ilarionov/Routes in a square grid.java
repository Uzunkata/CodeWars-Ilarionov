public class RoutesCalc {
  
  public static long calculateRoutes(int n) {
      long resut = 1L;
      if(n < 1)
          resut = 0L;
      
      else{
          for(int i = 1; i <= n; i++){
              resut = resut*(n+i)/i;
          }
      }
      return resut;
  }

}