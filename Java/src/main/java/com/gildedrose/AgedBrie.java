package com.gildedrose;

public class AgedBrie extends Item {
    public AgedBrie(int sellIn, int quality) {
        super(GildedRose.AGED_BRIE, sellIn, quality);
    }

    @Override
    void updateQuality() {
        increamentQuality(1);
        if (sellIn < 0) {
            increamentQuality(1);
        }
    }

    @Override
    void updateSellIn() {
        decrementSellIn(1);
    }
}
