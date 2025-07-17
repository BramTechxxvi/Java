public class Lcm {

    public int greatestCommonDivisor(int... numbers) {
        if(numbers.length == 0) throw new IllegalArgumentException("You must provide at least one number");
        int result = numbers[0];
        for (int count = 0; count < numbers.length; count++) {
            result = gcd(result, numbers[count]);
        }
        return result;
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
