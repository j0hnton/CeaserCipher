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
        Encrypt encrypt=new Encrypt();
        System.out.println(Encrypt.encryption(data, value2));
        Decrypt decrypt=new Decrypt();
        System.out.println(Decrypt.decryption(data, value2));
    }
}

