package hu.cubix.airport.service;

public class DefaultDiscountService implements DiscountService {

    @Override
    public int getDiscountPercent(int totalPrice) {
        return 10;
    }
}
