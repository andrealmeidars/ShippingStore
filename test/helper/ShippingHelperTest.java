package helper;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import entity.Product;

public class ShippingHelperTest {



	@Test
	public void showTaxCorrectlyFeDex(){
		assertThat(ShippingHelper.tax(2), is(0.1));
	}

	@Test
	public void showTaxCorrectlyDHL(){
		assertThat(ShippingHelper.tax(1), is(0.15));
	}

	@Test
	public void showTaxCorrectlyFree(){
		assertThat(ShippingHelper.tax(0), is(0.0));
	}


	


	@Test
	public void ifTaxIsFeDexAndIsFragileAndIsOverWeight(){
		Product p = new Product(2.0, true, true);
		assertThat(ShippingHelper.shipping(p, 2), is(300.2));
	}

	@Test
	public void ifTaxIsFeDexAndIsFragileAndNotIsOverWeight(){
		Product p = new Product(2.0, true, false);
		assertThat(ShippingHelper.shipping(p, 2), is(100.2));
	}

	@Test
	public void ifTaxIsFeDexAndIsNotFragileAndIsOverWeight(){
		Product p = new Product(2.0, false, true);
		assertThat(ShippingHelper.shipping(p, 2), is(200.2));
	}


	@Test
	public void ifTaxIsFeDexAndIsNotFragileAndNotIsOverWeight(){
		Product p = new Product(2.0, false, false);
		assertThat(ShippingHelper.shipping(p, 2), is(0.2));
	}



	@Test
	public void ifTaxIsDhlAndIsFragileAndIsOverWeight(){
		Product p = new Product(3.0, true, true);
		assertThat(ShippingHelper.shipping(p, 1), is(500.6));
	}

	@Test
	public void ifTaxIsDhlAndIsFragileAndNotIsOverWeight(){
		Product p = new Product(3.0, true, false);
		assertThat(ShippingHelper.shipping(p, 1), is(150.6));
	}

	@Test
	public void ifTaxIsDhlAndIsNotFragileAndIsOverWeight(){
		Product p = new Product(3.0, false, true);
		assertThat(ShippingHelper.shipping(p, 1), is(350.6));
	}


	@Test
	public void ifTaxIsDhlAndIsNotFragileAndNotIsOverWeight(){
		Product p = new Product(3.0, false, false);
		assertThat(ShippingHelper.shipping(p, 1), is(0.6000000000000001));
	}



	@Test
	public void ifTaxIsFree(){
		Product p = new Product(4.0, false, false);
		assertThat(ShippingHelper.shipping(p, 0), is(4.0));
	}





}
