public class PerfectNumber {

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }
            int sum = 0;

        // you cannot take i = number as it will count the number itself and it wont be a perfect number
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    sum += i;
                }

            }
            if(sum==number){
                return true;
            }
            else {
                return false;
            }
        }



    }
