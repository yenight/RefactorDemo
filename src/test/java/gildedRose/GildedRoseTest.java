package gildedRose;

import org.junit.Test;

import static org.junit.Assert.*;

public class GildedRoseTest {

    @Test
    public void should_return_updateQualityString_given_a_item_Aged_Brie_1_1() {
        //given
        Item item = new Item("Aged Brie",1,1);
        Item[] items = {item};
        GildedRose gildedRose = new GildedRose(items);

        //when
        gildedRose.updateQuality();

        //then
        assertEquals(gildedRose.items[0].toString(),"Aged Brie, 0, 2");
    }

    @Test
    public void should_return_updateQualityString_given_a_item_Backstage_passes_to_a_TAFKAL80ETC_concert_1_1() {
        //given
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert",1,1);
        Item[] items = {item};
        GildedRose gildedRose = new GildedRose(items);

        //when
        gildedRose.updateQuality();

        //then
        assertEquals(gildedRose.items[0].toString(),"Backstage passes to a TAFKAL80ETC concert, 0, 4");
    }

    @Test
    public void should_return_updateQualityString_given_a_item_test_1_1() {
        //given
        Item item = new Item("test",1,1);
        Item[] items = {item};
        GildedRose gildedRose = new GildedRose(items);

        //when
        gildedRose.updateQuality();

        //then
        assertEquals(gildedRose.items[0].toString(),"test, 0, 0");
    }

    @Test
    public void should_return_updateQualityString_given_a_item_test_1_0() {
        //given
        Item item = new Item("test",1,0);
        Item[] items = {item};
        GildedRose gildedRose = new GildedRose(items);

        //when
        gildedRose.updateQuality();

        //then
        assertEquals(gildedRose.items[0].toString(),"test, 0, 0");
    }

    @Test
    public void should_return_updateQualityString_given_a_item_Sulfuras_Hand_of_Ragnaros_1_1() {
        //given
        Item item = new Item("Sulfuras, Hand of Ragnaros",1,1);
        Item[] items = {item};
        GildedRose gildedRose = new GildedRose(items);

        //when
        gildedRose.updateQuality();

        //then
        assertEquals(gildedRose.items[0].toString(),"Sulfuras, Hand of Ragnaros, 1, 1");
    }

    @Test
    public void should_return_updateQualityString_given_a_item_Aged_Brie_1_50() {
        //given
        Item item = new Item("Aged Brie",1,50);
        Item[] items = {item};
        GildedRose gildedRose = new GildedRose(items);

        //when
        gildedRose.updateQuality();

        //then
        assertEquals(gildedRose.items[0].toString(),"Aged Brie, 0, 50");
    }

    @Test
    public void should_return_updateQualityString_given_a_item_Aged_Brie_1_49() {
        //given
        Item item = new Item("Aged Brie",1,49);
        Item[] items = {item};
        GildedRose gildedRose = new GildedRose(items);

        //when
        gildedRose.updateQuality();

        //then
        assertEquals(gildedRose.items[0].toString(),"Aged Brie, 0, 50");
    }

    @Test
    public void should_return_updateQualityString_given_a_item_Backstage_passes_to_a_TAFKAL80ETC_concert_1_49() {
        //given
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert",1,49);
        Item[] items = {item};
        GildedRose gildedRose = new GildedRose(items);

        //when
        gildedRose.updateQuality();

        //then
        assertEquals(gildedRose.items[0].toString(),"Backstage passes to a TAFKAL80ETC concert, 0, 50");
    }

    @Test
    public void should_return_updateQualityString_given_a_item_Backstage_passes_to_a_TAFKAL80ETC_concert_11_49() {
        //given
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert",11,49);
        Item[] items = {item};
        GildedRose gildedRose = new GildedRose(items);

        //when
        gildedRose.updateQuality();

        //then
        assertEquals(gildedRose.items[0].toString(),"Backstage passes to a TAFKAL80ETC concert, 10, 50");
    }

    @Test
    public void should_return_updateQualityString_given_a_item_Backstage_passes_to_a_TAFKAL80ETC_concert_11_50() {
        //given
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert",11,50);
        Item[] items = {item};
        GildedRose gildedRose = new GildedRose(items);

        //when
        gildedRose.updateQuality();

        //then
        assertEquals(gildedRose.items[0].toString(),"Backstage passes to a TAFKAL80ETC concert, 10, 50");
    }

