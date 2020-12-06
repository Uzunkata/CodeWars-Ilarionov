import java.security.MessageDigest;
public class Kata {
  public static String F(String s) {
      if (( s != null && s.length() != 0 ) && illegal(s)) return "";
      try{
        byte[] bytes = MessageDigest.getInstance("MD5").digest(s.getBytes());
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
          if ((b&0xFF) < 0x10) sb.append("0");
          sb.append(Integer.toHexString(b & 0xFF));
        }
        return sb.reverse().toString();
      }catch (Exception e){
        e.printStackTrace();
      }
      return null;
    }
  public static boolean illegal(String s){
      if (s.indexOf('\n') >= 0) return true;
      for (char c : s.toCharArray()) {
        if (c > 127) return true;
      }
      return false;
  }
}