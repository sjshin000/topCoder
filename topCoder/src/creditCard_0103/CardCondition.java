package creditCard_0103;

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
	

	
//	public CardModel cardCheck(CardModel cardParam) {
//		switch (cardParam.getCardType()) {
//		case "MasterCard":
//			MasterCard.setMasterCard();
//			break;
//		default:
//			break;
//		}
//		return cardParam;
//	}
	
	
	final static String cardTypeMasterCard = "MasterCard";
	final static String cardCodeMasterCard = "CA";
	final static int startPrefixMasterCard = 51;
	final static int endPrefixMasterCard = 55;
	final static int cardLengthMasterCard = 16;
	
	public CardModel setMasterCard() {
		CardModel card = new CardModel();
		card.setCardType(cardTypeMasterCard);
		card.setCardCode(cardCodeMasterCard);
		card.setStartPrefix(startPrefixMasterCard);
		card.setEndPrefix(endPrefixMasterCard);
		card.setCardLength(cardLengthMasterCard);
		return card;
	}
}
