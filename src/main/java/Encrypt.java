public class Encrypt {
    public static String alphabet = "abcdefghijklmnopqrstuvwxyz";
    public static String encryption(String text, int value2){
        String cipher = "";
        for(int i=0; i<text.length(); i++){
            int find = alphabet.indexOf(text.charAt(i));
            int  newfind= (find + value2)%26;
            char newValue = alphabet.charAt(newfind);
            cipher+=newValue;
        }
        return cipher;
    }
}
