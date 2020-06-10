import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage(){
        //to take input from the user.
        Scanner scanner = new Scanner(System.in);
        int sum=0;
        int count=0;
        int average=0;
        while (true){
     //       System.out.println("Enter number");
            boolean isAnInt= scanner.hasNextInt();
            if(isAnInt){
                int number= scanner.nextInt();//if the number is int then it will count++
                count++;
                sum += number;
                // used casting to round the number.
                average= Math.round((float) sum / count);

            }else {
                break;
            }

        }
        scanner.nextLine();// handles the enter key.
        System.out.println("SUM = " + sum + " AVG = " + average);

        scanner.close();

    }

}
