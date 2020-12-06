public class Solution {    
    public static int uniquePaths(int m, int n) {

        if (m < 2 || n < 2) {
            return 1;
        } else {
            return uniquePaths(m - 1, n) + uniquePaths(m, n - 1);
        }
    }

    public static int travelChessboard(String s) {
        int x = Character.getNumericValue(s.charAt(6)) - Character.getNumericValue(s.charAt(1)) + 1;
        int y = Character.getNumericValue(s.charAt(8)) - Character.getNumericValue(s.charAt(3)) + 1;

        return uniquePaths(x, y);
    }
}