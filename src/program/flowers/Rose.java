package program.flowers;

import java.math.BigDecimal;

public class Rose extends BaseFlower {
    private BigDecimal price = new BigDecimal("100.00");

    @Override
    public BigDecimal getPrice() {
        return price;
    }
}
