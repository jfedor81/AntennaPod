package de.danoeh.antennapod.core.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class IntListTest {

    @Test
    public void testEmptyIntList() {
        IntList list = new IntList();
        assertEquals(0, list.size());
        assertEquals("IntList{}", list.toString());
        assertEquals(false, list.remove(42));
        assertEquals(1, list.hashCode());
    }

    @Test
    public void testIntListElement() {
        IntList intList = new IntList();
        intList.add(17);
        assertEquals(1, intList.size());
        assertEquals("IntList{17}", intList.toString());
        assertEquals(17, intList.get(0));
        assertEquals(intList.size(), 1);
    }

    @Test
    public void testOverwriteIntList() {
        IntList intList = new IntList();
        intList.add(17);
        assertEquals(1, intList.size());
        assertEquals("IntList{17}", intList.toString());
        assertEquals(17, intList.get(0));
        intList.remove(17);
        intList.add(23);
        assertEquals(1, intList.size());
        assertEquals("IntList{23}", intList.toString());
        assertEquals(23, intList.get(0));
    }

}