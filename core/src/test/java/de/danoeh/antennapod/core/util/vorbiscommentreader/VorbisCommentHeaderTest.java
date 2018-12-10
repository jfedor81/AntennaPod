package de.danoeh.antennapod.core.util.vorbiscommentreader;

import org.junit.Test;

import static org.junit.Assert.*;

public class VorbisCommentHeaderTest {

    @Test
    public void testVorbisCommentHeader(){
        VorbisCommentHeader vcb = new VorbisCommentHeader("Good morning", 12);

        assertEquals(vcb.getVendorString(), "Good morning");
        assertEquals(vcb.getUserCommentLength(), 12);
        assertEquals(vcb.toString(), "VorbisCommentHeader [vendorString=Good morning, userCommentLength=12]");
    }

}