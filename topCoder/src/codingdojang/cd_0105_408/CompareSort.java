package codingdojang.cd_0105_408;

import java.util.*;

/**
 * http://codingdojang.com/scode/408
 * 다음 입사문제 중에서
 * 1차원의 점들이 주어졌을 때, 그 중 가장 거리가 짧은 것의 쌍을 출력하는 함수를 작성하시오. (단 점들의 배열은 모두 정렬되어있다고 가정한다.)
	예를들어 S={1, 3, 4, 8, 13, 17, 20} 이 주어졌다면, 결과값은 (3, 4)가 될 것이다.
 * @author sjshin
 *
 */
public class CompareSort {
	public static String conmpareSort() {
		int s[] = {1, 3, 4, 8, 13, 17, 20};
		int count = s[s.length-1]; //배열의 가장큰수로 초기화
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
