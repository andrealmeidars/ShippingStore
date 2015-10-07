package product;

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

	public boolean isFragile() {
		return isFragile;
	}

	public boolean isOverWeight() {
		return isOverWeight;
	}

}

