
/**
 * Write a description of class Decryption here.
 *
 * @author Anish Gupta
 * @version 9/4/21
 */
public class Decryption
{
    public static final String ALPHABET = "ABCDEFGHIJKLMNOPQRTSUVWXYZ";
    public static final String alphabet = "abcdefghijklmnopqrstuvwxyz";
    public static String decrypt(String plainText, int shift)
    {
        String decrypted = "";
        for(int i = 0; i < plainText.length(); i++)
        {
            char letter = plainText.charAt(i);
            int flag = 0;
            for(int j = 0; j < alphabet.length(); j++)
            {
                if(ALPHABET.charAt(j) == letter)
                {
                    int newlocation = j - shift;
                    if (newlocation < 0)
                    {
                        newlocation += 26;
                    }
                    char newletter = ALPHABET.charAt(newlocation);
                    decrypted = decrypted + newletter;
                    flag = 1;
                }
                if(alphabet.charAt(j) == letter)
                {
                    int newlocation = j - shift;
                    if (newlocation < 0)
                    {
                        newlocation += 26;
                    }
                    char newletter = alphabet.charAt(newlocation);
                    decrypted = decrypted + newletter;
                    flag = 1;
                }
            }
            if(flag == 0)
                decrypted = decrypted + letter; // dont do anything if not found in alphabets
        }
        return decrypted;
    }
}
