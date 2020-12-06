public class Dinglemouse {

  public static int[] coffeeLimits(final int year, final int month, final int day) {
        int cafe = 0;
        int decaf = 0;
    
        int h = year * 10000 + month * 100 + day;
        for (int i = 1; i <= 5000; i++) {
            h += 0xCAFE;
            if (Integer.toHexString(h).contains("dead")) {
                cafe = i;
                break;
            }
        }
    
        h = year * 10000 + month * 100 + day;
        for (int i = 1; i <= 5000; i++) {
            h += 0xDECAF;
            if (Integer.toHexString(h).contains("dead")) {
                decaf = i;
                break;
            }
        }
        return new int[]{cafe, decaf};
  }
}