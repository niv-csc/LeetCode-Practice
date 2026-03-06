class roman{
    public int romanToInt(String s) {
        int result = 0;
        int prev = 0;
        
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            int curr = 0;
            
            switch (c) {
                case 'I': curr = 1; break;
                case 'V': curr = 5; break;
                case 'X': curr = 10; break;
                case 'L': curr = 50; break;
                case 'C': curr = 100; break;
                case 'D': curr = 500; break;
                case 'M': curr = 1000; break;
            }
            
            if (curr < prev) {
                result -= curr;
            } else {
                result += curr;
            }
            
            prev = curr;
        }
        
        return result;
    }
}