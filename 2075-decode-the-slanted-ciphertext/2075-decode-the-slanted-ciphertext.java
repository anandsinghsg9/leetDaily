class Solution {
    public String decodeCiphertext(String encodedText, int rows) {
        int n = encodedText.length();
        int cols = n / rows;
        StringBuilder sb = new StringBuilder();
        
        // We start each diagonal from the top row (row 0)
        // Each starting point is (0, i) where i is the column index
        for (int i = 0; i < cols; i++) {
            int r = 0;
            int c = i;
            
            // Follow the diagonal down until we hit a boundary
            while (r < rows && c < cols) {
                // Calculate the index in the 1D encodedText string
                // 1D index = current_row * total_cols + current_col
                int index = r * cols + c;
                sb.append(encodedText.charAt(index));
                
                // Move diagonally
                r++;
                c++;
            }
        }
        
        // The problem states originalText does not have trailing spaces.
        // During encoding, empty cells were filled with ' ', so we trim only the end.
        return trimTrailingSpaces(sb.toString());
    }
    
    private String trimTrailingSpaces(String s) {
        int i = s.length() - 1;
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }
        return s.substring(0, i + 1);
    }
}