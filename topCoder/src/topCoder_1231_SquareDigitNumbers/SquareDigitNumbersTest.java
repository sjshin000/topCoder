package topCoder_1231_SquareDigitNumbers;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * 0 -> Returns: 0
 * 5 -> Returns: 11
 * 16 -> Returns: 100
 * 121 ->Returns: 1941
 * 123 -> Returns: 1949
 * @author sjshin
 *
 */
public class SquareDigitNumbersTest {
	SquareDigitNumbers number = new SquareDigitNumbers();

	@Test
	public void test01() {
		int result = number.getNumber(0);
		System.out.println("result = "+result);
		assertEquals(result, 0);
	}

	@Test
	public void test02() {
		int result = number.getNumber(5);
		System.out.println("result = "+result);
		assertEquals(result, 11);
	}
	
	@Test
	public void test03() {
		int result = number.getNumber(16);
		System.out.println("result = "+result);
		assertEquals(result, 100);
	}
	
	@Test
	public void test04() {
		int result = number.getNumber(121);
		System.out.println("result = "+result);
		assertEquals(result, 1941);
	}
	
	@Test
	public void test05() {
		int result = number.getNumber(123);
		System.out.println("result = "+result);
		assertEquals(result, 1949);
	}
}
