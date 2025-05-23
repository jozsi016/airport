package hu.cubix.airport.service;

import hu.cubix.airport.config.AirportConfigurationProperties;
import org.springframework.beans.factory.annotation.Autowired;

public class SpecialDiscountService implements DiscountService {

    @Autowired
    private AirportConfigurationProperties config;

    @Override
    public int getDiscountPercent(int totalPrice) {
        AirportConfigurationProperties.Discount.Special specialConfig = config.getDiscount().getSpecial();
        return totalPrice >  specialConfig.getLimit() ? specialConfig.getHigherPercent() : specialConfig.getLowerPercent();
    }
}
