package gildedRose;
public class GildedRose {
    Item[] items;

    public final static String AGED_BRIE = "Aged Brie";
    public final static String BACKSTAGE = "Backstage passes to a TAFKAL80ETC concert";
    public final static String SULFURAS = "Sulfuras, Hand of Ragnaros";

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            if (isNotAgedBrie(items[i]) && isNotBackstage(items[i])) {
                if (items[i].isQuantityMoreThanZero()) {
                    if (isNotSulfuras(items[i])) {
                        subtractQuantity(i);
                    }
                }
            } else {
                if (items[i].isQuantityLessThanFifty()) {
                    addQuantity(i);
                    if (!isNotBackstage(items[i])) {
                        if (items[i].sellIn < 11) {
                            if (items[i].isQuantityLessThanFifty()) {
                                addQuantity(i);
                            }
                        }

                        if (items[i].sellIn < 6) {
                            if (items[i].isQuantityLessThanFifty()) {
                                addQuantity(i);
                            }
                        }
                    }
                }
            }

            if (isNotSulfuras(items[i])) {
                items[i].sellIn = items[i].sellIn - 1;
            }

            if (items[i].sellIn < 0) {
                if (isNotAgedBrie(items[i])) {
                    if (isNotBackstage(items[i])) {
                        if (items[i].isQuantityMoreThanZero()) {
                            if (isNotSulfuras(items[i])) {
                                subtractQuantity(i);
                            }
                        }
                    } else {
                        items[i].quality = 0;
                    }
                } else {
                    if (items[i].isQuantityLessThanFifty()) {
                        addQuantity(i);
                    }
                }
            }
        }
    }

    private void addQuantity(int i) {
        items[i].quality = items[i].quality + 1;
    }

    private void subtractQuantity(int i) {
        items[i].quality = items[i].quality - 1;
    }

    private boolean isNotAgedBrie(Item item) {
        return !item.name.equals(AGED_BRIE);
    }

    private boolean isNotBackstage(Item item) {
        return !item.name.equals(BACKSTAGE);
    }

    private boolean isNotSulfuras(Item item) {
        return !item.name.equals(SULFURAS);
    }


}