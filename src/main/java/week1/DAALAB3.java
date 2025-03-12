package week1;

public class DAALAB3 {
        static char last_removed;

        static String removeUtil(String str) {
            if (str.length() == 0 || str.length() == 1)
                return str;

            if (str.charAt(0) == str.charAt(1)) {
                last_removed = str.charAt(0);
                while (str.length() > 1 && str.charAt(0) == str.charAt(1)) {
                    str = str.substring(1);
                }
                return removeUtil(str.substring(1));
            }

            String rem_str = removeUtil(str.substring(1));

            if (!rem_str.isEmpty() && rem_str.charAt(0) == str.charAt(0)) {
                last_removed = str.charAt(0);
                return rem_str.substring(1);
            }

            if (rem_str.isEmpty() && last_removed == str.charAt(0)) {
                return rem_str;
            }

            return str.charAt(0) + rem_str;
        }

        static String remove(String str) {
            last_removed = '\0';
            return removeUtil(str);
        }

        public static void main(String args[]) {
            String str1 = "azxxxzy";
            System.out.println(remove(str1));
            String str2 = "caaabbbaac";
            System.out.println(remove(str2));
            String str3 = "gghhg";
            System.out.println(remove(str3));
            String str4 = "aaaacddddcappp";
            System.out.println(remove(str4));
            String str5 = "aaaaaaaaaa";
            System.out.println(remove(str5));
        }

}
