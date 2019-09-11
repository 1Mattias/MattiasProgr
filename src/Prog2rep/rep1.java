package Prog2rep;

import java.util.stream.IntStream;

public class rep1 {
	
	
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			int[] a = {10,20,30,40,50};
			int sum = IntStream.of(a).sum();
			System.out.println("The sum is " + sum);
			
		}

	}


