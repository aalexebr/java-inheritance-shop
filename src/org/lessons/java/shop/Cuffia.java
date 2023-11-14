package org.lessons.java.shop;

public class Cuffia extends Prodotto{
	
	private String color;
	private boolean wireless;
	static private int extraDiscount = 7;
	
	public Cuffia(String name, String description,double price ,double iva,String color, boolean wireless) {
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
	
	@Override
	public double getDiscountPrice() {
		if(!wireless) {
			double x = (100.0 - extraDiscount)/100.0;
			double result = getGrossPrice()*x;
			return result;
		}
		// TODO Auto-generated method stub
		return super.getDiscountPrice();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "CUFFIA: "+ super.toString()
				+"color: "+ getColor() +"\n"
				+"type: "+ (isWireless()? "wireless":"cable")+"\n";
		
		
	}

}
