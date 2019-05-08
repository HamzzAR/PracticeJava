import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;


public class Streamss {

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("abc", "","Hello","" ,"bc", "efg", "abcd","", "jkl");
		List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
		
//		Random random = new Random();
//		random.ints().limit(10).forEach(System.out::println);
		
//		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
//		//get list of unique squares
//		List<Integer> squaresList = numbers.stream().map( i -> i*i).sorted().distinct().collect(Collectors.toList());
//		System.out.println(squaresList);
		
//		List<String>strings1 = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
//		//get count of empty string
//		int count = (int) strings1.stream().filter(string -> string.isEmpty()).count();
//		
//		Random random = new Random();
//		random.ints().limit(10).sorted().forEach(System.out::println);
		

//		List<String>strings1 = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
//		List<String> filtered1 = strings1.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
//
//		System.out.println("Filtered List: " + filtered1);
//		String mergedString = strings1.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(", "));
//		System.out.println("Merged String: " + mergedString);
		
//		List numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
//		IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> x).summaryStatistics();
//
//		System.out.println("Highest number in List : " + stats.getMax());
//		System.out.println("Lowest number in List : " + stats.getMin());
//		System.out.println("Sum of all numbers : " + stats.getSum());
//		System.out.println("Average of all numbers : " + stats.getAverage());
		
		
	}

}
