package exceptions;

public class LetterCriteriaException extends Exception{
    String passwords;
    public LetterCriteriaException(String passwords) {
        this.passwords = passwords;
    }

    @Override
    public String toString() {
        return "LetterCriteriaException: " + passwords;
    }
}
