package jp.co.plusize.moriyama_naoki.FizzBuzz;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FizzBuzzTaskTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	//3の倍数
	@Test
	public void 境界値分析で3の倍数の前でFizzが出力されないか() throws Exception {
		assertNotSame("Fizz", FizzBuzzTask.FizzBuzz(2));
	}
	
	@Test
	public void 境界値分析で3の倍数のためFizzが出力されるか() throws Exception {
		assertSame("Fizz", FizzBuzzTask.FizzBuzz(3));
	}
	
	@Test
	public void 境界値分析で3の倍数の後でFizzが出力されないか() throws Exception {
		assertNotSame("Fizz", FizzBuzzTask.FizzBuzz(4));
	}
	
	//5の倍数
	@Test
	public void 境界値分析で5の倍数の前でBuzzが出力されないか() throws Exception {
		assertNotSame("Buzz", FizzBuzzTask.FizzBuzz(4));
	}
	
	@Test
	public void 境界値分析で5の倍数のためBuzzが出力されるか() throws Exception {
		assertSame("Buzz", FizzBuzzTask.FizzBuzz(5));
	}
	
	@Test
	public void 境界値分析で5の倍数の後でBuzzが出力されないか() throws Exception {
		assertNotSame("Buzz", FizzBuzzTask.FizzBuzz(6));
	}
	
	//3,5の倍数
	@Test
	public void 境界値分析で3と5の倍数の前でFizzBuzzが出力されないか() throws Exception {
		assertNotSame("FizzBuzz", FizzBuzzTask.FizzBuzz(14));
	}
	
	@Test
	public void 境界値分析で3と5の倍数のためFizzBuzzが出力されるか() throws Exception {
		assertSame("FizzBuzz", FizzBuzzTask.FizzBuzz(15));
	}
	
	@Test
	public void 境界値分析で3と5の倍数の後でFizzBuzzが出力されないか() throws Exception {
		assertNotSame("FizzBuzz", FizzBuzzTask.FizzBuzz(16));
	}
}
