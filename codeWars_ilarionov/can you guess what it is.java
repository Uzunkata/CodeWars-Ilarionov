public class JomoPipi {
  
    public static int code(int x, int y) {
    return solve(x) + solve(y);
  }
  
  public static int solve(int number) {
    if (number == 0) 
      return 9;
    
    int result = 0;
    for (int j = 1; number > 0; number /= 10, j *= 10) {
      result += (9 - number % 10) * j;
    }
    return result;
  }
}