public class SpyGraduation {
  public String decrypt(String encrypted) {
    char[] r=encrypted.toCharArray();
    for(int i=0; i<r.length; i++)
      r[i]&=255;
    
    return String.valueOf(r);
  }
}