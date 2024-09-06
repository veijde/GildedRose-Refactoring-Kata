package com.gildedrose;

abstract class AbstractItem {
    protected Item item;

    public AbstractItem(Item item) {
        this.item = item;
    }

    public abstract void updateQuality();
}
