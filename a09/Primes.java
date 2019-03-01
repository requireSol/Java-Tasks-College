public class Primes {

	public static void main(String[] args) {
    
		for (String arg : args) {
    
			int x = Integer.parseInt(arg);
			Out.println( x + " is " + (isPrimeRecursiv(x,2) ? "" : "not ")
			+ "a prime.");
		
		}
	
	}

	public static boolean isPrimeRecursiv(int n,int t) {      
		
		for (int i = 3; i * i <= n; i += 2){
            
			if (n % i == 0) {
                return false;
            }
        }
		
		if(n == 2 || n == 1) {
            return false;
        }

		if(n % t == 0){
            return false;
        }
        else if(t > n/t) {
            return true;
        } 
		else {
			return isPrimeRecursiv(n , t + 2);
        }    
	
	}

}