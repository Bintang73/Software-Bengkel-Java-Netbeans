package menu;
import java.math.BigInteger;  
import java.nio.charset.StandardCharsets;  
import java.security.MessageDigest;  
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class encryption {
    private static byte[] getSHA(String input) throws NoSuchAlgorithmException  
    {  
        /* MessageDigest instance for hashing using SHA256 */  
        MessageDigest md = MessageDigest.getInstance("SHA-256");  
  
        /* digest() method called to calculate message digest of an input and return array of byte */  
        return md.digest(input.getBytes(StandardCharsets.UTF_8));  
    }  
      
    private static String toHexString(byte[] hash)  
    {  
        /* Convert byte array of hash into digest */  
        BigInteger number = new BigInteger(1, hash);  
  
        /* Convert the digest into hex value */  
        StringBuilder hexString = new StringBuilder(number.toString(16));  
  
        /* Pad with leading zeros */  
        while (hexString.length() < 32)  
        {  
            hexString.insert(0, '0');  
        }  
        return hexString.toString();  
    }
    
    String encrypt(String pass) {
        try {
            return toHexString(getSHA(pass));
        } catch (NoSuchAlgorithmException pass1) {
            Logger.getLogger(encryption.class.getName()).log(Level.SEVERE, null, pass1);
        }
        return null;
    }
}
