package Interview;

public class CommonPrefixFinder {
    public static void main(String[] args) {
        String[] str = { "javaphyton", "javacpp","javac"};
        String commonPrefix = findCommonPrefix(str);
        System.out.println("Common Prefix: " + commonPrefix);
    }

    public static String findCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String firstStr = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(firstStr) != 0) {
                firstStr = firstStr.substring(0, firstStr.length() - 1);
            }
        }

        return firstStr;
    }
}
