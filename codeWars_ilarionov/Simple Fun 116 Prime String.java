public class Kata {
    public static boolean primeString(String s) {
       if(s.length() == 1) return true;
         String duplicateString = s + s;   // This contains the duplicate string
         String trimedString = duplicateString.substring(1);
         int indexOfStringInTrimedString = trimedString.indexOf(s);  //this return stating index of s if prime otherwise - 1;

          return indexOfStringInTrimedString + 1 == s.length();      // The length of the string is 1 + indexOfStringInTrimedString if primeString

    }
}