package com.math;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		Sequences gen = new Sequences();
		
		int[] seq1 = gen.aSeq(20, 2, 5);
		int sum = gen.sum(seq1);
		System.out.println(Arrays.toString(seq1) + "  " + sum);
		
		int[] seq2 = gen.gSeq(15, 2, 2);
		int sum2 = gen.sum(seq2);
		System.out.println(Arrays.toString(seq2) + "  " + sum2);
		
		int[] aMemo = new int[15];
		aMemo = gen.rASeq(15, 3, 4, aMemo);
		System.out.println(Arrays.toString(aMemo) + "  " + gen.sumASeq(aMemo, 50));
		
		int[] aMemo50 = Arrays.copyOf(aMemo, 50);
		aMemo50 = gen.rASeq(50, 3, 4, aMemo50);
		System.out.println(Arrays.toString(aMemo50));
		
		int[] memo2 = new int[15];
		memo2 = gen.rGSeq(15, 3, 4, memo2);
		System.out.println(Arrays.toString(memo2));
	}
	
}
