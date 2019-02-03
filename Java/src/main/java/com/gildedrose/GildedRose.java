package com.gildedrose;


class GildedRose {

    public static final String AGED_BRIE = "Aged Brie";
    public static final String BACKSTAGE_CONCERT = "Backstage passes to a TAFKAL80ETC concert";
    public static final String SULFURAS_HAND_OF_RAGNAROS = "Sulfuras, Hand of Ragnaros";
    public static final String CONJURED = "Conjured";

    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public static Item createItem(String name, int sellIn, int quality) {
        if (name.equalsIgnoreCase(AGED_BRIE)) {
            return new AgedBrie(sellIn, quality);
        } else if (name.equalsIgnoreCase(BACKSTAGE_CONCERT)) {
            return new BackStageConcert(sellIn, quality);
        } else if (name.equalsIgnoreCase(SULFURAS_HAND_OF_RAGNAROS)) {
            return new Sulfuras(sellIn);
        } else if(name.equalsIgnoreCase(CONJURED)) {
            return new Conjured(sellIn, quality);
        }
        else {
            return new Item(name, sellIn, quality);
        }
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            Item currentItem = items[i];
            currentItem.updateSellIn();
            currentItem.updateQuality();
        }
    }

}