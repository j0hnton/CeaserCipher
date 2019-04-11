import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class EncryptionTest {
    @Test
    public void runCeaserCipher_isEntryString_String() {
        Encrypt testEncrypt = new Encrypt();
        String expectedOutput = "cde";
        assertEquals(expectedOutput, testEncrypt.encryption("abc", 2));
    }
}
