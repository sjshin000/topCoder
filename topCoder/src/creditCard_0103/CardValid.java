package creditCard_0103;

/**
 *1. 사용자의 입력값을 받는다
 *2. 입력받은 값 "신용카드 종류별 번호제약" 조건 확인 true, false 만 받으면되고 true 인경우 룬알고리즘호출(1차 검증완료로 가정)
 *3. "Luhn 알고리즘" 호출 (2차검증->완료후 true, false를 반환)
 * @author sjshin
 *
 */
public class CardValid {
	public Boolean userParam(CardModel cardParam) {
		System.out.println(cardParam);
		Boolean result = false;
		CardModel card = cardCheck(cardParam);  // 파라미터를 가지고 어떤 카드 인지 정보를 조회해서  마스터카드이면 마스터카드 정보를 반환 한다.
		
		result = cardValidLength(cardParam, card, result);
		result = cardValidPrefix(cardParam, card, result);
		
		return result;
	}
	
	public CardModel cardCheck(CardModel cardParam) {
		CardCondition cardCondition = new CardCondition();
		CardModel card = new CardModel();
		
		switch (cardParam.getCardType()) {
		case CardCondition.cardTypeMasterCard: //"MasterCard"
			card = cardCondition.setMasterCard();  //card 모델객체를 반환
			break;
		default:
			break;
		}
		return card;
	}
	
	public Boolean cardValidLength(CardModel cardParam, CardModel card, Boolean result) {
		if(card.getCardLength() == cardParam.getCardLength()) {
			result = true;
		} else {
			result = false;
		}
			System.out.println("cardValidLength :" +result);
		return result;
	}
	
	public Boolean cardValidPrefix(CardModel cardParam, CardModel card, Boolean result) {
		int startPrefix = card.getStartPrefix(); //마스터 카드의 startPrefix
		int endPredix = card.getEndPrefix();		//마스터카드
		
		Long paramCardNumber = cardParam.getCardNumber();
		String pranmCardNum = paramCardNumber.toString();
		int paramPrefix = Integer.parseInt(pranmCardNum.substring(0,2));
		
		switch (card.getCardType()) {
		case CardCondition.cardTypeMasterCard : 

			for (int index = startPrefix; index <= endPredix; index++) {
				if(index == paramPrefix) {
					result = true;
				} else {
					result = false;
				}
			}
			break;
		default:
			break;
		}
		
		System.out.println("cardValidation :" +result);
		return result;
	}
}
