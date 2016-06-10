public class FizzBuzzTask {
	public static void main(String args[]) {
		for (int i = 1; i <= 100; i++) {
			String str = "";
			str += FizzBuzz(i);
			System.out.println(str);
		}
	}
	
	public static String FizzBuzz(int i) {
		String str = new String();
		if (i % 3 == 0 && i % 5 == 0) {
			str += "FizzBuzz";
		} else if (i % 3 ==0) {
			str = "Fizz";
		} else if (i % 5 ==0) {
			str += "Buzz";
		} else {
			str += i;
		}
		return str;
	}
	
}
