public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {
        if (number >= 0) {
            int lastDigit;
            //using modulo operator to find the remainder and also the last digit
            //e.g 1234 =1234%10 = 4.... 4 will be extracted and stored in the variable lastDigit.
            lastDigit = number % 10;
            int firstDigit= number;
            while (firstDigit >= 10) {
                // dividing the number by 10 in loop  e.g 1234/10= 123.4 but since this is a integer decimal place will not be counted..
                //and since this is a loop it will run over and over again till it is >=10
            firstDigit = firstDigit/ 10;

            }
            return firstDigit + lastDigit;
        }else{
            return -1;
        }

    }
}
