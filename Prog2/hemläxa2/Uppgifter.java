package hemläxa2;

import java.util.Scanner;

public class Uppgifter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
			Scanner sc = new Scanner(System.in);
		 	String bakot = reverse(sc);
		 	System.out.println("Det blir " + "'" + bakot + "'" + "baklänges");
		 
		 	//int total = okand(sc);
	        //System.out.println("Det totala är " + total);

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
	    
	    public static String reverse(Scanner sc){  
	        System.out.println("Skriv det som du vill ha baklänges");
	        String bakot = sc.nextLine();
	        String str = bakot;
	        bakot = "";
	        for(int i = str.length() - 1; i >= 0; i--) {
	     	   bakot += str.charAt(i);
	        }
	 		
	        return bakot;
	 	}
		
	}


