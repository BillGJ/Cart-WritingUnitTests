package com.udacity.cart;

import com.udacity.cart.model.CartItem;
import com.udacity.cart.model.CartTotals;
import com.udacity.cart.service.TotalsCalculator;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TotalsCalculatorTest {

    @Test
    public void getTotals_givenMultipleItems_sumsPriceAndTax(){
        // Arrange
        TotalsCalculator totalsCalculator = new TotalsCalculator();

        List<CartItem> cartItemList = List.of(
                new CartItem("Wine", 15.00, 1.50),
                new CartItem("Beer", 10.00, 1.00),
                new CartItem("Lemonade", 5.00, 0.50)
        );

        // Act
        CartTotals cartTotals = totalsCalculator.getTotals(cartItemList);

        // Assert
        assertAll("Totals match",
                ()-> assertEquals(30.00, cartTotals.getSubtotal()),
                ()-> assertEquals(3.00, cartTotals.getTaxes())
        );
    }
}
