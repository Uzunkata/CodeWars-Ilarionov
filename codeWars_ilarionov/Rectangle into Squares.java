import java.util.*;
public class SqInRect {
  
  public static List<Integer> sqInRect(int lng, int wdth) {
    List<Integer> list = new ArrayList<>();
        if(lng==wdth)return null;

        while (lng > 0 && wdth > 0) {
            int min;
            if (lng > wdth) {
                min = wdth;
                lng -= min;
            } else {
                min = lng;
                wdth -= min;
            }
            list.add(min);

        }

        return list;
  }
}