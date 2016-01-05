package topCoder_0104_SquareDigitNumbers;

import problem_0103.main;

/**
 * 재귀함수를 사용하여 SquareDigitNumbers 문제 동일하게 풀기
 * @author sjshin
 *
 */
public class SquareDigitNumbers {
	public static String getNumber(String s) {
		String result = "";
		int n = Integer.parseInt(s);
		if(n < 4) {
			result = result+String.valueOf(n); 
		} else {
			result = String.valueOf(getNumber(String.valueOf(n/4)))+String.valueOf(n%4); 
//			result = String.valueOf(n%4) + String.valueOf(getNumber(String.valueOf(n/4))); 
//			System.out.println("n%4 : " + String.valueOf(n%4));
//			System.out.println("n/4 : " + String.valueOf(n/4));
		}
		
		//입력값 100일때 현재 0121임 -> 1210으로 뒤집기 해야함 -> 2,3번 replaceAll
		
		
//		for(int i = result4.length()-1; i >-1; i--) {
//			result4 += result4.charAt(i);
//		}
		String result2 = result.replaceAll("2", "4");
		String result3 = result2.replaceAll("3", "9");
		
		return result3;
	}
	
	public static void main(String[] args) {	
		String n = getNumber("100");
		System.out.println(n);
	}
}


