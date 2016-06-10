
public class FizzBuzzTask {
	public static void main(String args[]) {
		for (int i = 1; i <= 100; i++) {
			String str = new String();
			str += Fizz(i);
			str += Buzz(i);
			str += FizzBuzz(i);
			str += Num(i);
			System.out.println(str);
		}
	}
	
	public static String Fizz(int i) {
		String str = new String();
		if (i % 3 == 0 && i % 5 !=0) {
			str = "Fizz";
		}
		return str;
	}
	
	public static String Buzz(int i) {
		String str = new String();
		if (i % 5 == 0 && i % 3 !=0) {
			str += "Buzz";
		}
		return str;
	}
	
	public static String FizzBuzz(int i) {
		String str = new String();
		if (i % 3 == 0 && i % 5 == 0) {
			str += "FizzBuzz";
		}
		return str;
	}
	
	public static String Num(int i) {
		String str = new String();
		if (i % 3 != 0 && i % 5 != 0) {
			str += i;
		}
		return str;
	}
}
