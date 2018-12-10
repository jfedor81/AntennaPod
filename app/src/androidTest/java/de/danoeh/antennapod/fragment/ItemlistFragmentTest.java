package de.danoeh.antennapod.fragment;

import android.content.ClipData;
import android.os.Handler;
import android.os.Looper;
import android.view.MenuItem;
import android.widget.Adapter;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import de.danoeh.antennapod.adapter.FeedItemlistAdapter;

import static org.junit.Assert.*;

public class ItemlistFragmentTest {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void scrollWithNull() throws Exception {
        Looper.prepare();
        ItemlistFragment fragment = new ItemlistFragment();

        FeedItemlistAdapter adapter = null;

        fragment.scrollToPlayingListItem(adapter);

    }

    @Test
    public void scrollWithAdapter() throws Exception {
        Looper.prepare();
        ItemlistFragment fragment = new ItemlistFragment();

        //FeedItemlistAdapter adapter = new FeedItemlistAdapter();

        //fragment.scrollToPlayingListItem(adapter);

    }

    @Test
    public void onOptionsItemSeclected() throws Exception {
        MenuItem item = null;
        Looper.prepare();
        ItemlistFragment fragment = new ItemlistFragment();

        assertEquals(fragment.onOptionsItemSelected(item),false);

    }

    @After
    public void tearDown() throws Exception {
    }

}