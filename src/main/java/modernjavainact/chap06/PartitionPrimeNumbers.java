package modernjavainact.chap06;

import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

public class PartitionPrimeNumbers {
/*
    public static void main(String[] args) {
        System.out.println("Numbers partitioned in prime and non-prime: "
                + partitionPrimes(100));
        System.out.println("Numbers partitioned in prime and non-prime: "
                + partitionPrimesWithCustomCollector(100));
    }

    public static Map<Boolean, List<Integer>> partitionPrimes(int n) {
        return IntStream.rangeClosed(2, n).boxed()
                .collect(partitionBy(candidate -> isPrime(candidate)));
    }

    public static boolean isPrime(int candidate) {
        return IntStream.rangeClosed(2, candidate-1)
                .limit((long) Math.floor(Math.sqrt(candidate)) - 1)
                .noneMatch(i -> candidate % i == 0);
    }

    public static Map<Boolean, List<Integer>> partitionPrimesWithCustomCollector(int n) {
        return IntStream.rangeClosed(2, n).boxed().collect(new PrimeNumbersCollector());
    }

    */
}
