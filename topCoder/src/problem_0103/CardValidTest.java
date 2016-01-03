package problem_0103;

import static org.junit.Assert.*;

import org.junit.Test;

public class CardValidTest {

	@Test
	public void test() {
		String cardType = "MasterCard";
		String cardNumber = "123456789012345";
		
		CardModel card = new CardModel();
		card.setCardType(cardType);
		card.setCardNumber(cardNumber);
		
		CardValid cardValid = new CardValid();
		Boolean result = cardValid.userParam(card);
		
		System.out.println("1.result : "+result);
		
	}

}
