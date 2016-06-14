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
	public void 倍数が3の前の出力は正しいか() throws Exception {
		assertEquals("2", FizzBuzzTask.FizzBuzz(2));
	}
	
	@Test
	public void 倍数が3のためFizzが出力されるか() throws Exception {
		assertEquals("Fizz", FizzBuzzTask.FizzBuzz(3));
	}
	
	@Test
	public void 倍数が3の後及び5の前の出力は正しいか() throws Exception {
		assertEquals("4", FizzBuzzTask.FizzBuzz(4));
	}
	
	//5の倍数
	@Test
	public void 倍数が5のためBuzzが出力されるか() throws Exception {
		assertEquals("Buzz", FizzBuzzTask.FizzBuzz(5));
	}
	
	@Test
	public void 倍数が5の後の出力は正しいか() throws Exception {
		assertEquals("Fizz", FizzBuzzTask.FizzBuzz(6));
	}
	
	//3と5の倍数
	@Test
	public void 倍数が3と5の前の出力は正しいか() throws Exception {
		assertEquals("14", FizzBuzzTask.FizzBuzz(14));
	}
	
	@Test
	public void 倍数が3と5のためFizzBuzzが出力されるか() throws Exception {
		assertEquals("FizzBuzz", FizzBuzzTask.FizzBuzz(15));
	}
	
	@Test
	public void 倍数が3と5の後の出力は正しいか() throws Exception {
		assertEquals("16", FizzBuzzTask.FizzBuzz(16));
	}
}
