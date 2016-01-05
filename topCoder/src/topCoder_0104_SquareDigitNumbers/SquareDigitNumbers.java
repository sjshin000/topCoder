package topCoder_0104_SquareDigitNumbers;

import problem_0103.main;

/**
 * ����Լ��� ����Ͽ� SquareDigitNumbers ���� �����ϰ� Ǯ��
 * @author sjshin
 *
 */
public class SquareDigitNumbers {
	public static int getNumber(int index, int div) {
		String result = "";

		result = (index < div) ? result+String.valueOf(index) : String.valueOf(getNumber(index/div, div))+String.valueOf(index%div); 
				
		return Integer.parseInt(result.replaceAll("2", "4").replaceAll("3", "9"));
	}
	
	public static void main(String[] args) {	
		int n = getNumber(100, 4);
		System.out.println(n);
	}
}

