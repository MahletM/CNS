
package cnss;

import java.util.Random;


public class OTP {
    public static String generate_pad(int length){
    String pad = "";
    char randomCharacter; // Used to hold the current randomly generated character each iteration
    Random r = new Random();

    for( int i = 0; i < length; i++ ){
        randomCharacter = (char) r.nextInt(256);
        pad += randomCharacter;
        }

    return pad;
    }


public static String encrypt(String text, String pad){

    String ciphertext = "";
    char xoredValue;
    for( int i = 0; i < text.length(); i++ ){
        // XOR the int representation of the current text and pad characters
        xoredValue = (char) (text.charAt(i) ^ pad.charAt(i));
        ciphertext += xoredValue;
        }

    return ciphertext;
    }


public static String decrypt( String pad, String ciphertext){
    String plaintext = "";
    char xoredValue;

    for( int i = 0; i < pad.length(); i++ ){
        // XOR the int representation of the current ciphertext and pad characters
        xoredValue = (char) (ciphertext.charAt(i) ^ pad.charAt(i));

        plaintext += xoredValue;
        }

    return plaintext;
    }

    
}
