package org.leetcode.problem._6_zigzag_conversion;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class ZigzagConversionTest {
    @Spy
    private ZigzagConversion zigzagConversion;

    @Test
    void convert() {
        assertEquals("PAHNAPLSIIGYIR", zigzagConversion.convert("PAYPALISHIRING", 3));
        assertEquals("PINALSIGYAHRPI", zigzagConversion.convert("PAYPALISHIRING", 4));
        assertEquals("A", zigzagConversion.convert("A", 1));
    }
}