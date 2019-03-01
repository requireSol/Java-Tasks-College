public class RecursiveMystery {
  public static void main(String[] args) {
    int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    Out.println(function1(values, 0));
    int[] values2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
    Out.println(function1(values2, 0));
  }
  public static int function1(int[] values, int i) {
    if (i == values.length) {
      return 0;
    }
    return values[i] + function2(values, i + 1);
  }
  public static int function2(int[] values, int i) {
    return -values[i] + function1(values, i + 1);
  }
}