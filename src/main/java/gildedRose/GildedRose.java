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
                case Item.SULFURAS:
                    break;
                default:
                    new OtherStrategy().updateQuality(items[i]);
                    break;
            }
        }
    }
}