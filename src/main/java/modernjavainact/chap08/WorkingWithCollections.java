package modernjavainact.chap08;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class WorkingWithCollections {

    public static void main(String[] args) {
        workingWithLists();
    }

    private static void workingWithLists() {
        System.out.println("--- Working with Lists ---");

        System.out.println("--> Transforming list items with a Stream");
        List<String> referenceCodes = Arrays.asList("a12", "C14", "b13");
        referenceCodes.stream()
                .map(code -> Character.toUpperCase(code.charAt(0)) + code.substring(1))
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println("... but the original List remains unchanged: " + referenceCodes);

        System.out.println("--> Mutating a list with a ListIterator");
        for (ListIterator<String> iterator = referenceCodes.listIterator(); iterator.hasNext(); ) {
            String code = iterator.next();
            iterator.set(Character.toUpperCase(code.charAt(0)) + code.substring(1));
        }
        System.out.println("This time it's been changed: " + referenceCodes);

        System.out.println("--> Mutating a list with replaceAll()");
        referenceCodes = Arrays.asList("a12", "C14", "b13");
        System.out.println("Back to the original: " + referenceCodes);
        referenceCodes.replaceAll(code -> Character.toUpperCase(code.charAt(0)) + code.substring(1));
        System.out.println("Changed by replaceAll(): " + referenceCodes);
    }
}
