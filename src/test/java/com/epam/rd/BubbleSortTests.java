/**
 * 1. Sort integer numbers
 * If the given input is empty the sort functionality should return empty integer array
 * If the given input is null the sort functionality should return empty integer array
 * If the input has more than one integer, return the sorted array.
 */
package com.epam.rd;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class BubbleSortTests {

    @Test
    public void isEmptyIntegerArrayThenReturnEmptyArray() {
        assertTrue(
                Arrays.equals(
                        new int[]{},
                        BubbleSort.sort(new int[]{})
                ),
                "Output is not same."
        );
    }

    @Test
    public void shouldReturnSortedArray() {
        assertTrue(
                Arrays.equals(
                        new int[]{1, 2, 3},
                        BubbleSort.sort(new int[]{2, 3,1})
                )
        );
    }

    @Test
    public void shouldReturnEmptyArrayIfInputArrayIsNull() {
        assertTrue(
                Arrays.equals(
                        new int[]{},
                        BubbleSort.sort(null)
                )
        );
    }
}
