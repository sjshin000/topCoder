package codingdojang.cd_0105_408;
/**
 * http://codingdojang.com/scode/408
 * 다음 입사문제 중에서
 * 1차원의 점들이 주어졌을 때, 그 중 가장 거리가 짧은 것의 쌍을 출력하는 함수를 작성하시오. (단 점들의 배열은 모두 정렬되어있다고 가정한다.)
	예를들어 S={1, 3, 4, 8, 13, 17, 20} 이 주어졌다면, 결과값은 (3, 4)가 될 것이다.
 * @author sjshin
 *
 */
public class CompareSort {
	public static void main(String[] args) {
		int s[] = {1, 3, 4, 8, 13, 17, 20};
		int result = 10;
		
		for(int i = 0; i < s.length-2; i++) {
			int firTemp = s[i+1] - s[i];   // 1번째와 0번째 비교 > 2와1비교
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
