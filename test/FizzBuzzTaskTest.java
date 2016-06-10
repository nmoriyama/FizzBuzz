import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 
 */

/**
 * @author trainee156
 *
 */
public class FizzBuzzTaskTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void Fizz() {
		System.out.println("Fizzメソッド(3の倍数の場合実行)");
		for (int i = 3; i <= 100;i ++) {
			if (i % 3 == 0 && i % 5 !=0) {
				System.out.println(i);
				assertEquals("Fizz", FizzBuzzTask.Fizz(i));
			}
		}
	}
	
	@Test
	public void Buzz() {
		System.out.println("Buzzメソッド(5の倍数の場合実行)");
		for (int i = 3; i <= 100;i ++) {
			if (i % 3 != 0 && i % 5 ==0) {
				System.out.println(i);
				assertEquals("Buzz", FizzBuzzTask.Buzz(i));
			}
		}
	}
	
	@Test
	public void FizzBuzz() {
		System.out.println("FizzBuzzメソッド(3,5の倍数の場合実行)");
		for (int i = 3; i <= 100;i ++) {
			if (i % 3 == 0 && i % 5 ==0) {
				System.out.println(i);
				assertEquals("FizzBuzz", FizzBuzzTask.FizzBuzz(i));
			}
		}
	}
	
	@Test
	public void Num() {
		System.out.println("Numメソッド(3,5の倍数でない場合実行)");
		for (int i = 1; i <= 100;i ++) {
			if (i % 3 != 0 && i % 5 !=0) {
				System.out.println(i);
				String str = String.valueOf(i);
				assertEquals(str, FizzBuzzTask.Num(i));
			}
		}
	}
}
