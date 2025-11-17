package org.javaturk.ha.discountApp.test;

import org.javaturk.ha.discountApp.app.Discounter;
import org.javaturk.ha.discountApp.repository.RepositoryFactory;

public class TestDiscounter {
    private Discounter app = new Discounter(RepositoryFactory.getMockRateRepository());
    public double amount;

    public double discount() {
        return app.discount(amount);
    }

    public static void main(String[] args) {
        TestDiscounter testDiscounter = new TestDiscounter();

        // Test case 1 for amount of 100
        testDiscounter.amount = 100;
        double expectedDiscount = 1;
        double actualDiscount = testDiscounter.discount();
        if(expectedDiscount == actualDiscount)
            System.out.println("Test case 1 passed.");
        else {
            System.out.println("Test case 1 failed.");
            System.out.println("Expected: " + expectedDiscount);
            System.out.println("Actual: " + actualDiscount);
        }

        // Test case 1 for amount of 1000
        testDiscounter.amount = 1000;
        expectedDiscount = 20;
        actualDiscount = testDiscounter.discount();
        if(expectedDiscount == actualDiscount)
            System.out.println("Test case 2 passed.");
        else {
            System.out.println("Test case 2 failed.");
            System.out.println("Expected: " + expectedDiscount);
            System.out.println("Actual: " + actualDiscount);
        }

        // Test case 3 for amount of 1001
        testDiscounter.amount = 10_000;
        expectedDiscount = 500;
        actualDiscount = testDiscounter.discount();
        if(expectedDiscount == actualDiscount)
            System.out.println("Test case 3 passed.");
        else {
            System.out.println("Test case 3 failed.");
            System.out.println("Expected: " + expectedDiscount);
            System.out.println("Actual: " + actualDiscount);
        }
    }
}
