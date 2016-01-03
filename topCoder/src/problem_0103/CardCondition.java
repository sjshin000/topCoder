package problem_0103;

public class CardCondition {
	/**
	 * �� ī���� ���ǳ���
	 *  �ſ�ī�� ����		�ſ�ī�� �ڵ�	���λ�     					�ſ�ī�� ��ȣ ����
		MasterCard  	CA			51 ~ 55      			16
		Visa 			VI   		4      					13 or 16 
		AmericanExpress AX			34 or 37     			15 
		DinersClub      DC   		300 ~ 305 or 36 or 38   14 
		JCB  			JC   		3      					16 
		JCB  			JC   		2131 or 1800      		15 
		Discover   		DS   		6011  					16 
	 */
	
	public enum cardType {
		MasterCard,
		Visa,
		AmericanExpress,
		DinersClub,
		JCB,
		Discover
	}
	
	public enum cardCode {
		CA, VI, AX, DC, JC, DS
	}
	
}
