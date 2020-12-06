public class Reverser {
  public static int[] reverse(int[] array) {
    return java.util.stream.IntStream
      .range(0, array.length)
      .map(i -> array[array.length-1-i])
      .toArray();
  }
  
}