import java.util.*;
public class JomoPipi {
    public static String numericals(String s) {
      HashMap<Character, Integer> characters = new HashMap<Character, Integer>();
      StringBuilder res = new StringBuilder();  
      for(int i = 0; i< s.length(); i++){
        char ch = s.charAt(i);
        if(characters.containsKey(ch)) {
          int val = characters.get(ch).intValue();
          characters.replace(ch,++val);
        } else{
          characters.put(ch,1);
          }
        
        //s.replace(ch, characters.get(ch).charValue());
        res.append(characters.get(ch));
      }
      return res.toString();
    }
}