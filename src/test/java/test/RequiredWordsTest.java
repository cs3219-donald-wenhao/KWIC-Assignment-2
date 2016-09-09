package test.java.test;

import main.java.CS3213.RequiredWords;
import org.junit.Test;

import static org.junit.Assert.*;

public class RequiredWordsTest {

    @Test
    public void testIsRequiredWord() throws Exception {
        RequiredWords requiredWords = RequiredWords.getRequiredWords();

        assertFalse(requiredWords.isRequiredWord("the"));

        requiredWords.addRequiredWord("Star");
        requiredWords.addRequiredWord("Space");
        requiredWords.addRequiredWord("Day");
        assertTrue(requiredWords.isRequiredWord("Star"));
        assertTrue(requiredWords.isRequiredWord("Space"));
        assertTrue(requiredWords.isRequiredWord("Day"));
        assertFalse(requiredWords.isRequiredWord("Fast"));
        assertFalse(requiredWords.isRequiredWord("Man"));

        requiredWords.addRequiredWord("Star"); // add duplicated word
        requiredWords.addRequiredWord("Fast");
        requiredWords.removeRequiredWord("Space");
        requiredWords.removeRequiredWord("Day");
        assertTrue(requiredWords.isRequiredWord("Star"));
        assertFalse(requiredWords.isRequiredWord("Space"));
        assertFalse(requiredWords.isRequiredWord("Day"));
        assertTrue(requiredWords.isRequiredWord("Fast"));
        assertFalse(requiredWords.isRequiredWord("Man"));
    }
}