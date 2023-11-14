package org.lessons.java.shop;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Random;

public class Prodotto {

	protected int code;
	protected String name;
	protected String description;
	protected double price;
	protected double iva;
	
	public Prodotto(String name, String description,double price ,double iva) {
		setCode();
		setName(name);
		setDescription(description);
		setPrice(price);
		setIva(iva);
		
	}
	
	public int getCode() {
		return this.code;
	}
	
	private void setCode() {
		Random rnd = new Random();
		this.code = rnd.nextInt(0,2147483647);
//		test for padding 0 pre code
//		this.code = 1;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		if(name.length()>=3) {
			this.name = name;	
		}
		else {
			return;
		}
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public void setDescription(String description) {
		if(description.length()>3) {
			this.description = description;	
		}
		else {
			return;
		}
	}
	
	public void setPrice(double price) {
		if(price>=0.01) {
			this.price = price;
		}
		else {
			return;
		}
		
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public void setIva(double iva) {
		if(iva>=0) {
			this.iva = iva;	
		}
		else {
			return;
		}
		
	}
	
	public double getIva() {
		return this.iva;
	}
	
	
	public double getGrossPrice() {
		double x = getIva()/100.0;
		double y = x*getPrice();
		double result = getPrice()+y;
		return  result ;
		
	}
	
	public String getExtendedName() {
		return getCode()+"-"+getName();
		
	}

	NumberFormat formatter = new DecimalFormat("#0,00");
	
	@Override
	
	public String toString() {
		return "\n"
				+ "code: " + String.format("%08d",getCode())  + "\n"
				+ "name: " + getName() + "\n"
				+ "desc: " + getDescription()+ "\n"
				+ "price: " + getPrice()+ "\n"
				+ "iva: " + getIva()+ "%\n"
				+ "prezzo con iva: " + String.format("%.01f",getGrossPrice())+ "\n"
				+ "full product name: " + getExtendedName()+ "\n";
		
		
	}
	
}
