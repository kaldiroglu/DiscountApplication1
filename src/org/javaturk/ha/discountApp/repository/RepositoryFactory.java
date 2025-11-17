package org.javaturk.ha.discountApp.repository;

public class RepositoryFactory {
    public RepositoryFactory() { super(); }

    public static RateRepository getMockRateRepository() {
        return new MockRateRepository();
    }

}