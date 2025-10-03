import java.util.Arrays;

public class prc_10a {
    public static boolean ag(String s1, String s2) {
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        if (s1.length()!= s2.length()) return false;

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        String str1 = "Listen";
        String str2 = "Silent";
        System.out.println(ag(str1, str2));  // true
    }
}
