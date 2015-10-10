package product;


public class Product {
	private final double price;
	private final boolean isFragile;
	private final boolean isOverWeight;
	
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

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Product product = (Product) o;

		if (Double.compare(product.price, price) != 0) return false;
		if (isFragile != product.isFragile) return false;
		return isOverWeight == product.isOverWeight;

	}

	@Override
	public int hashCode() {
		int result;
		long temp;
		temp = Double.doubleToLongBits(price);
		result = (int) (temp ^ (temp >>> 32));
		result = 31 * result + (isFragile ? 1 : 0);
		result = 31 * result + (isOverWeight ? 1 : 0);
		return result;
	}
}

