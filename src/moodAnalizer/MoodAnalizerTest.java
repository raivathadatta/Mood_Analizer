package moodAnalizer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalizerTest {

	@Test
	public void testMoodAnalysis_whenMoodIsSad() throws Exception {
		MoodAnalizer moodAnalyzer = new MoodAnalizer("This is a sad message");
		String mood = null;
		try {
			mood = moodAnalyzer.analizeMood();
			Assert.assertEquals("SAD", mood);
		} catch (MoodAnalizeException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testMoodAnalysis_whenMoodIsHappy() throws Exception {
		MoodAnalizer moodAnalyzer = new MoodAnalizer("This is a happy message");
		String mood = null;
		try {
			mood = moodAnalyzer.analizeMood();
			Assert.assertEquals("HAPPY", mood);
		} catch (MoodAnalizeException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testMoodAnalysis_whenMoodIsNull_ShouldThrowException() throws Exception {
		MoodAnalizer moodAnalyzer = new MoodAnalizer(null);
		try {
			moodAnalyzer.analizeMood();
		} catch (MoodAnalizeException e) {
			Assert.assertEquals(MoodAnalizeException.ExceptionType.ENTERED_NULL, e.type);
		}
	}

	@Test
	public void testMoodAnalysis_whenMoodIsEmpty_ShouldThrowException() throws Exception {
		MoodAnalizer moodAnalyzer = new MoodAnalizer(" ");
		try {
			moodAnalyzer.analizeMood();
		} catch (MoodAnalizeException e) {
			Assert.assertEquals(MoodAnalizeException.ExceptionType.ENTERED_EMPTY, e.type);
		}
	}

}
