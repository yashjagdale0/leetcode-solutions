class Solution {
    public int romanToInt(String s) {
        int total = 0;
        s = s.replace("IV", "IIII")
             .replace("IX", "VIIII")
             .replace("XL", "XXXX")
             .replace("XC", "LXXXX")
             .replace("CD", "CCCC")
             .replace("CM", "DCCCC");
                for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);   
            if (c == 'I') total += 1;
            else if (c == 'V') total += 5;
            else if (c == 'X') total += 10;
            else if (c == 'L') total += 50;
            else if (c == 'C') total += 100;
            else if (c == 'D') total += 500;
            else if (c == 'M') total += 1000;
        }   
        return total;
    }
}
