package hu.cubix.airport.service;

import org.springframework.stereotype.Service;

@Service
public class PriceService {

    private DiscountService discountService;

    public PriceService(DiscountService discountService) {
        this.discountService = discountService;
    }

    public int getFinalPrice(int totalPrice) {
        return (int) (totalPrice / 100.0 * (100 - discountService.getDiscountPercent(totalPrice)));
    }
}
