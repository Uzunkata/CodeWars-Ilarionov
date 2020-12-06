import java.util.*;
public class SystemOfEq
{
  public static int Solution(int n, int m) 
  {
    int count = 0, b;
    for (int a = 0; a <= n; a++) {
      b = n - a * a;
      if (b >= 0 && b%1==0 && a + b * b == m)
        count++;
  }
   return count; 
}
  }