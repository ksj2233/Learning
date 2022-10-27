package assignment07;

import java.text.MessageFormat;

public class MessageFormatTest {
//	<문제>
//	실행 결과를 보고 다음 프로그램을 완성하라.
//	
//	<출력>
//	이름 : 세종대왕	번호 : 1 	국적 : 조선
//	이름 : 오바마		번호 : 2		국적 : 미국
//	이름 : 징기스칸	번호	: 3		국적 : 몽고
	
	public static void main(String[] args) {
		Object[][] data = {{"세종대왕",1,"조선"},{"오바마",2,"미국"},{"징기스칸",3,"몽고"}};
		
	        for (Object[] k : data) {
	            System.out.println(MessageFormat.format("이름 : {0}\t번호 : {1}\t국적 : {2}", k));
	            
	        	}

	}
}