package algos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

@Service
public class ArrayUtils {

	private static final String ENTER_ARRAY_MESSAGE = "Please Enter an Integer Array and presss Enter:= ";
	private static final String ENTER_ELEMENT_MESSAGE = "Please Enter an smallest kth element := ";
	private static final String OUTPUT_MESSAGE = "Output the smallest kth elemet is  := ";
	private static final String VALIDATIO_MESSAGE = "Please enter a value within string length  := ";

	public static String getIndextOfLowestValuefromArray(List<Integer> input, Integer smallestKth) {
		
		Set<Integer> colletor = new HashSet<>(input);
		try {
			if (smallestKth > input.size()) {
				System.out.println(VALIDATIO_MESSAGE + input.size());
				return null;
			}
			return colletor.stream().collect(Collectors.toList()).get(smallestKth).toString();
		} catch (Exception e) {
			return null;
		}

	}

	public static List<Integer> converStringArrytoInt(String array) {
		char[] argument = array.toCharArray();
		List<Integer> intList = new ArrayList<>();
		for (int i = 0; i < argument.length; i++) {
			intList.add(Integer.parseInt(argument[i] + ""));
		}
		return intList;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print(ENTER_ARRAY_MESSAGE);
		while (scanner.hasNext()) {

			String array = scanner.next();
			List<Integer> input = converStringArrytoInt(array);

			System.out.print(ENTER_ELEMENT_MESSAGE);
			String smallestKth = scanner.next();
			Integer intSmallestKth = Integer.parseInt(smallestKth);

			String output = getIndextOfLowestValuefromArray(input, intSmallestKth);
			System.out.println(OUTPUT_MESSAGE + output);

			System.out.println(ENTER_ARRAY_MESSAGE);
		}

	}

}
