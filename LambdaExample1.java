import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaExample1
{
    public static void main(String[] args)
    {
        BiFunction<Integer, Integer, Integer> maxOfTwo = (a, b) -> a > b ? a : b;
        System.out.println("Max of 10 and 20: " + maxOfTwo.apply(10, 20));
        BiFunction<Integer, Integer, Integer> minOfTwo = (a, b) -> a < b ? a : b;
        System.out.println("Min of 10 and 20: " + minOfTwo.apply(10, 20));
        Function<Integer, Integer> factorial = n ->
        {
            int result = 1;
            for (int i = 1; i <= n; i++)
            {
                result *= i;
            }
            return result;
        };
        System.out.println("Factorial of 5: " + factorial.apply(5));
        Predicate<Integer> isPrime = num ->
        {
            if (num < 2) return false;
            for (int i = 2; i <= Math.sqrt(num); i++)
            {
                if (num % i == 0) return false;
            }
            return true;
        };
        System.out.println("Is 7 prime? " + isPrime.test(7));
        System.out.println("Is 10 prime? " + isPrime.test(10));
    }
}
