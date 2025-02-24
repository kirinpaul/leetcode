package org.leetcode.problem._2_add_two_numbers;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class AddTwoNumbersTest {
    @Spy
    private AddTwoNumbers addTwoNumbers;

    @Test
    void addTwoNumbers() {
        assertEquals(new ListNode(7, new ListNode(0, new ListNode(8))),
                addTwoNumbers.addTwoNumbers(
                        new ListNode(2, new ListNode(4, new ListNode(3))),
                        new ListNode(5, new ListNode(6, new ListNode(4)))
                )
        );

        assertEquals(new ListNode(0), addTwoNumbers.addTwoNumbers(new ListNode(0), new ListNode(0)));

        assertEquals(new ListNode(8, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(1)))))))),
                addTwoNumbers.addTwoNumbers(
                        new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))))))),
                        new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))))
                )
        );
    }
}