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
 * * ����Լ���?
 * ���ȣ���� ��뿹�� ���丮���̳� ����, Ʈ���� ���� �ڷᱸ��, ������ ���ϸ���� ǥ���ϴµ� ���˴ϴ�.
	���丮���� �� ������ 1�� �� ������ 1�� ���ҽ��Ѱ��鼭 ���س����� ���ε���.
	5���丮���� 5 * 4 * 3 * 2 * 1�� �˴ϴ�.
	
	�Լ��� ǥ���ϸ�... f(n)�� n * f(n-1) �� �˴ϴ�. 
	�� �Լ��� �޼���� ǥ���ϸ� �����ʰ� ���� �ڵ尡 �˴ϴ�.
	
	�ϳ��� ������ �Ű������� �Է¹޾Ƽ� n�� 1�� ���� 1�� ��ȯ�ϰ�,
	1�� �ƴ� ���� �޼��� �ڱ��ڽ��� �ٽ� ȣ���մϴ�.
	
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