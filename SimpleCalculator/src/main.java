public class main {
    public static void main(String[] args) {
        SimpleCalculator calculator= new SimpleCalculator();
        calculator.setFirstNumber(2);
        calculator.setSecondNumber(4);
        System.out.println("add = " + calculator.getAdditionResult());
        calculator.setFirstNumber(5.24);
        calculator.setSecondNumber(0);
        System.out.println("Subtract = " + calculator.getSubtractionResult());

        calculator.setFirstNumber(5.24);
        calculator.setSecondNumber(2.9);
        System.out.println("Multiplication = " + calculator.getMultiplicationResult());

        calculator.setFirstNumber(5.24);
        calculator.setSecondNumber(0);
        System.out.println("division = " + calculator.getDivisionResult());



    }

}
