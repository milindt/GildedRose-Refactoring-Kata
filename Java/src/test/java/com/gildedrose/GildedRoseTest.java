package java.com.gildedrose;

import org.junit.Test;

import java.com.gildedrose.GildedRose;
import java.com.gildedrose.Item;

import static org.junit.Assert.*;

public class GildedRoseTest {

    @Test
    public void assertForAgedBrieQualityIsIncreasedIfLessThan50() {
        Item[] items = new Item[] { new Item( GildedRose.AGED_BRIE, 49, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals( 50, app.items[0].quality);
    }

    @Test
    public void name() {
        assertFalse(true);
    }
}
