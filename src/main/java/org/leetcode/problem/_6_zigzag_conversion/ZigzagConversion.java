package org.leetcode.problem._6_zigzag_conversion;

public class ZigzagConversion {
    public String convert(String s, int numRows) {
        char[] result = new char[s.length()];
        int j;
        int k;
        int pos = 0;

        if (s.length() < numRows || numRows == 1) {
            return s;
        }

        for (int i = 1; i <= numRows; i++) {
            j = i - 1;
            k = 0;
            while (j < s.length()) {
                result[pos++] = s.charAt(j);
                // если первая или последняя строка
                if (i == 1 || i == numRows)
                    j = j + (numRows - 1) * 2;
                    // если строка ровно посередине
                else if (numRows % 2 == 1 && i == numRows / 2 + 1)
                    j = j + numRows - 1;
                    // все остальные строки
                else {
                    // символы высчитываются "вверх" (на нечетных буквах с индексом k пила идет вверх)
                    if (k % 2 == 0) {
                        j = j + (numRows - i) * 2;
                    }
                    // символы высчитываются "вниз" (на нечетных буквах с индексом k пила идет вниз)
                    else {
                        j = j + (i - 1) * 2;
                    }
                    k++;
                }
            }
        }

        return new String(result);
    }
}
