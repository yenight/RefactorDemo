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
            if (isNotAgedBrieOrBackstage(items[i])) {
                if (isQuantityMoreThanZero(items[i])) {
                    if (!items[i].name.equals(SULFURAS)) {
                        items[i].quality = items[i].quality - 1;
                    }
                }
            } else {
                if (isQuantityLessThanFifty(items[i])) {
                    items[i].quality = items[i].quality + 1;

                    if (items[i].name.equals(BACKSTAGE)) {
                        if (items[i].sellIn < 11) {
                            if (isQuantityLessThanFifty(items[i])) {
                                items[i].quality = items[i].quality + 1;
                            }
                        }

                        if (items[i].sellIn < 6) {
                            if (isQuantityLessThanFifty(items[i])) {
                                items[i].quality = items[i].quality + 1;
                            }
                        }
                    }
                }
            }

            if (!items[i].name.equals(SULFURAS)) {
                items[i].sellIn = items[i].sellIn - 1;
            }

            if (items[i].sellIn < 0) {
                if (!items[i].name.equals(AGED_BRIE)) {
                    if (!items[i].name.equals(BACKSTAGE)) {
                        if (isQuantityMoreThanZero(items[i])) {
                            if (!items[i].name.equals(SULFURAS)) {
                                items[i].quality = items[i].quality - 1;
                            }
                        }
                    } else {
                        items[i].quality = 0;
                    }
                } else {
                    if (isQuantityLessThanFifty(items[i])) {
                        items[i].quality = items[i].quality + 1;
                    }
                }
            }
        }
    }

    private boolean isQuantityLessThanFifty(Item item) {
        return item.quality < 50;
    }

    private boolean isQuantityMoreThanZero(Item item) {
        return item.quality > 0;
    }

    private boolean isNotAgedBrieOrBackstage(Item item) {
        return !item.name.equals(AGED_BRIE)
                && !item.name.equals(BACKSTAGE);
    }
}