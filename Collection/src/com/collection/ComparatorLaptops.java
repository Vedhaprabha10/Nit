package com.collection;

public class ComparatorLaptops implements Comparable<ComparatorLaptops>
{
	private String Brand;
	private int Ram;
	private int Rom;
	
	
	public ComparatorLaptops(String brand, int ram, int rom) {
		super();
		Brand = brand;
		Ram = ram;
		Rom = rom;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public int getRam() {
		return Ram;
	}
	public void setRam(int ram) {
		Ram = ram;
	}
	public int getRom() {
		return Rom;
	}
	public void setRom(int rom) {
		Rom = rom;
	}
	
	@Override
	public String toString() {
		return "Laptops [Brand=" + Brand + ", Ram=" + Ram + ", Rom=" + Rom + "]";
	}
	@Override
	public int compareTo(ComparatorLaptops L) {
		
		return this.Brand.compareToIgnoreCase(L.Brand);
	}			
}
