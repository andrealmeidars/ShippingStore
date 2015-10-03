package helper;

import org.junit.Assert;
import org.junit.Test;
import product.Product;
import shipping.calculate.ShippingRatesCalculate;

import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;

public class ShippingRatesCalculareTest {
    private MyProduct myProduct;



    public ShippingRatesCalculareTest() {
        this.myProduct = new MyProduct(2.0, true, true);
    }

    public class MyProduct extends Product {

        public MyProduct(double price, boolean isFragile, boolean isOverWeight) {
            super(price, isFragile, isOverWeight);
        }

//     @Test
//        public void ifShippingRatesCalculateAcceptProduct()throws Exception{
//         ShippingRatesCalculate shippingRatesCalculate = new ShippingRatesCalculate();
//         assertThat(shippingRatesCalculate.calculateShippingRates(myProduct), not(null));
//
//
//     }



    }
}
