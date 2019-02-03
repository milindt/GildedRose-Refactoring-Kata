package com.gildedrose;

public class Sulfuras extends Item{
    public Sulfuras(int sellIn) {
        super(GildedRose.SULFURAS_HAND_OF_RAGNAROS, sellIn, 80);
    }

    @Override
    void updateQuality() {
        //Do nothing..
    }

    @Override
    void updateSellIn() {
        //Do nothing
    }
}
