package codingdojang.cd_0105_408;

import java.util.*;

/**
 * http://codingdojang.com/scode/408
 * ���� �Ի繮�� �߿���
 * 1������ ������ �־����� ��, �� �� ���� �Ÿ��� ª�� ���� ���� ����ϴ� �Լ��� �ۼ��Ͻÿ�. (�� ������ �迭�� ��� ���ĵǾ��ִٰ� �����Ѵ�.)
	������� S={1, 3, 4, 8, 13, 17, 20} �� �־����ٸ�, ������� (3, 4)�� �� ���̴�.
 * @author sjshin
 *
 */
public class CompareSort {
	public static String conmpareSort() {
		int s[] = {1, 3, 4, 8, 13, 17, 20};
		int count = s[s.length-1]; //�迭�� ����ū���� �ʱ�ȭ
		String result = "";
		
		for(int i = 0; i < s.length-1; i++) {
			int temp1 = s[i+1] - s[i]; 
			if (count > temp1) {
				count = temp1;
				result = String.valueOf("s["+i+"] "+s[i]+","+s[i+1]);
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		String result = conmpareSort();
		System.out.println(result);
	}
}
