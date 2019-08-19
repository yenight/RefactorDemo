package gildedRose;

public class Item {

    public final static String AGED_BRIE = "Aged Brie";
    public final static String BACKSTAGE = "Backstage passes to a TAFKAL80ETC concert";
    public final static String SULFURAS = "Sulfuras, Hand of Ragnaros";

    private String name;

    private int sellIn;

    private int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public String getName() {
        return name;
    }

    public int getSellIn() {
        return sellIn;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    boolean isQuantityLessThanFifty() {
        return quality < 50;
    }

    boolean isQuantityMoreThanZero() {
        return quality > 0;
    }

    boolean isSellInLessThanNumber(int number) {
        return sellIn < number;
    }

    void addQuantity() {
        quality++;
    }

    void subtractQuantity() {
        quality--;
    }

    void subtractSellIn() {
        sellIn--;
    }

    boolean isNotAgedBrie() {
        return !name.equals(AGED_BRIE);
    }

    boolean isNotBackstage() {
        return !name.equals(BACKSTAGE);
    }

    boolean isNotSulfuras() {
        return !name.equals(SULFURAS);
    }

   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
