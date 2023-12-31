package org.lessons.java.shop;

public class Televisore extends Prodotto{
	
	private int dimensions;
	private boolean isSmart;
	static private int extraDiscount = 10;
	
	public Televisore(String name, String description,double price ,double iva, int dimensions, boolean isSmart) {
		super(name,description,price,iva);
		
		setDimensions(dimensions);
		setIsSmart(isSmart);
		
	}

	public int getDimensions() {
		return dimensions;
	}

	public void setDimensions(int dimensions) {
		this.dimensions = dimensions;
	}

	public boolean isSmart() {
		return isSmart;
	}

	public void setIsSmart(boolean isSmart) {
		this.isSmart = isSmart;
	}
	
	@Override
	public double getDiscountPrice() {
		if(!isSmart ) {
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
		return "TV: "+super.toString()
				+"diemnsions: "+ getDimensions() + "pollici \n"
				+"type: "+ (isSmart()? "smartTv": "notSmart")+"\n";
		
		
	}

}
