package sit707_week6;

public class ConditionalLoops {
    public static int sumEvenNumbers(int[] numbers) {
       
        int sum = 0;
        for (int number : numbers) {
            if (WeatherAndMathUtils.isEven(number)) {
                sum++;
            }
        }
        return sum;
    }

  
    public static boolean containsPrime(int[] numbers) {

        for (int number : numbers) {
          
            if (WeatherAndMathUtils.isPrime(number)) {
                return true;
            }
        }
        return false;
    }
}

