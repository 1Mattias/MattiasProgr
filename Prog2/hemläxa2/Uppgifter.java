package hemläxa2;

import java.util.ArrayList;
import java.util.Scanner;

public class Uppgifter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
	 	
			
			
			
			
		 	//int total = okand(sc);
	        //System.out.println("Det totala är " + total);

			
			
//		        System.out.println("Skriv det som du vill ha baklänges");
//		        String str = sc.nextLine();
//		        String backwards = reverse(str);
//		        System.out.println("Det blir " + "'" + backwards + "'" + " baklänges");
//		   
			ArrayList<Object> jae = Nae();

	        System.out.println(jae);

	    }

	    public static ArrayList<Object> Nae() {
	        Scanner sc = new Scanner(System.in);
	        int random = (int)(Math.random() * 10);
	        ArrayList<Object> objekt = new ArrayList<Object>();
	        for(int i = 0; i < random; i++) {
	            System.out.println("Skriv ett ord.");
	            Object in = (Object) sc.nextLine();
	            objekt.add(in);

	        }
	        sc.close();
	        return objekt;

	    }

		    public static String reverse(String str) {
		        if(str.isEmpty())
		            return str;

		        return reverse(str.substring(1)) + str.charAt(0);
		    }
			
			
			
	    

	    public static int okand(Scanner sc) {
	        int total = 0;
	        int i=0;
	        int random = (int)(Math.random() * 10);
	        while(i < random) {
	            System.out.println("Skriv in ett heltal");
	            int in = sc.nextInt();
	            total += in;
	            i++;

	        }

	        return total;
	    }
	    
	  
	}


