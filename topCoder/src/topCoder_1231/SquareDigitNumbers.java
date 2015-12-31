package topCoder_1231;

/**
 * 
 * @author sjshin
 * You enjoy working with numbers that contain only square digits (namely, 0, 1, 4 and 9). 
 * The sequence containing only these digits is 0, 1, 4, 9, 10, 11, 14... 
 * Return the n-th term (indexed from 0) in this sequence. 
 * 
 * 리턴은 0,1,4,9,10,11,14...값만 가능.. 입력받은 n의 값은 index
 * n 을 4로 나누었을때, 나머지는 뒤에서0번째자리(0,1,2,3), 몫이 4보다 크면 4와 또 나누기해서 나머지는 뒤에서1번째자리 몫은 뒤에서2번째자리
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
		
		int x = n; //몫 4이상이면 자리수올라감
		int y = x%4; //나머지 switch문 수행해야함.
		result = numberSet(y, result);
		
		while (x >= 4) { // 3이하일때 
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
