package v10;

import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListt {

	public static void main(String[] args) {

		int[] jonny = {1, 2, 3, 4, 5};
		String[] namn = {"sträng", "Hej"};
		
		for (int i = 0; i < namn.length; i++) {
			System.out.println(jonny[i]);
		}
		
		ArrayList<String> nameList = new ArrayList<>();
		
		nameList.add("Olle");
		nameList.add("Lisa");
		nameList.add("Lasse");
		nameList.add(1, "Gustav");
		nameList.set(2, "Ola");
		nameList.remove("Ola");
		
		
		for (int i = 0; i < nameList.size(); i++) {
			
			System.out.print(nameList.get(i) + " " );
			
		}
		
		
	}

}
