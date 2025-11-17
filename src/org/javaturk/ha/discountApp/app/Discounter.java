package org.javaturk.ha.discountApp.app;

import org.javaturk.ha.discountApp.repository.RateRepository;

public class Discounter {
    private RateRepository rateRepository;

    public Discounter(RateRepository r) {
        super();
        rateRepository = r;
    }

    public double discount(double amount) {
        double rate = rateRepository.getRate( amount );
        return amount * rate;
    }
}
