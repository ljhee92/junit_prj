package kr.co.sist.day0320;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Lotto {
	
	public List<Integer> createLotto(int money){
		List<Integer> listLotto = new ArrayList<Integer>();
		
		if(!isValidMoney(money)) {
			throw new RuntimeException("로또의 기본 금액은 1000원입니다.");
		} // end if
		
		listLotto = generate();
		
		return listLotto;
	} // createLotto
	
	public boolean isValidMoney(int money) {
		return money == 1000;
	} // isValidMoney
	
	private List<Integer> generate(){
		return new Random().ints(1, 46).distinct().limit(6).boxed().sorted().collect(Collectors.toList());
//		return new Random().ints(1, 46).distinct().limit(6).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList()); // 내림차순
	} // generate

//	public static void main(String[] args) {
//		Lotto lotto = new Lotto();
//		System.out.println(lotto.createLotto(1000));
//	} // main

} // class