public class RecursivePower {
  
  public static void main(String... args) {
    int base = Integer.parseInt(args[0]);
    int exp = Integer.parseInt(args[1]);
    
    System.out.println(  base + "^" + exp + " = "
    + powerIterative(base, exp)
    + " (iteratively calculated).");
    
    System.out.println(  base + "^" + exp + " = "
    + powerRecursive(base, exp)
    + " (recursively calculated).");
  }
  
  public static int powerIterative(int base, int exp) {
    int pow = 1;
    for (int i = 0; i < exp; i++) {
      pow *= base;
    }
    return pow;
  }
  
   public static int powerRecursive(int base, int exp) {
    if (exp == 0) {
      return 1;
    } // end of if
    
    if (exp == 1) {
      return base;
    } 
    base = base * base;
    return powerRecursive(base, exp - 1);
  }
  
}