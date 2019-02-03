package com.gildedrose;

public class Item {

    public final String name;

    public int sellIn;

    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

    void decrementQuality(int decrement) {
        if (quality > 0) {
            quality = quality - decrement;
        }
    }

    String getName() {
        return name;
    }

    void increamentQuality(int increament) {
        if (quality < 50) {
            quality = quality + increament;
        }
    }

    void decrementSellIn(int decrement) {
        sellIn = sellIn - decrement;
    }

    void updateQuality() {
        decrementQuality(1);
        if (sellIn < 0) {
            decrementQuality(1);
        }
    }

    void updateSellIn() {
        decrementSellIn(1);
    }

}
