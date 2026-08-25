package TimePass;

public class ANAGram {

	public static void main(String[]args) {
		String str1 = "listen";
        String str2 = "silent";

        if (str1.length() != str2.length()) {
            System.out.println("Not Anagram");
            return;
        }

        char[] arr = str2.toCharArray();

        for (int i = 0; i < str1.length(); i++) {

            char ch = str1.charAt(i);
            boolean found = false;

            for (int j = 0; j < arr.length; j++) {

                if (ch == arr[j]) {
                    found = true;
//                    arr[j] = ' ';
                    break;
                }
            }

            if (!found) {
                System.out.println("Not Anagram");
                return;
            }
        }

        System.out.println("Anagram");
}
}
