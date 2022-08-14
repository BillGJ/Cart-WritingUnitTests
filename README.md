# Cart-WritingUnitTests: JUnit 

This is a simple Maven Project called `Cart-WritingUnitTests`.
There is a service named `TotalsCalculator` that calculates the fields of a `CartTotals` object from a list 
of `CartItem` objects. The goal is to test `TotalsCalculator` using **JUnit**.


## Testing the TotalsCalculator

Here is the steps we followed to test `TotalsCalculator`:

1. We created a unit test to check that `TotalsCalculator` is adding all the items. The test has three main parts:

    1. Arrange: Creating an `TotalsCalculator` (the subject of under test), and a list of `CartItems` to be used on it.
    2. Act: A call to `getTotals` method passing the list of `CartItems` and storing the result on a variable.
    3. Assert: Assertions over the result that was previously stored on a variable. Since the `CartTotals` fields are
       `doubles` we specified a `delta` like `assertEquals(11.0, totals.getSubtotal(), 0.001)`.