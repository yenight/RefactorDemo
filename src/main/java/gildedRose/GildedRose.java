package gildedRose;
public class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            switch (items[i].getName()) {
                case Item.AGED_BRIE:
                    new AgedBrieStrategy().updateQuality(items[i]);
                    break;
                case Item.BACKSTAGE:
                    new BackstageStrategy().updateQuality(items[i]);
                    break;
                default:
                    if (items[i].isNotAgedBrie() && items[i].isNotBackstage()) {
                        if (items[i].isQuantityMoreThanZero()) {
                            if (items[i].isNotSulfuras()) {
                                items[i].subtractQuantity();
                            }
                        }
                    } else {
                        if (items[i].isQuantityLessThanFifty()) {
                            items[i].addQuantity();
                            if (!items[i].isNotBackstage()) {
                                if (items[i].isSellInLessThanNumber(11)) {
                                    if (items[i].isQuantityLessThanFifty()) {
                                        items[i].addQuantity();
                                    }
                                }

                                if (items[i].isSellInLessThanNumber(6)) {
                                    if (items[i].isQuantityLessThanFifty()) {
                                        items[i].addQuantity();
                                    }
                                }
                            }
                        }
                    }

                    if (items[i].isNotSulfuras()) {
                        items[i].subtractSellIn();
                    }

                    if (items[i].isSellInLessThanNumber(0)) {
                        if (items[i].isNotBackstage()) {
                            if (items[i].isQuantityMoreThanZero()) {
                                if (items[i].isNotSulfuras()) {
                                    items[i].subtractQuantity();
                                }
                            }
                        } else {
                            items[i].setQuality(0);
                        }
                    }
                    break;
            }
        }
    }
}