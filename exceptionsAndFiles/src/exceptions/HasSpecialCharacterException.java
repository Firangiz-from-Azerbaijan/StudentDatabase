package exceptions;

public class HasSpecialCharacterException extends Exception {
    String passwords;

    public HasSpecialCharacterException(String passwords) {
        this.passwords = passwords;
    }

    @Override
    public String toString() {
        return "HasSpecialCharacterException: " + passwords;
    }
}
