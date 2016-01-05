package topCoder_0104_SquareDigitNumbers;

import problem_0103.main;

/**
 * ����Լ��� ����Ͽ� SquareDigitNumbers ���� �����ϰ� Ǯ��
 * @author sjshin
 *
 */
public class SquareDigitNumbers {
	public static String getNumber(String inputIndex) {
		String result = "";
		int index = Integer.parseInt(inputIndex);
		int div = 4;
		if(index < div) {
			result = result+String.valueOf(index); 
		} else {
			result = String.valueOf(getNumber(String.valueOf(index/div)))+String.valueOf(index%div); 
		}
		return result.replaceAll("2", "4").replaceAll("3", "9");
	}
	
	public static void main(String[] args) {	
		String n = getNumber("100");
		System.out.println(n);
	}
}


