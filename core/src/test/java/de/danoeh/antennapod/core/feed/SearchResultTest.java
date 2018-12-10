package de.danoeh.antennapod.core.feed;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;


public class SearchResultTest {

    FeedComponent component;

    @Test
    public void testSearchResult(){
        SearchResult searchResult = new SearchResult(component, 10, "title");

        assertEquals(searchResult.getComponent(), component);
        assertEquals(searchResult.getSubtitle(), "title");
        assertEquals(searchResult.getValue(), 10);
        searchResult.setSubtitle("new title");
        assertEquals(searchResult.getSubtitle(), "new title");
    }

}