import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class _03_Stream {
    public static void main(String[] args) {

        // Arrays.stream()
        int[] scores = { 100, 95, 90, 85, 80 };
        IntStream scoreStream = Arrays.stream(scores);

        String[] langs = { "Java", "Python", "C", "C++", "C#" };
        Stream<String> stream = Arrays.stream(langs);

        // Collection Stream()
        List<String> langList = new ArrayList<>();
        // langList.add("Java");
        // langList.add("Python");
        langList = Arrays.asList("Java", "Python", "C", "C++", "C#");
        Stream<String> langListStream = langList.stream();

        // Stream.Of()
        Stream<String> langListOfStream = Stream.of("Java", "Python", "C", "C++", "C#");

        Arrays.stream(scores).filter(x -> x >= 90).forEach(x -> System.out.println(x));
        System.out.println("=================================");

        Arrays.stream(scores).filter(x -> x >= 90).forEach(System.out::println);
        System.out.println("=================================");

        int count = (int) Arrays.stream(scores).filter(x -> x >= 90).count();
        System.out.println(count);
        System.out.println("=================================");

        int sum = Arrays.stream(scores).filter(x -> x >= 90).sum();
        System.out.println(sum);
        System.out.println("=================================");

        Arrays.stream(scores).filter(x -> x >= 90).sorted().forEach(System.out::println);
        System.out.println("=================================");

        // "Java", "Python", "C", "C++", "C#"
        Arrays.stream(langs).filter(x -> x.startsWith("C")).forEach(System.out::println);
        System.out.println("=================================");

        Arrays.stream(langs).filter(x -> x.contains("Java")).forEach(System.out::println);
        System.out.println("=================================");

        langList.stream().filter(x -> x.length() <= 4).sorted().forEach(System.out::println);
        System.out.println("=================================");

        langList.stream()
                .filter(x -> x.length() <= 4)
                .filter(x -> x.contains("C"))
                .forEach(System.out::println);
        System.out.println("=================================");

        boolean anyMatch = langList.stream()
                .filter(x -> x.length() <= 4)
                .anyMatch(x -> x.contains("C"));
        System.out.println(anyMatch);
        System.out.println("=================================");

        boolean allMatch = langList.stream()
                .filter(x -> x.length() <= 4)
                .allMatch(x -> x.contains("C"));
        System.out.println(allMatch);
        System.out.println("=================================");

        langList.stream()
                .filter(x -> x.length() <= 4)
                .filter(x -> x.contains("C"))
                .map(x -> x + " (is so difficult)")
                .forEach(System.out::println);
        System.out.println("=================================");

        langList.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
        System.out.println("=================================");

        List<String> langListStarsWithC = langList.stream()
                .filter(x -> x.contains("C"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        langListStarsWithC.stream().forEach(System.out::println);
        System.out.println("=================================");
    }
}
