package org.lessons.java.shop;

import java.util.Scanner;

final public class Carrello {
	public static void main(String[] args) {
		
		final int ITEM_QUANTITY = 7;
				
		Prodotto[] carrello = new Prodotto[ITEM_QUANTITY];
		
		Scanner in = new Scanner(System.in);

		
		
		boolean exit = false;
		int x = 0;
		
		
		while(!exit){
			if(x == ITEM_QUANTITY) {
				break;
			}
			
			System.out.print("add item? y/n");
			String addOrNot = in.nextLine();
			char c = addOrNot.charAt(0);
			if(c== 'n') {
				exit = !exit;
				break;
			}
			
			
			System.out.println("smartphone = 1, tv = 2, headphones = 3");
			System.out.print("What item do you want to add?");
			String userChoice = in.nextLine();
			int choice = Integer.valueOf(userChoice);
			
			System.out.print("input product name:");
			String prodName = in.nextLine();
			
			System.out.print("input product description:");
			String prodDesc = in.nextLine();
			
			System.out.print("input product price:");
			String prodPrice = in.nextLine();
			double price = Double.valueOf(prodPrice);
			
			System.out.print("input product VAT:");
			String prodVAT = in.nextLine();
			double iva = Double.valueOf(prodVAT);
			
			
			if(choice == 1) {
				System.out.print("input phone IMEI:");
				String imei = in.nextLine();
				
				System.out.print("memory in GB");
				String strMemory = in.nextLine();
				int memory = Integer.valueOf(strMemory);
				
				Smartphone prod = new Smartphone(prodName, prodDesc, price, iva, imei, memory);
				
				carrello[x] = prod;
				
			}
			else if(choice == 2) {
				System.out.print("dimension in pollici");
				String strDim = in.nextLine();
				int dimensions = Integer.valueOf(strDim);
				
				System.out.print("is it smart? y / n");
				String strSmart = in.nextLine();
				char bool = strSmart.charAt(0);
				boolean isSmart;
				if(bool == 'y') isSmart = true;
				else isSmart = false;
//				Boolean smart = Boolean.valueOf(strSmart);
				
				Televisore prod = new Televisore(prodName, prodDesc, price, iva,dimensions, isSmart);
				carrello[x] = prod;
			}
			else if(choice == 3){
				System.out.print("colore:");
				String color = in.nextLine();
				
				System.out.print("is it wireless? y / n");
				String strWire = in.nextLine();
//				Boolean wireless = Boolean.valueOf(strWire);
				char bool = strWire.charAt(0);
				boolean isWireless;
				if(bool == 'y') isWireless = true;
				else isWireless = false;
				
				Cuffia prod = new Cuffia(prodName, prodDesc, price, iva,color, isWireless);
				carrello[x] = prod;
			}
			else {
				System.out.println("incorrect product value inserted can accept only 1 - 2 - 3");
				continue;
			}
			x++;
			
		}
		
		System.out.println("\n-----------\n");
		
		double total = 0;
		for(int j=0; j<ITEM_QUANTITY; j++) {
			if(carrello[j] == null) {
				break;
			}
			System.out.println(carrello[j]);
			
		}
//		BONUS LA STAMPA CON DUE CICLI SERVE SOLO PER VEDERE BENE IN CONSOLE POSSO FARE TUTTO IN 1 CICLO
		
		System.out.print("do you have fidelity card (y/n) ?");
		String strDiscount = in.nextLine();
		in.close();
		char disc = strDiscount.charAt(0);
		boolean discount;
		if(disc == 'y') discount = true;
		else discount = false;
		
		for(int j=0; j<ITEM_QUANTITY; j++) {
			if(carrello[j] == null) {
				break;
			}

			System.out.println("\n-----------\n");
			if(discount) {
				System.out.println("price: "+carrello[j].getDiscountPrice());
				total += carrello[j].getDiscountPrice();
			}
			else {
				System.out.println("price: "+carrello[j].getGrossPrice());
				total += carrello[j].getGrossPrice();
			}
			System.out.println("total: "+total);
			System.out.println("\n-----------\n");
		}
		
	}
}
