package Recursion;


public class Fib {

		public static void main(String[] args) {
			
			long[] fibNums = new long[100001];
			
			System.out.println(fib(15, fibNums));
			System.out.println(fib(45, fibNums));
			System.out.println(fib(100000, fibNums));
			for(int i = 0; i < fibNums.length -1 ; i++) {
				System.out.println("This is Fibonnaci number " + i + ": " + fibNums[i]);
			}
			
		}
		
		public static long fib(int n, long[] memo) {
			
			if (memo[(int)n] != 0) {return memo[n];}
			
			if(n >= 3) {
				long fib = fib(n-1, memo) + fib(n-2, memo);
				memo[n] = fib;
				return fib;
			} else {
				memo[n] = 1;
				return 1;
			}
		}
}
