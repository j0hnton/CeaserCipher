public class Decrypt {
    public static String alphabet = "abcdefghijklmnopqrstuvwxyz";
    public static String decryption(String text, int value2) {
        String cipher = "";
        for (int i = 0; i < text.length(); i++) {
            int find = alphabet.indexOf(text.charAt(i));
            int newfind = (value2 - find) % 26;
            char newValue = alphabet.charAt(newfind);
            cipher += newValue;
        }
        return  cipher;
    }
}


