class haystack{
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }
        
        int hLen = haystack.length();
        int nLen = needle.length();
        
        for (int i = 0; i <= hLen - nLen; i++) {
            int j;
            for (j = 0; j < nLen; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
            }
            if (j == nLen) {
                return i;
            }
        }
        
        return -1;
    }
}