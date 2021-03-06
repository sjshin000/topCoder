package creditCard_0103;

/**
 * 1.     문제. 
당신은 티몬의 신용카드 결제 개발을 담당하게 되었습니다. 
고객이 입력한 신용카드 번호는 최종적으로 신용카드 회사의 API를 이용해 유효성을 검증합니다.
하지만 사용자의 입력을 검증없이 전부 외부 API에 전달할 경우 과부하를 발생시킬 수 있습니다.
  이에 카드번호 생성 규칙을 이용하여 유효하다고 판단한 신용카드 번호에 한해 외부 API를 호출하고자 합니다. 
당신의 업무는 "카드번호 생성 규칙을 이용하여 신용카드번호의 유효성을 검사하는 기능 개발"입니다.
현재 지원하는 카드의 종류는 "신용카드 종류별 번호제약" 절에 나온 6종류이나 향후 제휴가 확대되면 수 십개의 신용카드 회사가 추가될 수 있으므로 
확장성과 유지보수성에 주의를 기울여야힙니다.
 "신용카드 종류별 번호제약"과 "Luhn 알고리즘"을 이용하여 카드의 유효성을 검증하는 클래스

 신용카드 종류		신용카드 코드	접두사     					신용카드 번호 길이
MasterCard  	CA			51 ~ 55      			16
Visa 			VI   		4      					13 or 16 
AmericanExpress AX			34 or 37     			15 
DinersClub      DC   		300 ~ 305 or 36 or 38   14 
JCB  			JC   		3      					16 
JCB  			JC   		2131 or 1800      		15 
Discover   		DS   		6011  					16 

====>문제풀이 16.01.03  /고객입력값 받기-> "신용카드 종류별 번호제약" 조건 확인 -> "Luhn 알고리즘" 호출


 */

public class test {

}
