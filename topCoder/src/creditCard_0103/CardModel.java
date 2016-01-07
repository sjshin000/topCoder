package creditCard_0103;
/** 카드객체 모델
 * 
 *  신용카드 종류		신용카드 코드	접두사     					신용카드 번호 길이
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
	private String cardType;	//신용카드 종류
	private String cardCode;	//신용카드 코드
	
	private int prefix;			//접두사	
	private int startPrefix;	//접두사 시작
	private int endPrefix;		//접두사 종료
	
	private int cardLength;		//신용카드 번호 길이
	private long cardNumber;	//신용카드 번호

	
	
	
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
		setCardLength(cardLength);  //카드 length는 공통이라 여기서 set
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
