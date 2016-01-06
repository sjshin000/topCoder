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
		
		result = cardValidation(cardParam, card, result);
		
		return result;
	}
	
	public CardModel cardCheck(CardModel cardParam) {
		CardCondition cardCondition = new CardCondition();
		CardModel card = new CardModel();
		
		switch (cardParam.getCardType()) {
		case "MasterCard":
			card = cardCondition.setMasterCard();  //card �𵨰�ü�� ��ȯ
			break;
		default:
			break;
		}
		return card;
	}
	
	public Boolean cardValidation(CardModel cardParam, CardModel card, Boolean result) {
		int startPrefix = card.getStartPrefix(); //������ ī���� startPrefix
		int endPredix = card.getEndPrefix();		//������ī��
		int cardLength = card.getCardLength();		//������ī��
		
		int paramPrefix = cardParam.getPrefix();
		
		if (card.getStartPrefix() >= 1 ) {  //null �� �ƴҶ��� �����ؾ� ��?
			
			System.out.println("cardParam.getCardLength() : "+cardParam.getCardLength());
			
			//51 ~ 55 , 16 prefix ��
			for (int index = startPrefix; index <= endPredix; index++) {
				System.out.println("index"+index);
				System.out.println("paramPrefix : "+paramPrefix);
				if(index == paramPrefix) {
					System.out.println("i+endPredix: "+index+paramPrefix);
					//ī����� ��
					if(cardLength == cardParam.getCardLength())
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
