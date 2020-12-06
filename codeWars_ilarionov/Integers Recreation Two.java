import java.util.List;
import java.util.ArrayList;

public class SqProd2Sum {
    public static List<long[]> prod2Sum(long a, long b, long c, long d) {
        List<long[]> list = new ArrayList<long[]>();
        long[] arr1 = new long[] {Math.abs(a * c - b * d), b * c + a * d};
        long[] arr2 = new long[] {Math.abs(b * c - a * d), a * c + b * d};
        
        long temp; 
        if (arr1[0] > arr1[1]) { temp = arr1[0]; arr1[0] = arr1[1]; arr1[1] = temp; }
        if (arr2[0] > arr2[1]) { temp = arr2[0]; arr2[0] = arr2[1]; arr2[1] = temp; }
        
        if (arr1[0] == arr2[0]) list.add(arr1);
        else 
        if (arr1[0] < arr2[0]) { list.add(arr1); list.add(arr2); }
        else { list.add(arr2); list.add(arr1); }
        
        return list;
    }
}