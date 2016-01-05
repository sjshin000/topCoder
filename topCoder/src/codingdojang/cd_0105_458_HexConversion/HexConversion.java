package codingdojang.cd_0105_458_HexConversion;
/**
 * 위 그림을 참조하여 라이브러리를 사용하지 말고 10진수를 n진수로 변환하는 프로그램을 작성하시오.. (단, n의 범위는 2 <= n <= 16)
	예)
	2진수로 변환 : 233 --> 11101001
	8진수로 변환 : 233 --> 351
	16진수로 변환 : 233 --> E9
 * @author sjshin
 *
 */
public class HexConversion {
	public static String convert(int index, int div) {
		String result = "";
		
		if (div < 10) {
			result = index/div == 0 ? result + String.valueOf(index%div) : String.valueOf(convert(index/div, div) + String.valueOf(index%div)); 
		} else if (index/div == 0) {
			result = result + String.valueOf(index%div); 
		} else { 
			String result1 = String.valueOf(convert(index/div, div)); 
			String result2 = String.valueOf(index%div);
			
			result = result1.replaceAll("14", "E") + result2.replaceAll("14", "E");
		}
			
		return result;
	}
	
	public static void main(String[] args) {
		String resutlt = convert(233, 16);
		System.out.println("result: " + resutlt);
	}
}
