package gildedRose;

public class OtherStrategy extends GildedRoseStrategy {
    @Override
    public void updateQuality(Item item) {
        if (item.isQuantityMoreThanZero()) {
            item.subtractQuantity();
        }
        item.subtractSellIn();
        if (item.isSellInLessThanNumber(0) && item.isQuantityMoreThanZero()) {
            item.subtractQuantity();
        }
    }
}
