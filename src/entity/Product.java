package entity;

public class Product {
	private double price;
	private boolean isFragile;
	private boolean isOverWeight;
	
	public Product(double price, boolean isFragile, boolean isOverWeight) {
		this.price = price;
		this.isFragile = isFragile;
		this.isOverWeight = isOverWeight;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean isFragile() {
		return isFragile;
	}
	public void setFragile(boolean isFragile) {
		this.isFragile = isFragile;
	}
	public boolean isOverWeight() {
		return isOverWeight;
	}
	public void setOverWeight(boolean isOverWeight) {
		this.isOverWeight = isOverWeight;
	}
}

