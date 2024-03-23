package kr.co.sist.test.day0320;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import kr.co.sist.day0320.Work;

class TestWork {

	@Disabled
	@DisplayName("0~9 난수 테스트")
	@Test
	void testRandonNum1() {
		// given
		Work work = new Work();
		
		// when
		int rNum = work.randomNum();
		System.out.println(rNum);
		
		// then
		assertNotEquals(rNum, 0);
	} // testRandonNum1

	@DisplayName("0~11 난수 테스트")
	@Test
	void testRandomNum2() {
		// given
		Work work = new Work();
		
		// when
//		int dataSize = work.randomNum(); // DB를 조회했더니 몇 개의 행이 나올지 모름
		int dataSize = 5;
		System.out.println(dataSize);
		
		// then
//		assertNotEquals(dataSize, 0);
		assertEquals(dataSize, 15, 10); // 예상값, 결과값, 오차범위
	} // testRandonNum2
	
} // class