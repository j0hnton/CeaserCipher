import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class DecryptionTest {
    @Test
    public void runCeaserCipher_isEntryString_String() {
        Decrypt testEncrypt = new Decrypt();
        String expectedOutput = "cba";
        assertEquals(expectedOutput, testEncrypt.decryption("abc", 2));
    }

