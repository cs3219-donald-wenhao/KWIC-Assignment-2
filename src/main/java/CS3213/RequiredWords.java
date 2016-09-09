package main.java.CS3213;

import java.util.HashSet;

/**
 * Created by junchao on 8/23/2014.
 */
public class RequiredWords {
    private HashSet<String> _requiredWords;
    private static RequiredWords _instatnce;
    private RequiredWords() {
        this._requiredWords = new HashSet<String>();
    }

    public static RequiredWords getRequiredWords() {
    	/* To be implemented */
    	return new RequiredWords();
    }

    public void addRequiredWord(String word) {
        /* To be implemented */
    }

    public void removeRequiredWord(String word) {
    	/* To be implemented */
    }

    public boolean isRequiredWord(String word) {
    	/* To be implemented */
    	return false;
    }
}
