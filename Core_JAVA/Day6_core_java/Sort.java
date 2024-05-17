package Exam;

public class Sort {
    
    public char maxOccuringChar(String str) {
        if (str == null || str.isEmpty()) {
            return '0';
        }
        
        int[] count = new int[Character.MAX_VALUE + 1];
        

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            count[ch]++;
        }
        
        char maxChar = str.charAt(0);
        int maxCount = count[maxChar];
        
        for (int i = 1; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (count[ch] > maxCount) {
                maxChar = ch;
                maxCount = count[ch];
            }
        }
        
        return maxChar;
    }
    
    public static void main(String[] args) {
        Sort sort = new Sort();
        String str = "ssyyn";
        char maxChar = sort.maxOccuringChar(str);
        System.out.println(maxChar);
    }
}
