package de.danoeh.antennapod.core.util;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongIntMapTest {

    @Test
    public void testEmptyLongIntMap(){
        LongIntMap lim = new LongIntMap();
        assertEquals(lim.size(), 0);
        assertEquals(lim.toString(), "LongLongMap{}");
        assertEquals(lim.hashCode(),1);
    }

    @Test
    public void testSingleElement() {
        LongIntMap map = new LongIntMap();
        map.put(17, 42);
        assertEquals(1, map.size());
        assertEquals("LongLongMap{17=42}", map.toString());
        assertEquals(42, map.get(17));
        assertEquals(42, map.get(17, -1));
        assertEquals(0, map.indexOfKey(17));
        assertEquals(0, map.indexOfValue(42));
        assertEquals(true, map.delete(17));
    }

}