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
	public void 仕様通りに始まるか() throws Exception {
		assertEquals("", FizzBuzzTask.FizzBuzz(0));
	}
	
	@Test
	public void 仕様通りに始まっているか() throws Exception {
		assertEquals("1", FizzBuzzTask.FizzBuzz(1));
	}
	
	@Test
	public void 仕様通りに終わるか() throws Exception {
		assertEquals("Buzz", FizzBuzzTask.FizzBuzz(100));
	}
	
	@Test
	public void 仕様通りに終わっているか() throws Exception {
		assertEquals("", FizzBuzzTask.FizzBuzz(101));
	}
	
	@Test
	public void 数が出力されるか() throws Exception {
		assertEquals("2", FizzBuzzTask.FizzBuzz(2));
	}
	
	@Test
	public void Fizzが出力されるか() throws Exception {
		assertEquals("Fizz", FizzBuzzTask.FizzBuzz(33));
	}
	
	@Test
	public void Buzzが出力されるか() throws Exception {
		assertEquals("Buzz", FizzBuzzTask.FizzBuzz(55));
	}
	
	@Test
	public void FizzBuzzが出力されるか() throws Exception {
		assertEquals("FizzBuzz", FizzBuzzTask.FizzBuzz(75));
	}
}
