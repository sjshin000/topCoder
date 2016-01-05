package codingdojang.cd_0105_408;
/**
 * http://codingdojang.com/scode/408
 * ���� �Ի繮�� �߿���
 * 1������ ������ �־����� ��, �� �� ���� �Ÿ��� ª�� ���� ���� ����ϴ� �Լ��� �ۼ��Ͻÿ�. (�� ������ �迭�� ��� ���ĵǾ��ִٰ� �����Ѵ�.)
	������� S={1, 3, 4, 8, 13, 17, 20} �� �־����ٸ�, ������� (3, 4)�� �� ���̴�.
 * @author sjshin
 *
 */
public class CompareSort {
	public static void main(String[] args) {
		int s[] = {1, 3, 4, 8, 13, 17, 20};
		int result = 10;
		
		for(int i = 0; i < s.length-2; i++) {
			int firTemp = s[i+1] - s[i];   // 1��°�� 0��° �� > 2��1��
			int sendTemp = s[i+2] - s[i+1];

			if (result < firTemp) {
				result = result;
			} else {
				result = firTemp;
			}
			System.out.println(result);
		}
	}
}
