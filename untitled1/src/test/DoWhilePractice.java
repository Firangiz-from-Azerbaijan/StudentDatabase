package test;

public class DoWhilePractice {
    public static void main(String[] args) {
        System.out.println("The sum of the first and the last digit is: " + sumFirstAndLastDigit(58974));

    }
    public static int sumFirstAndLastDigit(int number){
        if ((number < 0)){
            return -1;
        } else if(number == 0){
            return 0;
        }
        int sum = 0;
        int lastDigit = number%10;
        int firstDigit = 0;
        while (number > 0){
            firstDigit = number%10;
            number /= 10;
            sum = lastDigit + firstDigit;
        }
        return sum;
    }
}
