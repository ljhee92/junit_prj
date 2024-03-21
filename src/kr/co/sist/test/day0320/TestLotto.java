package kr.co.sist.test.day0320;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import kr.co.sist.day0320.Lotto;

class TestLotto {

	@DisplayName("로또 번호 테스트")
	@Test
	void testCreateLotto() {
		// given
		Lotto lotto = new Lotto();
		int money = 1000;
		int money2 = 2000;
		
		// when
		List<Integer> list = lotto.createLotto(money);
		assertDoesNotThrow(() -> lotto.createLotto(money)); // 예외가 발생하지 않은지 확인
		
		// then
		assertEquals(list.size(), 6);
		assertThrows(RuntimeException.class, () -> {lotto.createLotto(money2);});
	} // testCreateLotto

//	@Disabled
	@DisplayName("금액 유효 테스트")
	@Test
	void testIsValidMoney() {
		// given
		Lotto lotto = new Lotto();
		int money = 1000; // 다른 금액으로 변경
		
		// when
		boolean flag = lotto.isValidMoney(money);
		
		// then
		assertTrue(flag);
	} // testIsValidMoney

} // class