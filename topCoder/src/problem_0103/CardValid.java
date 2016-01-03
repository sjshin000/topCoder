package problem_0103;
/**
 *1. 사용자의 입력값을 받는다
 *2. 입력받은 값 "신용카드 종류별 번호제약" 조건 확인 true, false 만 받으면되고 true 인경우 룬알고리즘호출(1차 검증완료로 가정)
 *3. "Luhn 알고리즘" 호출 (2차검증->완료후 true, false를 반환)
 * @author sjshin
 *
 */
public class CardValid {
	public Boolean userParam(CardModel card) {
		Boolean result = false;
		
		//파라미터 null체크 /조건이 없는경우
		if ("".equals(card.getCardType()) || card.getCardType().equals(null)) { 
			//"Condition".equals(resultOrderView.getDeliveryPolicy())
			//null == card.getCardNumber()
			result = false;
		} else {
			cardValidation(card, result);
		}
		return result;
	}
	
	public Boolean cardValidation(CardModel cardParam, Boolean result) {
		int startPrefix = 51; //startPrefix
		int endPredix = 55;
		int cardLength = 16;
		
		//if masterCard -> param prefix & prefix 비교
		if ("MasterCard".equals(cardParam.getCardType())) {
			int paramPrefix = cardParam.getPrefix();
			System.out.println("cardParam.getCardLength()"+cardParam.getCardLength());
			//51 ~ 55 , 16 prefix 비교
			for (int index = startPrefix; index <= endPredix; index++) {
				System.out.println("index"+index);
				System.out.println("paramPrefix"+paramPrefix);
				if(index == paramPrefix) {
					System.out.println("i+endPredix:"+index+paramPrefix);
					//카드길이 비교
					if(16 == cardParam.getCardLength())
						result = true;
					break;
				} else {
					result = false;
				}
			}
		}
		return result;
	}
}
