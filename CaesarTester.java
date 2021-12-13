import java.util.Scanner;
/**
 * Write a description of class CaesarTester here.
 *
 * @author Anish Gupta
 * @version 9/4/21
 */
public class CaesarTester
{
    public static void main(String args[])
    {
        Scanner integer = new Scanner(System.in);
        Scanner string = new Scanner(System.in);
        int shiftKeyValue = 0;
        String choice = "";
        System.out.println("Welcome to Ceaser Shift Encryption Message Method Program!\n");
        while(true)
        {
            while(true)
            {
                System.out.print("Please choose if you want to encrypt or decrypt text by typing \"Encrypt\" or \"Decrypt\" as an option, or if you want to quit the program type \"Q\": ");
                choice = string.nextLine();
                if ((!choice.equalsIgnoreCase("Encrypt")) && (!choice.equalsIgnoreCase("Decrypt")) && (!choice.equalsIgnoreCase("Q")))
                {
                    System.out.println("Input is invalid, please enter a correct entry option below!\n");
                    continue;
                }
                break;
            }
            if(choice.equalsIgnoreCase("Q"))
            {  
                System.out.println("You have quit this program!");
                break;
            }          
            while(true)
            {
                System.out.print("Please enter a shift key value from 0-25 (beginning and end values are inclusive): ");
                shiftKeyValue = integer.nextInt();
                System.out.println();
                break;
            }
            while(shiftKeyValue < 0 || shiftKeyValue > 25)
            {
                System.out.println("Input is invalid");
                System.out.print("Please enter a shift key value from 0-25 (beginning and end values are inclusive): ");
                shiftKeyValue = integer.nextInt();
                System.out.println();
            }
            while(true)
            {
                if(choice.equalsIgnoreCase("Encrypt"))
                {
                    System.out.print("Please enter the text for encryption: ");
                    String plainText = string.nextLine();
                    String encryptedText = Encryption.encrypt(plainText, shiftKeyValue);
                    System.out.println("Encrytped Text is: " + encryptedText + "\n");
                    break;
                }
                else if(choice.equalsIgnoreCase("Decrypt"))
                {
                    System.out.print("Please enter the text for decryption: ");
                    String plainText = string.nextLine();
                    String decryptedText = Decryption.decrypt(plainText, shiftKeyValue);
                    System.out.println("Decrypted Text is: " + decryptedText + "\n");
                    break;
                }
                else
                {
                    System.out.print("Input is invalid, please enter a correct entry option: ");
                    choice = string.nextLine();    
                }
            }            
        }
    }
}