package problem_0103;
/**
 *1. ������� �Է°��� �޴´�
 *2. �Է¹��� �� "�ſ�ī�� ������ ��ȣ����" ���� Ȯ�� true, false �� ������ǰ� true �ΰ�� ��˰���ȣ��(1�� �����Ϸ�� ����)
 *3. "Luhn �˰���" ȣ�� (2������->�Ϸ��� true, false�� ��ȯ)
 * @author sjshin
 *
 */
public class CardValid {
	public Boolean userParam(CardModel card) {
		Boolean result = false;
		
		//�Ķ���� nullüũ /������ ���°��
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
		
		//if masterCard -> param prefix & prefix ��
		if ("MasterCard".equals(cardParam.getCardType())) {
			int paramPrefix = cardParam.getPrefix();
			System.out.println("cardParam.getCardLength()"+cardParam.getCardLength());
			//51 ~ 55 , 16 prefix ��
			for (int index = startPrefix; index <= endPredix; index++) {
				System.out.println("index"+index);
				System.out.println("paramPrefix"+paramPrefix);
				if(index == paramPrefix) {
					System.out.println("i+endPredix:"+index+paramPrefix);
					//ī����� ��
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
