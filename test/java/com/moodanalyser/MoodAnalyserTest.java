package com.moodanalyser;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MoodAnalyserTest {
    @Test
    public void givenMessage_WhenSad_ShouldReturnSad(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = null;
        try {
            mood = moodAnalyser.analyseMood("Sad");
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
        Assert.assertEquals("SAD",mood);
    }
    @Test
    public void givenMessage_WhenNotSad_ShouldReturnHappy(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = null;
        try {
            mood = moodAnalyser.analyseMood("Happy");
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
        Assert.assertEquals("HAPPY",mood);
    }
    @Test
    public void givenNullMood_ShouldReturnHappy(){
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        String mood = null;
        try {
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(MoodAnalysisException.class);
            mood = moodAnalyser.analyseMood();
            Assert.assertEquals("Happy",mood);
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
    }
}
