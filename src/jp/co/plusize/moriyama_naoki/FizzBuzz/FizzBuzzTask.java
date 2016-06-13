package jp.co.plusize.moriyama_naoki.FizzBuzz;
public class FizzBuzzTask {
	public static void main(String args[]) {
		for (int i = 1; i <= 100; i++) {
			String str = new String();
			str = FizzBuzz(i);
			System.out.println(str);
		}
	}
	
	public static String FizzBuzz(int i) {
		String str = new String();
		if (i >= 1 && i <= 100) {
			if (i % 3 == 0 && i % 5 == 0) {
				str = "FizzBuzz";
			} 
			if (i % 3 == 0 && i % 5 != 0) {
				str = "Fizz";
			}
			if (i % 3 != 0 && i % 5 == 0) {
				str = "Buzz";
			} 
			if (i % 3 != 0 && i % 5 != 0) {
				str = String.valueOf(i);
			}
		}
		return str;
	}
	
}
