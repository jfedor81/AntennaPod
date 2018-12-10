package de.danoeh.antennapod.core.util;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongListTest {

    @Test
    public void testEmptyLongList(){
        LongList ll = new LongList();
        assertEquals(ll.size(), 0);
        assertEquals(ll.toString(), "LongList{}");
        assertEquals(ll.hashCode(),1);
    }

    @Test
    public void testLongListElement() {
        LongList ll = new LongList();
        ll.add(17);
        assertEquals(1, ll.size());
        assertEquals("LongList{17}", ll.toString());
        assertEquals(17, ll.get(0));
        assertEquals(0, ll.indexOf(17));
        assertEquals(ll.size(), 1);
        assertEquals(ll.remove(17), true);
    }

    @Test
    public void testOverwriteLongList() {
        LongList map = new LongList();
        map.add(17);
        assertEquals(1, map.size());
        assertEquals("LongList{17}", map.toString());
        assertEquals(17, map.get(0));
        map.remove(17);
        map.add(23);
        assertEquals(1, map.size());
        assertEquals("LongList{23}", map.toString());
        assertEquals(23, map.get(0));
    }

}