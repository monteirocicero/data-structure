package org.orecic.strings;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

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

    @Test
    public void testTwoStringIsPermutation() {
        // given
        String strA = "xyz";

        List<String> permutationsCases = Arrays.asList("XYZ", "XZY", "ZXY", "ZYX", "YZX", "YXZ");

        for (int i = 0; i < permutationsCases.size(); i++) {
            Assert.assertTrue(hasPermutation(strA, permutationsCases.get(i)));
        }
    }

    @Test
    public void testURLify() {
        // given
        String input = "Mr John Smith   ";
        int length = 13;
        String output = "Mr%20John%20Smith";

        // then
        Assert.assertEquals(output, replaceSpacesFromString(input, length));
    }

    private String replaceSpacesFromString(String input, int length) {
        char[] inputChar = input.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < length; i++) {
            if (new Character(' ').equals(inputChar[i])) {
                sb.append("%20");
                continue;
            }
            sb.append(inputChar[i]);
        }
        return sb.toString();
    }

    private boolean hasPermutation(String strA, String strB) {
        String iterableStr = strA.toLowerCase();
        String comperableStr = strB.toLowerCase();
        int quantityOfCharacters = 0;

        if (strA.length() < strB.length()) {
            iterableStr = strB;
            comperableStr = strA;
        }

        for (int i = 0; i < iterableStr.length(); i++) {
            for (int j = 0; j < comperableStr.length(); j++) {
                if (iterableStr.charAt(i) == comperableStr.charAt(j)) {
                    quantityOfCharacters++;
                }
            }
        }

        if (quantityOfCharacters == comperableStr.length()) {
            return true;
        }

        return false;
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
