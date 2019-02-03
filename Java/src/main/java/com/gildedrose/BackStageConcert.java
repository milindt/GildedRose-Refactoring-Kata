package com.gildedrose;

public class BackStageConcert extends Item {

    public BackStageConcert(int sellIn, int quality) {
        super(GildedRose.BACKSTAGE_CONCERT, sellIn, quality);
    }

    @Override
    void updateQuality() {
        if (sellIn < 11) {
            if (quality < 50) {
                increamentQuality(1);
            }
        }
        if (sellIn < 6) {
            if (quality < 50) {
                increamentQuality(1);
            }
        }
        increamentQuality(1);
        if (sellIn < 0) {
            decrementQuality(quality);
        }
    }

    @Override
    void updateSellIn() {
        decrementSellIn(1);
    }
}
