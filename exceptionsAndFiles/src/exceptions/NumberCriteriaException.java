package exceptions;

public class NumberCriteriaException extends Exception{
    String passwords;
    public NumberCriteriaException(String passwords) {
        this.passwords = passwords;
    }

    @Override
    public String toString() {
        return "NumberCriteriaException: " +  passwords;
    }
}
