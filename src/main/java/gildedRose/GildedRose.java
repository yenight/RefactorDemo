package gildedRose;
public class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            switch (item.getName()) {
                case Item.AGED_BRIE:
                    new AgedBrieStrategy().updateQuality(item);
                    break;
                case Item.BACKSTAGE:
                    new BackstageStrategy().updateQuality(item);
                    break;
                case Item.SULFURAS:
                    break;
                default:
                    new OtherStrategy().updateQuality(item);
                    break;
            }
        }
    }
}