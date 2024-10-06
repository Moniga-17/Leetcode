//https://leetcode.com/problems/excel-sheet-column-title/description/

class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder columnTitle = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--; // Adjust for 0-based index
            int remainder = columnNumber % 26;
            columnTitle.insert(0, (char) ('A' + remainder));
            columnNumber /= 26;
        }
        return columnTitle.toString();
    }
}
