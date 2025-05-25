package easy.strings;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        StringBuilder sb = new StringBuilder();
        int minLength = Integer.MAX_VALUE;


        for (String str : strs) {
            minLength = Math.min(minLength, str.length());
        }


        for (int i = 0; i < minLength; i++) {
            char currentChar = strs[0].charAt(i);

            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) != currentChar) {
                    return sb.toString();
                }
            }

            sb.append(currentChar);
        }

        return sb.toString();
    }
}
