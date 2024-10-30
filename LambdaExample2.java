public class LambdaExample2
{
    public static void main(String[] args)
    {
        TriFunction<Integer, Integer, Integer, Integer> maxOfThree = (a, b, c) ->
        {
            return Math.max(a, Math.max(b, c));
        };
        TriFunction<Integer, Integer, Integer, Integer> minOfThree = (a, b, c) ->
        {
            return Math.min(a, Math.min(b, c));
        };
        int maxResult = maxOfThree.apply(3, 7, 5);
        int minResult = minOfThree.apply(3, 7, 5);
        System.out.println("Max from 3: " + maxResult);
        System.out.println("Min from 3: " + minResult);
    }
}
@FunctionalInterface
interface TriFunction<T, U, V, R>
{
    R apply(T t, U u, V v);
}
