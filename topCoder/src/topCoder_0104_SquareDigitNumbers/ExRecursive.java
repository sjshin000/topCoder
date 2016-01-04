package topCoder_0104_SquareDigitNumbers;

public class ExRecursive {
	public static int getNumber(int n) {
		int result = 0;
		
		if(n == 1) {
			result = 1;
		} else {
			result = n * getNumber(n-1);  // n=4 > getNumber(4-1)=3 > n=3 > 3-1=2 > n=2 > 2-1=1 > n=1
											//n=1 2*1  3*2  4*6  -> 5*(4*6) 6*(5*(4*6)) 7*(6*5*4*6)
		}
		return result;
	}
	
	public static void main(String[] args) {
		int nm = getNumber(7);
		System.out.println("nm : "+nm);
		System.out.println("5:"+5*(4*6));
		System.out.println("6:"+6*(5*(4*6)));
		System.out.println("7:"+7*(6*5*4*6));
	}
}
/**
 * * 재귀함수란?
 * 재귀호출의 사용예는 팩토리얼이나 제곱, 트리와 같은 자료구조, 폴더의 파일목록을 표시하는데 사용됩니다.
	팩토리얼은 한 정수를 1이 될 때까지 1씩 감소시켜가면서 곱해나가는 것인데요.
	5팩토리얼은 5 * 4 * 3 * 2 * 1이 됩니다.
	
	함수로 표현하면... f(n)은 n * f(n-1) 이 됩니다. 
	이 함수를 메서드로 표현하면 오른쪽과 같은 코드가 됩니다.
	
	하나의 정수를 매개변수로 입력받아서 n이 1일 때는 1을 반환하고,
	1이 아닐 때는 메서드 자기자신을 다시 호출합니다.
	
	long factorial(int n) {
	long result = 0;
	if(n==1) {
		result = 1;
	} else {
		result = n * factorial(n-1);
	}
	return result;
}


 */