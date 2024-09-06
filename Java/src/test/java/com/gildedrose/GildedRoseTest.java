package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void testGenericItemUpdateQuality() {
        Item[] items = new Item[] { new Item("normal item", 0, 0) };
        GildedRose gildedRose = new GildedRose(items);

        // Call the method that updates item quality
        gildedRose.updateQuality();

        // Assert that after one update, quality is still 0 (it can't be negative)
        assertEquals(0, gildedRose.items[0].quality);

        // Assert that sellIn decreases by 1
        assertEquals(-1, gildedRose.items[0].sellIn);
    }

}
