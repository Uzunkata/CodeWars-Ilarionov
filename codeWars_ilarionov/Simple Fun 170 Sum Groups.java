import java.util.*;
import java.util.LinkedList;

public class Solution {

    public static int sumGroups(int[] arr) {

        if(arr.length==1)
            return arr.length;

        int sum = 0;
        boolean sumed = false;
        ArrayList <Integer> temp = new ArrayList <Integer> ();

        for(int i = 0; i<arr.length-1; i++){
            if(arr[i]%2==0 && arr[i+1]%2==0){
                if(sumed) {
                    sum += arr[i + 1];
                }else{
                    sum += arr[i]+arr[i+1];
                    sumed = true;
                }

                if(i+1 == arr.length-1)
                    temp.add(sum);
            }else if (arr[i]%2!=0 && arr[i+1]%2!=0){
                if(sumed) {
                    sum += arr[i + 1];
                }else{
                    sum += arr[i]+arr[i+1];
                    sumed = true;
                }

                if(i+1 == arr.length-1)
                    temp.add(sum);
            }else {
                if (sumed) {
                    temp.add(sum);
                    sumed = false;
                    sum = 0;
                } else
                    temp.add(arr[i]);

                if (i + 1 == arr.length - 1)
                    temp.add(arr[i + 1]);

            }
        }

        int[] array = new int[temp.size()];
        for(int i = 0; i<array.length; i++){
            array[i]=temp.get(i);
        }

        for(int i = 0; i<array.length-1; i++)
            if(arr[i]%2==0 && arr[i+1]%2==0){
                return sumGroups(array);

            }else if (arr[i]%2!=0 && arr[i+1]%2!=0){
                return sumGroups(array);

            }else{
                //do nothing
            }
        return array.length;
    }
}