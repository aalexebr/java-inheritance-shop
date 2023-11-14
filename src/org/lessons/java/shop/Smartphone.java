package org.lessons.java.shop;

public class Smartphone extends Prodotto{
	
	private String codeIMEI;
	private int memory;
	
	public Smartphone(String name, String description,double price ,double iva, String codeImei, int memory) {
		super(name,description,price,iva);
		
		setCodeIMEI(codeImei);
		setMemory(memory);
	}

	public String getCodeIMEI() {
		return codeIMEI;
	}

	public void setCodeIMEI(String codeIMEI) {
		this.codeIMEI = codeIMEI;
	}

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "SMARTPHONE: \n"+super.toString()
				+"memory: "+ getMemory() + "GB \n"
				+"IMEI: "+ getCodeIMEI()+"\n";
		
		
	}
}
