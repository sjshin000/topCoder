package topCoder_1231;

/**
 * 
 * @author sjshin
 * You enjoy working with numbers that contain only square digits (namely, 0, 1, 4 and 9). 
 * The sequence containing only these digits is 0, 1, 4, 9, 10, 11, 14... 
 * Return the n-th term (indexed from 0) in this sequence. 
 * 
 * ������ 0,1,4,9,10,11,14...���� ����.. �Է¹��� n�� ���� index
 * n �� 4�� ����������, �������� �ڿ���0��°�ڸ�(0,1,2,3), ���� 4���� ũ�� 4�� �� �������ؼ� �������� �ڿ���1��°�ڸ� ���� �ڿ���2��°�ڸ�
 * 
 * Definition 
	Class: SquareDigitNumbers 
	Method: getNumber 
	Parameters: int 
	Returns: int 
	Method signature: int getNumber(int n) 
	(be sure your method is public)
	
 * 0 -> Returns: 0
 * 5 -> Returns: 11
 * 16 -> Returns: 100
 * 121 ->Returns: 1941
 * 123 -> Returns: 1949
 * 
 */
public class SquareDigitNumbers {
	public int getNumber(int n) {
		String result = "";
		
		int x = n; //�� 4�̻��̸� �ڸ����ö�
		int y = x%4; //������ switch�� �����ؾ���.
		result = numberSet(y, result);
		
		while (x >= 4) { // 3�����϶� 
			x = x/4;
			y = x%4;
			result = numberSet(y, result);
		} 
		return Integer.parseInt(result);
		
	}
	
	public String numberSet(int y, String result) {
		switch (y) {
			case 0 :
				result = 0+result;
				break;
			case 1 : 
				result = 1+result;
				break;
			case 2 :
				result = 4+result;
				break;
			case 3 :
				result = 9+result;
				break;
		}
		return result;
	}
}
