package de.danoeh.antennapod.core.util.vorbiscommentreader;

import android.content.Context;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.List;

import de.danoeh.antennapod.core.R;
import de.danoeh.antennapod.core.feed.Chapter;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class VorbisCommentChapterReaderTest {

    @Test
    public void testVorbisCommentChapterReader(){
        VorbisCommentChapterReader vccr = new VorbisCommentChapterReader();

        assertEquals(vccr.onContentVectorKey("chapter 55"), false);
    }

    @Mock
    Context mMockContext;

    private static final String TEST_STRING = "New";

    @Test
    public void testReadStringFromVCCR() {
        when(mMockContext.getString(R.string.new_label)).thenReturn(TEST_STRING);
        VorbisCommentChapterReader objectUnderTest = new VorbisCommentChapterReader(mMockContext);
        String result = objectUnderTest.getRandomString();

        assertThat(result, is(TEST_STRING));
    }

}