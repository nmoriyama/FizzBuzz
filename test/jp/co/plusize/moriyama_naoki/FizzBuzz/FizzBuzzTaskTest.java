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
	public void 引数2の場合2を返すこと() throws Exception {
		assertEquals("2", FizzBuzzTask.FizzBuzz(2));
	}
	
	@Test
	public void 引数3の場合Fizzを返すこと() throws Exception {
		assertEquals("Fizz", FizzBuzzTask.FizzBuzz(3));
	}
	
	@Test
	public void 引数4の場合4を返すこと() throws Exception {
		assertEquals("4", FizzBuzzTask.FizzBuzz(4));
	}
	
	@Test
	public void 引数5の場合Buzzを返すこと() throws Exception {
		assertEquals("Buzz", FizzBuzzTask.FizzBuzz(5));
	}
	
	@Test
	public void 引数6の場合Fizzを返すこと() throws Exception {
		assertEquals("Fizz", FizzBuzzTask.FizzBuzz(6));
	}

	@Test
	public void 引数14の場合14を返すこと() throws Exception {
		assertEquals("14", FizzBuzzTask.FizzBuzz(14));
	}
	
	@Test
	public void 引数15の場合FizzBuzzを返すこと() throws Exception {
		assertEquals("FizzBuzz", FizzBuzzTask.FizzBuzz(15));
	}
	
	@Test
	public void 引数16の場合16を返すこと() throws Exception {
		assertEquals("16", FizzBuzzTask.FizzBuzz(16));
	}
}
