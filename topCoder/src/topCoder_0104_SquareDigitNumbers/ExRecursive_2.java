package topCoder_0104_SquareDigitNumbers;

public class ExRecursive_2 {
	public static int getNumber3(int n) {
		int result = 0;
		if(n < 4) {
			result = result + n; //String.valueOf(n/4)+String.valueOf(n%4)
			System.out.println("n : "+n);
		
		} else { //result = result + n%4; 4�γ��� ���� 4���� ũ�� �ٽ� n���� �ְ�  n=> 22>5>1 / 
			result = n%4 + getNumber3(n/4); //2 > 5%4=1 g(1) > n=1  >>1+
			//2 + (5) / 1 + (1) / if=1 ���� -> 1+ /1+1 / >2
			System.out.println("n%4 : " + String.valueOf(n%4)); //�������� ���ϰ�, ���� 4�̻��̸� �ٽ� �Լ�ȣ��
			System.out.println("n/4 : " + String.valueOf(n/4));
		}
		return result;
		//n�� 4�� ������ 4���� ũ���� �ڱ⸦ ȣ�� �ƴϸ�
	}
	
	
	public static void main(String[] args) {
		int s = getNumber3(10);
		System.out.println(String.valueOf(s));
	}
}
