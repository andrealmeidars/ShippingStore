package helper;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import PaymentStrategy.DhlPayStrategy;
import PaymentStrategy.FedexPayStrategy;
import PaymentStrategy.FreePayStrategy;
import entity.PayStrategy;
import org.junit.Test;
import entity.Product;

public class ShippingStoreTest {


	@Test
	public void showValueToFedexPayIfIsFragileAndIsOverWeigthIsTrue(){
		Product p = new Product(2.0, true, true);
		FedexPayStrategy fedexPayStrategy = new FedexPayStrategy();

		assertThat(ShippingStore.shipping(p, fedexPayStrategy), is(300.2));
	}

	@Test
	public void showValueToFedexPayIfIsFragileAndIsOverWeigthIsFalse(){
		Product p = new Product(2.0, false, false);
		FedexPayStrategy fedexPayStrategy = new FedexPayStrategy();

		assertThat(ShippingStore.shipping(p, fedexPayStrategy), is(0.2));
	}

	@Test
	public void showValueToFedexPayIfFragileIsTrueAndIsOverWeigthIsFalse(){
		Product p = new Product(2.0, true, false);
		FedexPayStrategy fedexPayStrategy = new FedexPayStrategy();

		assertThat(ShippingStore.shipping(p, fedexPayStrategy), is(100.2));
	}


	@Test
	public void showValueToFedexPayIfFragileIFalseAndIsOverWeigthIsTrue(){
		Product p = new Product(2.0, false, true);
		FedexPayStrategy fedexPayStrategy = new FedexPayStrategy();

		assertThat(ShippingStore.shipping(p, fedexPayStrategy), is(200.2));
	}





	@Test
	public void showValueToDhlPayIfIsFragileAndIsOverWeigthIsTrue(){
		Product p = new Product(2.0, true, true);
		DhlPayStrategy dhlPayStrategy = new DhlPayStrategy();

		assertThat(ShippingStore.shipping(p, dhlPayStrategy), is(500.5));
	}

	@Test
	public void showValueToDhlPayIfIsFragileAndIsOverWeigthIsFalse(){
		Product p = new Product(2.0, false, false);
		DhlPayStrategy dhlPayStrategy = new DhlPayStrategy();

		assertThat(ShippingStore.shipping(p, dhlPayStrategy), is(0.5));
	}

	@Test
	public void showValueToDhlPayIfFragileIsTrueAndIsOverWeigthIsFalse(){
		Product p = new Product(2.0, true, false);
		DhlPayStrategy dhlPayStrategy = new DhlPayStrategy();

		assertThat(ShippingStore.shipping(p, dhlPayStrategy), is(150.5));
	}


	@Test
	public void showValueToDhlPayIfFragileIFalseAndIsOverWeigthIsTrue(){
		Product p = new Product(2.0, false, true);
		DhlPayStrategy dhlPayStrategy = new DhlPayStrategy();

		assertThat(ShippingStore.shipping(p, dhlPayStrategy), is(350.5));
	}




	@Test
	public void showValueToDhlPayIfFree(){
		Product p = new Product(2.0, false, true);
		FreePayStrategy freePayStrategy = new FreePayStrategy();

		assertThat(ShippingStore.shipping(p, freePayStrategy), is(2.0));
	}








	@Test
	public void showTaxCorrectlyFeDex(){
		assertThat(ShippingStore.tax(2), is(0.1));
	}

	@Test
	public void showTaxCorrectlyDHL(){
		assertThat(ShippingStore.tax(1), is(0.15));
	}

	@Test
	public void showTaxCorrectlyFree(){
		assertThat(ShippingStore.tax(0), is(0.0));
	}


	


	@Test
	public void ifTaxIsFeDexAndIsFragileAndIsOverWeith(){
		Product p = new Product(2.0, true, true);
		assertThat(ShippingStore.shipping(p, 2), is(300.2));
	}

	@Test
	public void ifTaxIsFeDexAndIsFragileAndNotIsOverWeigth(){
		Product p = new Product(2.0, true, false);
		assertThat(ShippingStore.shipping(p, 2), is(100.2));
	}

	@Test
	public void ifTaxIsFeDexAndIsNotFragileAndIsOverWeigth(){
		Product p = new Product(2.0, false, true);
		assertThat(ShippingStore.shipping(p, 2), is(200.2));
	}


	@Test
	public void ifTaxIsFeDexAndIsNotFragileAndNotIsOverWeigth(){
		Product p = new Product(2.0, false, false);
		assertThat(ShippingStore.shipping(p, 2), is(0.2));
	}



	@Test
	public void ifTaxIsDhlAndIsFragileAndIsOverWeigth(){
		Product p = new Product(3.0, true, true);
		assertThat(ShippingStore.shipping(p, 1), is(500.6));
	}

	@Test
	public void ifTaxIsDhlAndIsFragileAndNotIsOverWeigth(){
		Product p = new Product(3.0, true, false);
		assertThat(ShippingStore.shipping(p, 1), is(150.6));
	}

	@Test
	public void ifTaxIsDhlAndIsNotFragileAndIsOverWeigth(){
		Product p = new Product(3.0, false, true);
		assertThat(ShippingStore.shipping(p, 1), is(350.6));
	}


	@Test
	public void ifTaxIsDhlAndIsNotFragileAndNotIsOverWeigth(){
		Product p = new Product(3.0, false, false);
		assertThat(ShippingStore.shipping(p, 1), is(0.6000000000000001));
	}



	@Test
	public void ifTaxIsFree(){
		Product p = new Product(4.0, false, false);
		assertThat(ShippingStore.shipping(p, 0), is(4.0));
	}



}
