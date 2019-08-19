package gildedRose;

public class Item {

    public String name;

    public int sellIn;

    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    protected boolean isQuantityLessThanFifty() {
        return quality < 50;
    }

    protected boolean isQuantityMoreThanZero() {
        return quality > 0;
    }

    protected void addQuantity() {
        quality++;
    }

    protected void subtractQuantity() {
        quality--;
    }

   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
