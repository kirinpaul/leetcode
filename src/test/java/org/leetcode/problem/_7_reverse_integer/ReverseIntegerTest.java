package org.leetcode.problem._7_reverse_integer;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class ReverseIntegerTest {
    @Spy
    private ReverseInteger reverseInteger;

    @Test
    void reverse() {
        assertEquals(121, reverseInteger.reverse(121));
        assertEquals(321, reverseInteger.reverse(123));
        assertEquals(-321, reverseInteger.reverse(-123));
        assertEquals(-21, reverseInteger.reverse(-120));
        assertEquals(93, reverseInteger.reverse(3900));
    }
}