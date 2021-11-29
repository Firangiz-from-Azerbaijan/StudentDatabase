package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class InvalidCharExceptions extends Exception{
    String passwords;
    public InvalidCharExceptions(String passwords) {
        this.passwords=passwords;
    }



    public String toString() {
        return "InvalidCharExceptions{" +
                "ch='" + passwords + '\'' +
                '}';
    }
}
