package com.gildedrose;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class GildedRoseTest {

    @Test
    public void assertForAgedBrieQualityIsIncreasedIfLessThan50() {
        GildedRose app = setupGildedRoseForAgedBrie(0, 49);
        app.updateQuality();
        assertEquals( 50, app.items[0].quality);
    }

    @Test
    public void assertForAgedBrieQualityDoesNotGoAbove50() {
        GildedRose app = setupGildedRoseForAgedBrie(0, 50);
        app.updateQuality();
        assertEquals( 50, app.items[0].quality);
    }

    private GildedRose setupGildedRoseForAgedBrie(int sellIn, int quality) {
        Item[] items = new Item[] { GildedRose.createItem(GildedRose.AGED_BRIE, sellIn, quality) };
        return new GildedRose(items);
    }

    @Test
    public void assertForQualityDoesNotGoBelow0() {
        GildedRose app = setupGildedRose("testItem", 0, 0);
        app.updateQuality();
        assertEquals( 0, app.items[0].quality);
    }

    @Test
    public void assertForExpireProductsQualityDegardesTwiceAsFast() {
        GildedRose app = setupGildedRose("testItem", -1, 2);
        app.updateQuality();
        assertEquals( 0, app.items[0].quality);
    }

    @Test
    public void assertForSulfurasQualityDoesNotChange() {
        GildedRose app = setupGildedRoseForSulfuras(0, 80);
        app.updateQuality();
        assertEquals( 80, app.items[0].quality);
    }

    private GildedRose setupGildedRoseForSulfuras(int sellIn, int quality) {
        Item[] items = new Item[] { GildedRose.createItem(GildedRose.SULFURAS_HAND_OF_RAGNAROS, sellIn, quality) };
        return new GildedRose(items);
    }

    @Test
    public void assertForBackstageConsertPassToBeSoldIn11DaysQualityIsIncreasedIfLessThan50() {
        GildedRose app = setUpGildedRoseForBaackStageconcert( 11, 49);
        app.updateQuality();
        assertEquals( 50, app.items[0].quality);
    }

    @Test
    public void assertForBackstageConsertPassToBeSoldIn11DaysQualityDoesNotGoAbove50() {
        GildedRose app = setUpGildedRoseForBaackStageconcert( 11, 50);
        app.updateQuality();
        assertEquals( 50, app.items[0].quality);
    }


    @Test
    public void assertForBackstageConsertPassToBeSoldIn10DaysOrLessQualityIsIncreasedBy2IfLessThan50() {
        GildedRose app = setUpGildedRoseForBaackStageconcert(10, 48);
        app.updateQuality();
        assertEquals( 50, app.items[0].quality);
    }

    @Test
    public void assertForBackstageConsertPassToBeSoldIn10DaysOrLessQualityIsIncreasedBy2ButNotGreater50() {
        GildedRose app = setUpGildedRoseForBaackStageconcert(10, 49);
        app.updateQuality();
        assertEquals( 50, app.items[0].quality);
    }

    @Test
    public void assertForBackstageConsertPassToBeSoldIn5DaysOrLessQualityIsIncreasedBy3IfLessThan50() {
        GildedRose app = setUpGildedRoseForBaackStageconcert(5, 47);
        app.updateQuality();
        assertEquals( 50, app.items[0].quality);
    }

    private GildedRose setUpGildedRoseForBaackStageconcert(int sellIn, int quality) {
        Item[] items = new Item[] { GildedRose.createItem(GildedRose.BACKSTAGE_CONCERT, sellIn, quality) };
        return new GildedRose(items);
    }

    @Test
    public void assertForBackstageConsertPassToBeSoldIn5DaysOrLessQualityIsIncreasedBy3ButNotGreater50() {
        GildedRose app = setUpGildedRoseForBaackStageconcert(10, 49);
        app.updateQuality();
        assertEquals( 50, app.items[0].quality);
    }

    @Test
    public void assertForBackstageConsertPassExpiresAfterConcert() {
        GildedRose app = setUpGildedRoseForBaackStageconcert( -1, 49);
        app.updateQuality();
        assertEquals( 0, app.items[0].quality);
    }

    @Test
    public void assertConjureExpiresTwiceAsFast() {
        GildedRose app = setupGildedRose(GildedRose.CONJURED, 10, 49);
        app.updateQuality();
        assertEquals( 47, app.items[0].quality);
    }

    private GildedRose setupGildedRose(String item, int sellIn, int quality) {
        Item[] items = new Item[] { GildedRose.createItem(item, sellIn, quality) };
        return new GildedRose(items);
    }

}
