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
	
	@Test
	public void 引数2の時出力は正しいか() throws Exception {
		assertEquals("2", FizzBuzzTask.FizzBuzz(2));
	}
	
	@Test
	public void 引数3の時Fizzが出力されるか() throws Exception {
		assertEquals("Fizz", FizzBuzzTask.FizzBuzz(3));
	}
	
	@Test
	public void 引数4の時出力は正しいか() throws Exception {
		assertEquals("4", FizzBuzzTask.FizzBuzz(4));
	}
	
	@Test
	public void 引数5の時Buzzが出力されるか() throws Exception {
		assertEquals("Buzz", FizzBuzzTask.FizzBuzz(5));
	}
	
	@Test
	public void 引数6の時出力は正しいか() throws Exception {
		assertEquals("Fizz", FizzBuzzTask.FizzBuzz(6));
	}

	@Test
	public void 引数14の時出力は正しいか() throws Exception {
		assertEquals("14", FizzBuzzTask.FizzBuzz(14));
	}
	
	@Test
	public void 引数15の時FizzBuzzが出力されるか() throws Exception {
		assertEquals("FizzBuzz", FizzBuzzTask.FizzBuzz(15));
	}
	
	@Test
	public void 引数16の時出力は正しいか() throws Exception {
		assertEquals("16", FizzBuzzTask.FizzBuzz(16));
	}
}
