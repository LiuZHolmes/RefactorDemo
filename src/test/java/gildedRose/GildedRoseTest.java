package gildedRose;

import org.junit.Test;

import static org.junit.Assert.*;

public class GildedRoseTest {
    @Test
    public void should_return_quality_2_when_given_items_name_Aged_Brie_and_sell_in_0_and_quality_0() {
        Item[] items = {new Item("Aged Brie", 0, 0)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(2, items[0].quality);
    }

    @Test
    public void should_return_quality_50_when_given_items_name_Aged_Brie_and_sell_in_0_and_quality_50() {
        Item[] items = {new Item("Aged Brie", 0, 50)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(50, items[0].quality);
    }

    @Test
    public void should_return_quality_0_when_given_items_name_Backstage_passes_to_a_AFKAL80ETC_concert_and_sell_in_0_and_quality_0() {
        Item[] items = {new Item("Backstage passes to a TAFKAL80ETC concert", 0, 0)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(0, items[0].quality);
    }

    @Test
    public void should_return_quality_2_when_given_items_name_Backstage_passes_to_a_AFKAL80ETC_concert_and_sell_in_6_and_quality_0() {
        Item[] items = {new Item("Backstage passes to a TAFKAL80ETC concert", 6, 0)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(2, items[0].quality);
    }

    @Test
    public void should_return_quality_1_when_given_items_name_Backstage_passes_to_a_AFKAL80ETC_concert_and_sell_in_11_and_quality_0() {
        Item[] items = {new Item("Backstage passes to a TAFKAL80ETC concert", 11, 0)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(1, items[0].quality);
    }

    @Test
    public void should_return_quality_0_when_given_items_name_Sulfuras_Hand_of_Ragnaros_and_sell_in_0_and_quality_0() {
        Item[] items = {new Item("Sulfuras, Hand of Ragnaros", 0, 0)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(0, items[0].quality);
    }

    @Test
    public void should_return_quality_1_when_given_items_name_Sulfuras_Hand_of_Ragnaros_and_sell_in_0_and_quality_1() {
        Item[] items = {new Item("Sulfuras, Hand of Ragnaros", 0, 1)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(1, items[0].quality);
    }
}
