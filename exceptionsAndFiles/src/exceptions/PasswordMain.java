package exceptions;

import java.io.*;
import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class PasswordMain {
    public static void main(String[] args) {
        // Read a file of passwords

        String filename = "C:\\Java training\\password.txt";
        String[] password = new String[9];

        File file = new File(filename);
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            for (int i = 0; i < password.length; i++) {
                password[i] = br.readLine();
            }
        } catch (FileNotFoundException e) { System.out.println("Error: could not open file");
        } catch (IOException e) { System.out.println("Error: could not read file"); }

        // Test against our criteria
        for (String passwords : password) {
            System.out.println("***********\n" + passwords);
            boolean hasNumber = false;
            boolean hasLetter = false;
            boolean hasSpecialCharacter = false;
            boolean hasInvalidChar = false;


            for (int n = 0; n < passwords.length(); n++) {
                //contains a number
                if ("0123456789".contains(passwords.substring(n, n + 1))) {
                    hasNumber = true;
                    // System.out.println("Position " + n + " contains a number");
                    //contains letter
                } else if ("abcdefghijklmnopqrstuvwxyz".contains(passwords.substring(n, n + 1).toLowerCase())) {
                    hasLetter = true;
                    //System.out.println("Position " + n + " contains a letter");
                    //contains special character
                } else if ("!@#$%^&*()<>.,/[]{}".contains(passwords.substring(n, n + 1))) {
                    hasSpecialCharacter = true;
                    //System.out.println("Position " + n + " contains a special character");
                }
                else {
                    try {throw new InvalidCharExceptions(passwords.substring(n, n + 1));
                    } catch (InvalidCharExceptions e) { e.toString(); }
                }
            }

            //hasInvalidChar = true;
            //System.out.println("Position " + n + " contains an invalid character");

            try {
                if (!hasNumber) { throw new NumberCriteriaException(passwords); }
                else if (!hasLetter) { throw new LetterCriteriaException(passwords); }
                    else if (!hasSpecialCharacter) { throw new HasSpecialCharacterException(passwords); }
                    else {System.out.println("Valid password"); }
                   } catch(NumberCriteriaException | LetterCriteriaException | HasSpecialCharacterException e) {
                        System.out.println("Invalid password");
                        System.out.println(e.toString());
                    }
                }
            }
        }
