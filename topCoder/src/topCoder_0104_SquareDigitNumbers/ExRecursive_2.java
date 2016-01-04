package topCoder_0104_SquareDigitNumbers;

public class ExRecursive_2 {
	public static int getNumber3(int n) {
		int result = 0;
		if(n < 4) {
			result = result + n; //String.valueOf(n/4)+String.valueOf(n%4)
			System.out.println("n : "+n);
		
		} else { //result = result + n%4; 4로나운 몫이 4보다 크면 다시 n값을 넣고  n=> 22>5>1 / 
			result = n%4 + getNumber3(n/4); //2 > 5%4=1 g(1) > n=1  >>1+
			//2 + (5) / 1 + (1) / if=1 종료 -> 1+ /1+1 / >2
			System.out.println("n%4 : " + String.valueOf(n%4)); //나머지는 더하고, 몫이 4이상이면 다시 함수호출
			System.out.println("n/4 : " + String.valueOf(n/4));
		}
		return result;
		//n을 4로 나눠서 4보다 크면은 자기를 호출 아니면
	}
	
	
	public static void main(String[] args) {
		int s = getNumber3(10);
		System.out.println(String.valueOf(s));
	}
}
