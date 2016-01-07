package creditCard_0103;

/**
 *1. ������� �Է°��� �޴´�
 *2. �Է¹��� �� "�ſ�ī�� ������ ��ȣ����" ���� Ȯ�� true, false �� ������ǰ� true �ΰ�� ��˰���ȣ��(1�� �����Ϸ�� ����)
 *3. "Luhn �˰���" ȣ�� (2������->�Ϸ��� true, false�� ��ȯ)
 * @author sjshin
 *
 */
public class CardValid {
	public Boolean userParam(CardModel cardParam) {
		System.out.println(cardParam);
		Boolean result = false;
		CardModel card = cardCheck(cardParam);  // �Ķ���͸� ������ � ī�� ���� ������ ��ȸ�ؼ�  ������ī���̸� ������ī�� ������ ��ȯ �Ѵ�.
		
		result = cardValidLength(cardParam, card, result);
		result = cardValidPrefix(cardParam, card, result);
		
		return result;
	}
	
	public CardModel cardCheck(CardModel cardParam) {
		CardCondition cardCondition = new CardCondition();
		CardModel card = new CardModel();
		
		switch (cardParam.getCardType()) {
		case CardCondition.cardTypeMasterCard: //"MasterCard"
			card = cardCondition.setMasterCard();  //card �𵨰�ü�� ��ȯ
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
		int startPrefix = card.getStartPrefix(); //������ ī���� startPrefix
		int endPredix = card.getEndPrefix();		//������ī��
		
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
