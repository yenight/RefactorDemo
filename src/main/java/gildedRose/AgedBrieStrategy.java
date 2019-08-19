package gildedRose;

public class AgedBrieStrategy extends GildedRoseStrategy {
    @Override
    public void updateQuality(Item item) {
        if (item.isQuantityLessThanFifty()) {
            item.addQuantity();
        }
        item.subtractSellIn();
        if (item.isSellInLessThanNumber(0) && item.isQuantityLessThanFifty()) {
            item.addQuantity();
        }
    }
}
