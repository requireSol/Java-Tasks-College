public class Square {
       
       public static int n;
       
       public static void main(String[] args) {

       Out.print("Bitte geben Sie ein n ein (n * n wird berechnet): ");
       n = In.readInt();
       
       int direct = squareDirect();
       int a = squareIterative(n);

       Out.println("n * n = " + a);
       Out.println(a == direct);
       }
  
       public static int squareDirect() {
       int l;
       l = n * n;
       return l; 
       }

       public static int squareIterative(int n) {
       
       int sum;
       sum = n*n;
       return sum;
       
       }
}