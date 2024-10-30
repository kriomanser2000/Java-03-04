import java.time.LocalDate;
import java.time.LocalTime;
import java.util.function.Function;
import java.util.function.Supplier;

public class LambdaExample
{
    public static void main(String[] args)
    {
        Function<int[], Integer> sumOfThree = (numbers) -> numbers[0] + numbers[1] + numbers[2];
        int sumResult = sumOfThree.apply(new int[]{5, 10, 15});
        System.out.println("The sum of three numbers: " + sumResult);
        Function<int[], Integer> productOfThree = (numbers) -> numbers[0] * numbers[1] * numbers[2];
        int productResult = productOfThree.apply(new int[]{2, 3, 4});
        System.out.println("Product of three numbers: " + productResult);
        Supplier<LocalTime> currentTime = LocalTime::now;
        System.out.println("Current time: " + currentTime.get());
        Supplier<LocalDate> currentDate = LocalDate::now;
        System.out.println("Current date: " + currentDate.get());
    }
}
