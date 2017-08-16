package program.flowers;

import java.math.BigDecimal;

public class Tulip extends BaseFlower {
    private BigDecimal price = new BigDecimal("45.00");

    @Override
    public BigDecimal getPrice() {
        return price;
    }
}
