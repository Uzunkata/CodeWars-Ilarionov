public class FindThePoison {

    public int find(int[] rats) {
    int bottle = 0;
    
    for(int i : rats)
      bottle += Math.pow(2, i);
    
    return bottle;
    }
}