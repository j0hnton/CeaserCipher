package CeasarCipher;

import main.java.CeasarCipher.Decryption;
import main.java.CeasarCipher.Encryption;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        System.out.println("Enter word to be Encrypted or Decrypted");
        Scanner info=new Scanner(System.in);
        String value=info.nextLine();
        String data=value.toLowerCase();
        System.out.println("Input secret key(Number)");
        Scanner info2=new Scanner(System.in);
        int value2=info2.nextInt();
        Encryption encrypt=new Encryption();
        System.out.println(encrypt.encryption(data, value2));
        Decryption decrypt=new Decryption();
        System.out.println(decrypt.decryption(data, value2));
    }
}

