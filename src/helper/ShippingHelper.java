package helper;

import entity.Product;

public class ShippingHelper {
	
	public static double tax(int shippingMethod) {
		if (shippingMethod == 2) return 0.1;   // FedEx
		if (shippingMethod == 1) return 0.15;  // DHL
		if (shippingMethod == 0) return 0;	   // Free Shipping
		return 0;
	}
	
	public static double shipping(Product product, int shippingMethod)	{
		double c;		
		
		switch(shippingMethod) {
			case 2: // FedEx
				c =  product.getPrice() * 0.1; // 0.1 tax
				if (product.isFragile())
					c = c + 100;
				if (product.isOverWeight())
					c = c + 200;
				break;			
			case 1: // DHL
				c =  product.getPrice() * 0.20; // 0.25 tax
				if (product.isFragile())
					c = c + 150;
				if (product.isOverWeight())
					c = c + 350;
				break;	
			case 0: // Free
				c = product.getPrice();
				break;
			default:
				return 0;
		}
		
		return c;
	}
}
