package com.gildedrose;

class AgedBrie extends AbstractItem {

    public AgedBrie(Item item) {
        super(item);
    }

    @Override
    public void updateQuality() {
        if (item.quality < 50) {
            item.quality += 1;
        }

        item.sellIn -= 1;

        if (item.sellIn < 0 && item.quality < 50) {
            item.quality += 1;
        }
    }
}
