import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class EncryptionTest {
    @Tes
    public void runCeaserCipher_isEntryString_String() {
        Encrypt testEncrypt = new Encrypt();
        String expectedOutput = "cde";
        assertEquals(expectedOutput, testEncrypt.encryption("abc", 2));
    }
    @Test
    public void runCeaserCipher_isEntryString2_String() {
        Encrypt testEncrypt = new Encrypt();
        String expectedOutput = "efg";
        assertEquals(expectedOutput, testEncrypt.encryption("cde", 2));
    }
    @Test
    public void runCeaserCipher_isEntryString3_String() {
        Encrypt testEncrypt = new Encrypt();
        String expectedOutput = "bbb";
        assertEquals(expectedOutput, testEncrypt.encryption("zzz", 2));
    }
    @Test
    public void runCeaserCipher_isEntryString4_String() {
        Encrypt testEncrypt = new Encrypt();
        String expectedOutput = "ddd";
        assertEquals(expectedOutput, testEncrypt.encryption("bbb", 2));
    }
    @Test
    public void runCeaserCipher_isEntryString5_String() {
        Encrypt testEncrypt = new Encrypt();
        String expectedOutput = "ded";
        assertEquals(expectedOutput, testEncrypt.encryption("bcb", 2));
    }
}
