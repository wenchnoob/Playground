package math;

public class Sequences {
	public Sequences() {
		
	}
	
	public int [] aSeq(int size, int a1, int d) {
		int[] seq = new int[size];
		for(int i = 0; i < size; i++) {
			seq[i] = a1 + d * i;
		}
		return seq;
	}
	public int [] rASeq(int term, int a1, int d, int[] memo) {
		if(term == 1) {
			memo[0] = a1;
			return memo;
		}else{
			memo[term - 1] = rASeq(term - 1, a1, d, memo)[term - 2] + d;
			return memo;
		} 
	}
	
	public int [] gSeq(int size, int a1, int r) {
		int[] seq = new int[size];
		for(int i = 0; i < size; i++) {
			seq[i] = (int) (a1 * Math.pow(r, i));
		}
		return seq;
	}
	public int [] rGSeq(int term, int a1, int r, int[] gmemo) {
		if(term == 1) {
			gmemo[0] = a1;
			return gmemo;
		}else{
			gmemo[term - 1] = rGSeq(term - 1, a1, r, gmemo)[term - 2] * r;
			return gmemo;
		} 
	}
	
	public int sum(int[] arr) {
		int sum = 0;
		for(int term: arr) {
			sum += term;
		}
		return sum;
	}
	
	public int sumASeq(int[] aSeq, int n) {
		return (n/2) * ((2 * aSeq[0]) + ((aSeq[1] - aSeq[0]) * (n-1)));		
	}
}
