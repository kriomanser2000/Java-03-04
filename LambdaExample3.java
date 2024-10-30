import java.util.function.IntPredicate;

public class LambdaExample3
{
    public static int sumIfCondition(int[] numbers, IntPredicate condition)
    {
        int sum = 0;
        for (int num : numbers)
        {
            if (condition.test(num))
            {
                sum += num;
            }
        }
        return sum;
    }
    public static void main(String[] args)
    {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        IntPredicate isEven = num -> num % 2 == 0;
        System.out.println("Sum of even numbers: " + sumIfCondition(numbers, isEven));
        IntPredicate isOdd = num -> num % 2 != 0;
        System.out.println("Sum of odd numbers: " + sumIfCondition(numbers, isOdd));
        int A = 3, B = 7;
        IntPredicate inRange = num -> num >= A && num <= B;
        System.out.println("The sum of numbers in the range from " + A + " to " + B + ": " + sumIfCondition(numbers, inRange));
        int divisor = 3;
        IntPredicate isMultipleOfA = num -> num % divisor == 0;
        System.out.println("The sum of numbers that are multiples of " + divisor + ": " + sumIfCondition(numbers, isMultipleOfA));
    }
}
