package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void testNormalItemUpdateQuality() {
        Item[] items = new Item[] { new Item("normal item", 5, 2) };
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(4, gildedRose.items[0].quality);
        assertEquals(1, gildedRose.items[0].sellIn);

        gildedRose.updateQuality();

        assertEquals(3, gildedRose.items[0].quality);
        assertEquals(0, gildedRose.items[0].sellIn);

        gildedRose.updateQuality();

        assertEquals(1, gildedRose.items[0].quality);
        assertEquals(-1, gildedRose.items[0].sellIn);
    }

    @Test
    void testSulfuras() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 0, 80) };
        GildedRose app = new GildedRose(items);

        app.updateQuality();

        assertEquals(80, app.items[0].quality);
        assertEquals(0, app.items[0].sellIn);
    }

    @Test
    void testBackstagePasses() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 11, 20) };
        GildedRose app = new GildedRose(items);

        app.updateQuality();

        assertEquals(21, app.items[0].quality);
        assertEquals(10, app.items[0].sellIn);

        app.updateQuality();

        assertEquals(23, app.items[0].quality);
        assertEquals(9, app.items[0].sellIn);
    }



}
