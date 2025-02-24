package org.leetcode.problem._8_string_to_integer_atoi;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class StringToIntegerAtoiTest {
    @Spy
    private StringToIntegerAtoi stringToIntegerAtoi;

    @Test
    void myAtoi() {
        assertEquals(123, stringToIntegerAtoi.myAtoi("123"));
        assertEquals(-42, stringToIntegerAtoi.myAtoi("   -042"));
        assertEquals(1337, stringToIntegerAtoi.myAtoi("1337c0d3"));
        assertEquals(0, stringToIntegerAtoi.myAtoi("0-1"));
        assertEquals(0, stringToIntegerAtoi.myAtoi("words and 987"));
    }
}