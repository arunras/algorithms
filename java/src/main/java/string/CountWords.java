package string;

public class CountWords {
	public static void count(String str) {
		String[] words = str.trim().split(" ");
		System.out.println("Number of words = " + words.length);
	}
}
