package com.reference.mod;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
//import java.util.logging.*;


public class MorphingArr {

	public static void main(String[] args) throws IOException {
		ArrayList<Integer> inputs = new ArrayList<>();
		
		Scanner scan = new Scanner(System.in);
		
		int value = scan.nextInt();
		while (value != 0){
			inputs.add(value);
			value = scan.nextInt();
		}
		
		FileWriter file1 = new FileWriter("/Users/Student/Desktop/temp.txt");
		
		String toWrite = "";
		
		for(Integer i : inputs) {
			toWrite += (i.toString() + "\n");
		}
		
		file1.write(toWrite);
		
		
		file1.close();
		scan.close();
	}

}
