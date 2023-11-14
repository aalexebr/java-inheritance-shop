package org.lessons.java.shop;

public class Cuffia extends Prodotto{
	
	private String color;
	private boolean wireless;
	
	public Cuffia(String name, String description,double price ,double iva, String color, boolean wireless) {
		super(name,description,price,iva);
		
		setColor(color);
		setWireless(wireless);
		
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isWireless() {
		return wireless;
	}

	public void setWireless(boolean wireless) {
		this.wireless = wireless;
	}
	
	public String toString() {
		// TODO Auto-generated method stub
		return "CUFFIA: \n"+ super.toString()
				+"color: "+ getColor() + "pollici" +"\n"
				+"type: "+ isWireless()+"\n";
		
		
	}

}
