package org.example.kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegexValidatePINTest {
    @Test
    public void validPins() {
        assertTrue(RegexValidatePIN.validatePin("1234"));
        assertTrue(RegexValidatePIN.validatePin("0000"));
        assertTrue(RegexValidatePIN.validatePin("1111"));
        assertTrue(RegexValidatePIN.validatePin("123456"));
        assertTrue(RegexValidatePIN.validatePin("098765"));
        assertTrue(RegexValidatePIN.validatePin("000000"));
        assertTrue(RegexValidatePIN.validatePin("090909"));
    }

    @Test
    public void nonDigitCharacters() {
        assertFalse(RegexValidatePIN.validatePin("a234"));
        assertFalse(RegexValidatePIN.validatePin(".234"));
    }

    @Test
    public void invalidLengths() {
        assertFalse(RegexValidatePIN.validatePin("1"));
        assertFalse(RegexValidatePIN.validatePin("12"));
        assertFalse(RegexValidatePIN.validatePin("123"));
        assertFalse(RegexValidatePIN.validatePin("12345"));
        assertFalse(RegexValidatePIN.validatePin("1234567"));
        assertFalse(RegexValidatePIN.validatePin("-1234"));
        assertFalse(RegexValidatePIN.validatePin("1.234"));
        assertFalse(RegexValidatePIN.validatePin("00000000"));
    }
}