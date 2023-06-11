package etc;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.DESedeKeySpec;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class DES {
    public static void main(String[] args) {
        DES desUtil = new DES();

        String plainText = "Hello World";
        System.out.println("plainText : " + plainText);

        String encrtpt = desUtil.encrypt(plainText);
        String decrypt = decrypt(encrtpt);

        System.out.println("DES 암호화 : " + encrtpt);
        System.out.println("DES 복호화 : " + decrypt);
    }

    private static Key key = null;

    static {
        if (key == null) {
            // Key 초기화
            KeyGenerator keyGenerator;
            try {
                keyGenerator = KeyGenerator.getInstance("TripleDES");
                keyGenerator.init(168);
                key = keyGenerator.generateKey();
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            }
        }
    }

    public static String encrypt(String message) {
        StringBuffer sb = null;
        try {
            Cipher cipher = Cipher.getInstance("TripleDES/ECB/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, key);
            byte[] plaintext = message.getBytes("UTF8");
            byte[] ciphertext = cipher.doFinal(plaintext);

            sb = new StringBuffer(ciphertext.length * 2);
            for (int i = 0; i < ciphertext.length; i++) {
                String hex = "0" + Integer.toHexString(0xff & ciphertext[i]);
                sb.append(hex.substring(hex.length() - 2));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    public static String decrypt(String message) {
        String text = null;
        try {
            byte[] b = new byte[message.length() / 2];
            Cipher cipher = Cipher.getInstance("TripleDES/ECB/PKCS5Padding");
            cipher.init(Cipher.DECRYPT_MODE, key);
            for (int i = 0; i < b.length; i++) {
                b[i] = (byte) Integer.parseInt(message.substring(2 * i, 2 * i + 2), 16);
            }
            byte[] decryptedText = cipher.doFinal(b);
            text = new String(decryptedText, "UTF8");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return text;
    }
}
