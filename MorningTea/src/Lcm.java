public class Lcm {

    public int greatestCommonDivisor(int... numbers) {
        if(numbers.length == 0) throw new IllegalArgumentException("You must provide at least one number");
        for (int count = 0; count < numbers.length; count++) {
            result = gcd(result, numbers[i])
        }
        return 0;
    }

    public int gcd(int firstNumber, int secondNumber) {
        while (secondNumber != 0) {
            int temp = secondNumber;
            secondNumber = firstNumber % secondNumber;
            firstNumber = temp;
        }
        return firstNumber;
    }
}
