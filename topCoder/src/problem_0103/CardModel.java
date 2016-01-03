package problem_0103;
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
	private String cardType;
	private String cardCode;
	private int prefix;
	private int cardLength;
	private long cardNumber;

	public long getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = Integer.parseInt(cardNumber);
		
		int cardLength = cardNumber.length();
		int prefix = Integer.parseInt(cardNumber.substring(0,1));
		
		setCardLength(cardLength);
		setPrefix(prefix);
		
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
