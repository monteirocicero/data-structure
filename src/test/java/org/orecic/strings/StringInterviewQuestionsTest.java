package org.orecic.strings;

import org.junit.Assert;
import org.junit.Test;

public class StringInterviewQuestionsTest {

    @Test
    public void testUniqueStringCharacters() {
        // given
        String sequence = "atmpjk";

        // then
        Assert.assertTrue(hasUniquesCharacters(sequence));

    }

    @Test
    public void testNonUniqueStringCharacters() {
        // given
        String sequence = "atmpjka";

        // then
        Assert.assertFalse(hasUniquesCharacters(sequence));

    }

    private boolean hasUniquesCharacters(String sequence) {
        for (int i = 0; i < sequence.length(); i++) {
            for (int j = i + 1; j < sequence.length(); j++) {
                if (sequence.charAt(i) == sequence.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
}
