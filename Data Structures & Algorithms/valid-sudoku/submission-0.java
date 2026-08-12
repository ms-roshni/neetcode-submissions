class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n = board.length;
        HashSet<String> hs = new HashSet<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                char curr = board[i][j];
                if (curr == '.') continue;

                if (!hs.add(curr + " in row " + i)) return false;
                if (!hs.add(curr + " in col " + j)) return false;
                if (!hs.add(curr + " in box " + (i / 3) + "-" + (j / 3))) return false;
            }
        }
        return true;
    }
}
