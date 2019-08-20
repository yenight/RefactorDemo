package gildedRose;

public class BackstageStrategy extends GildedRoseStrategy {
    @Override
    public void updateQuality(Item item) {
        if (item.isQuantityLessThanFifty()) {
            item.addQuantity();
        }
        if (item.isSellInLessThanNumber(11) && item.isQuantityLessThanFifty()) {
            item.addQuantity();
        }
        if (item.isSellInLessThanNumber(6) && item.isQuantityLessThanFifty()) {
            item.addQuantity();
        }
        item.subtractSellIn();
        if (item.isSellInLessThanNumber(0)) {
            item.setQuality(0);
        }
    }
}
