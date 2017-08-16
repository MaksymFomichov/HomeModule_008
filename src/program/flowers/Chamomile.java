package program.flowers;

import java.math.BigDecimal;

public class Chamomile extends BaseFlower {
    private BigDecimal price = new BigDecimal("70.00");

    @Override
    public BigDecimal getPrice() {
        return price;
    }
}
