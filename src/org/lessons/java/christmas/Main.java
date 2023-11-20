package org.lessons.java.christmas;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String name;
		String recipient;
		String risposta;
		List<Wish> wishList = new ArrayList<>();
		
		do {
			
			System.out.println("Quale regalo vorresti per Natale: ");
			name = sc.nextLine();
			 
			System.out.println("A chi è destinato: ");
			recipient = sc.nextLine(); 
			
			 Wish wish = new Wish(name, recipient);
			 
			 wishList.add(wish);
			 
			 System.out.println("La lunghezza della lista è di: " + wishList.size());
			 
			 System.out.println("\n------------------------------------------------------------");
				System.out.println("\n------------------------------------------------------------");

			 
			 System.out.println("Vorresti inserire un altro regalo?");
			 risposta = sc.nextLine();
			 
		}while(!risposta.equals("no"));
		
		System.out.println("La lunghezza della lista è di: " + wishList.size() + " " + "elementi");
		
		System.out.println("\n------------------------------------------------------------");
		System.out.println("\n------------------------------------------------------------");

		
		Collections.sort(wishList);
		System.out.println("La lista con nome e destinatario è: " + wishList);
		
		System.out.println("\n------------------------------------------------------------");
		System.out.println("\n------------------------------------------------------------");

		
		 for (Wish w : wishList) {

	            System.out.println("La lista ordinata per nome del regalo è: " + w);
	        }
		
	}

	
}
