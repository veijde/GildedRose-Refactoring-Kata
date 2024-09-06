package com.gildedrose;

class ConjuredItem extends AbstractItem {

    public ConjuredItem(Item item) {
        super(item);
    }

    @Override
    public void updateQuality() {
        if (item.quality > 0) {
            item.quality -= 2;
        }

        item.sellIn -= 1;

        if (item.sellIn < 0 && item.quality > 0) {
            item.quality -= 2;
        }

        // Ensure quality does not go negative
        if (item.quality < 0) {
            item.quality = 0;
        }
    }
}
