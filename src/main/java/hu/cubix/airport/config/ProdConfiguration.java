package hu.cubix.airport.config;

import hu.cubix.airport.service.DiscountService;
import hu.cubix.airport.service.SpecialDiscountService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("prod")
public class ProdConfiguration {

    @Bean
    public DiscountService discountService() {
        return new SpecialDiscountService();
    }
}
