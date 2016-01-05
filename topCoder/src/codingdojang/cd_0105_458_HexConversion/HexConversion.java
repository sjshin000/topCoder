package codingdojang.cd_0105_458_HexConversion;
/**
 * �� �׸��� �����Ͽ� ���̺귯���� ������� ���� 10������ n������ ��ȯ�ϴ� ���α׷��� �ۼ��Ͻÿ�.. (��, n�� ������ 2 <= n <= 16)
	��)
	2������ ��ȯ : 233 --> 11101001
	8������ ��ȯ : 233 --> 351
	16������ ��ȯ : 233 --> E9
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