    @Test
    public void should_return_updateQualityString_given_a_item_Backstage_passes_to_a_TAFKAL80ETC_concert_6_49() {
        //given
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert",6,49);
        Item[] items = {item};
        GildedRose gildedRose = new GildedRose(items);

        //when
        gildedRose.updateQuality();

        //then
        assertEquals(gildedRose.items[0].toString(),"Backstage passes to a TAFKAL80ETC concert, 5, 50");
    }


    @Test
    public void should_return_updateQualityString_given_a_item_Backstage_passes_to_a_TAFKAL80ETC_concert_6_48() {
        //given
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert",6,48);
        Item[] items = {item};
        GildedRose gildedRose = new GildedRose(items);

        //when
        gildedRose.updateQuality();

        //then
        assertEquals(gildedRose.items[0].toString(),"Backstage passes to a TAFKAL80ETC concert, 5, 50");
    }

    @Test
    public void should_return_updateQualityString_given_a_item_Backstage_passes_to_a_TAFKAL80ETC_concert_5_47() {
        //given
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert",5,47);
        Item[] items = {item};
        GildedRose gildedRose = new GildedRose(items);

        //when
        gildedRose.updateQuality();

        //then
        assertEquals(gildedRose.items[0].toString(),"Backstage passes to a TAFKAL80ETC concert, 4, 50");
    }

    @Test
    public void should_return_updateQualityString_given_a_item_Sulfuras_Hand_of_Ragnaros_1_51() {
        //given
        Item item = new Item("Sulfuras, Hand of Ragnaros",1,51);
        Item[] items = {item};
        GildedRose gildedRose = new GildedRose(items);

        //when
        gildedRose.updateQuality();

        //then
        assertEquals(gildedRose.items[0].toString(),"Sulfuras, Hand of Ragnaros, 1, 51");
    }

    @Test
    public void should_return_updateQualityString_given_a_item_Sulfuras_Hand_of_Ragnaros_Negative1_1() {
        //given
        Item item = new Item("Sulfuras, Hand of Ragnaros",-1,1);
        Item[] items = {item};
        GildedRose gildedRose = new GildedRose(items);

        //when
        gildedRose.updateQuality();

        //then
        assertEquals(gildedRose.items[0].toString(),"Sulfuras, Hand of Ragnaros, -1, 1");
    }

    @Test
    public void should_return_updateQualityString_given_a_item_Aged_Brie_Negative1_49() {
        //given
        Item item = new Item("Aged Brie",-1,49);
        Item[] items = {item};
        GildedRose gildedRose = new GildedRose(items);

        //when
        gildedRose.updateQuality();

        //then
        assertEquals(gildedRose.items[0].toString(),"Aged Brie, -2, 50");
    }

    @Test
    public void should_return_updateQualityString_given_a_item_Aged_Brie_Negative1_51() {
        //given
        Item item = new Item("Aged Brie",-1,49);
        Item[] items = {item};
        GildedRose gildedRose = new GildedRose(items);

        //when
        gildedRose.updateQuality();

        //then
        assertEquals(gildedRose.items[0].toString(),"Aged Brie, -2, 50");
    }

    @Test
    public void should_return_updateQualityString_given_a_item_Backstage_passes_to_a_TAFKAL80ETC_concert_Negative1_49() {
        //given
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert",-1,49);
        Item[] items = {item};
        GildedRose gildedRose = new GildedRose(items);

        //when
        gildedRose.updateQuality();

        //then
        assertEquals(gildedRose.items[0].toString(),"Backstage passes to a TAFKAL80ETC concert, -2, 0");
    }

    @Test
    public void should_return_updateQualityString_given_a_item_Sulfuras_Hand_of_Ragnaros_Negative1_Negative1() {
        //given
        Item item = new Item("Sulfuras, Hand of Ragnaros",-1,-1);
        Item[] items = {item};
        GildedRose gildedRose = new GildedRose(items);

        //when
        gildedRose.updateQuality();

        //then
        assertEquals(gildedRose.items[0].toString(),"Sulfuras, Hand of Ragnaros, -1, -1");
    }

    @Test
    public void should_return_updateQualityString_given_a_item_test_Negative1_Negative1() {
        //given
        Item item = new Item("test",-1,-1);
        Item[] items = {item};
        GildedRose gildedRose = new GildedRose(items);

        //when
        gildedRose.updateQuality();

        //then
        assertEquals(gildedRose.items[0].toString(),"test, -2, -1");
    }

}