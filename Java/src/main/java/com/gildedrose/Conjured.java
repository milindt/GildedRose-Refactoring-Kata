package com.gildedrose;

public class Conjured extends Item {
    public Conjured(int sellIn, int quality) {
        super(GildedRose.CONJURED, sellIn, quality);
    }

    @Override
    void updateQuality() {
        super.updateQuality();
        decrementQuality(1);
    }

}
