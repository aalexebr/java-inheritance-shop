package org.lessons.java.shop;

import java.util.Scanner;

final public class Carrello {
	public static void main(String[] args) {
		
		final int ITEM_QUANTITY = 3;
				
		Prodotto[] carrello = new Prodotto[ITEM_QUANTITY];
		
		Scanner in = new Scanner(System.in);
//		Televisore t1= new Televisore("name1","desc1",1.99,10,10,true);
//		System.out.println(t1);
		for(int x =0 ; x<ITEM_QUANTITY; x++) {
			System.out.println("smartphone = 1, tv = 2, headphones = 3");
			System.out.print("What item do you want to add?");
			String userChoise = in.nextLine();
			int choise = Integer.valueOf(userChoise);
			
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
			
			if(choise == 1) {
				System.out.print("input phone IMEI:");
				String imei = in.nextLine();
				
				System.out.print("memory in GB");
				String strMemory = in.nextLine();
				int memory = Integer.valueOf(strMemory);
				
				Smartphone prod = new Smartphone(prodName, prodDesc, price, iva, imei, memory);
				
				carrello[x] = prod;
				
			}
			else if(choise == 2) {
				System.out.print("diemnsion in pollici");
				String strDim = in.nextLine();
				int dimensions = Integer.valueOf(strDim);
				
				System.out.print("is it smrt? true / false");
				String strSmart = in.nextLine();
				Boolean smart = Boolean.valueOf(strSmart);
				
				Televisore prod = new Televisore(prodName, prodDesc, price, iva, dimensions, smart);
				carrello[x] = prod;
			}
			else if(choise ==3){
				System.out.print("colore:");
				String color = in.nextLine();
				
				System.out.print("is it wireless? true / false");
				String strWire = in.nextLine();
				Boolean wireless = Boolean.valueOf(strWire);
				
				Cuffia prod = new Cuffia(prodName, prodDesc, price, iva, color, wireless);
				carrello[x] = prod;
			}
			
		}
	
		in.close();
		
		for(int x=0; x<ITEM_QUANTITY; x++) {
			System.out.println(carrello[x]);
			System.out.println("\n-----------\n");
		}
		
	}
}
