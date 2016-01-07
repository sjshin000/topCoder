package creditCard_0103;
/** ī�尴ü ��
 * 
 *  �ſ�ī�� ����		�ſ�ī�� �ڵ�	���λ�     					�ſ�ī�� ��ȣ ����
	MasterCard  	CA			51 ~ 55      			16
	Visa 			VI   		4      					13 or 16 
	AmericanExpress AX			34 or 37     			15 
	DinersClub      DC   		300 ~ 305 or 36 or 38   14 
	JCB  			JC   		3      					16 
	JCB  			JC   		2131 or 1800      		15 
	Discover   		DS   		6011  					16 
 * @author sjshin
 *
 */
public class CardModel {
	private String cardType;	//�ſ�ī�� ����
	private String cardCode;	//�ſ�ī�� �ڵ�
	
	private int prefix;			//���λ�	
	private int startPrefix;	//���λ� ����
	private int endPrefix;		//���λ� ����
	
	private int cardLength;		//�ſ�ī�� ��ȣ ����
	private long cardNumber;	//�ſ�ī�� ��ȣ

	
	
	
	public int getStartPrefix() {
		return startPrefix;
	}

	public void setStartPrefix(int startPrefix) {
		this.startPrefix = startPrefix;
	}

	public int getEndPrefix() {
		return endPrefix;
	}

	public void setEndPrefix(int endPrefix) {
		this.endPrefix = endPrefix;
	}

	public long getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = Long.parseLong(cardNumber);
		
		int cardLength = cardNumber.length();
		setCardLength(cardLength);  //ī�� length�� �����̶� ���⼭ set
	}
	
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public String getCardCode() {
		return cardCode;
	}
	public void setCardCode(String cardCode) {
		this.cardCode = cardCode;
	}
	public int getPrefix() {
		return prefix;
	}
	public void setPrefix(int prefix) {
		this.prefix = prefix;
	}
	public int getCardLength() {
		return cardLength;
	}
	public void setCardLength(int cardLength) {
		this.cardLength = cardLength;
	}
	
}
