package com.gildedrose;

class GildedRose {
    Item[] items;
    AbstractItem[] abstractItems;

    public GildedRose(Item[] items) {
        this.items = items;
        this.abstractItems = new AbstractItem[items.length];
        for (int i = 0; i < items.length; i++) {
            abstractItems[i] = createItem(items[i]);
        }
    }

    private AbstractItem createItem(Item item) {
        switch (item.name) {
            case "Aged Brie":
                return new AgedBrie(item);
            case "Backstage passes to a TAFKAL80ETC concert":
                return new BackstagePass(item);
            case "Sulfuras, Hand of Ragnaros":
                return new Sulfuras(item);
            default:
                if (item.name.startsWith("Conjured")) {
                    return new ConjuredItem(item);
                } else {
                    return new NormalItem(item);
                }
        }
    }

    public void updateQuality() {
        for (AbstractItem abstractItem : abstractItems) {
            abstractItem.updateQuality();
        }
    }
}
