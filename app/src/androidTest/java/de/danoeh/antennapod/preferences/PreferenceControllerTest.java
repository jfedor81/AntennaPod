package de.danoeh.antennapod.preferences;

import android.os.Looper;

import org.junit.Test;

import de.danoeh.antennapod.activity.MainActivity;
import de.danoeh.antennapod.core.storage.DBReader;

import static org.junit.Assert.*;

public class PreferenceControllerTest {

    @Test
    public void testGetTitleOfPage_StorageValue(){
        //testing with preference_storage integer value
        assertEquals(PreferenceController.getTitleOfPage(0x7f140009), "Storage");
    }

    @Test
    public void testGetTitleOfPage_UndefinedValue(){
        //testing with undefined integer value
        assertEquals(PreferenceController.getTitleOfPage(1234567891), "Settings");
    }

    @Test
    public void testGetTitleOfPage_NetworkValue(){
        //testing with undefined integer value
        assertEquals(PreferenceController.getTitleOfPage(0x7f140007), "Network");
    }

    @Test
    public void testGetTitleOfPage_AutoDownloadValue(){
        //testing with undefined integer value
        assertEquals(PreferenceController.getTitleOfPage(0x7f140003), "Automatic Download");
    }

    @Test
    public void testGetTitleOfPage_PlaybackValue(){
        //testing with undefined integer value
        assertEquals(PreferenceController.getTitleOfPage(0x7f140008), "Playback");
    }

    @Test
    public void testGetTitleOfPage_UserInterfaceValue(){
        //testing with undefined integer value
        assertEquals(PreferenceController.getTitleOfPage(0x7f14000a), "User Interface");
    }

    @Test
    public void testGetTitleOfPage_IntegrationValue(){
        //testing with undefined integer value
        assertEquals(PreferenceController.getTitleOfPage(0x7f140006), "Integrations");
    }

    @Test
    public void testGetTitleOfPage_FlattrValue(){
        //testing with undefined integer value
        assertEquals(PreferenceController.getTitleOfPage(0x7f140004), "Flattr");
    }

    @Test
    public void testGetTitleOfPage_GpodderValue(){
        //testing with undefined integer value
        assertEquals(PreferenceController.getTitleOfPage(0x7f140005), "gpodder.net");
    }

    @Test
    public void shitTest(){
        Looper.prepare();
        MainActivity mainActivity = new MainActivity();
        assertEquals(mainActivity.getFeeds(), null);
    }

}