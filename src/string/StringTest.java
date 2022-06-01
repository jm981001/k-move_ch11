package string;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ssn="9810282838216";
		char sex = ssn.charAt(6);//문자추출
		switch(sex) {
			case '1':
			case '3':	
				System.out.println("남자입니다");
				break;
			case '2':
			case '4':	
				System.out.println("여자입니다");
				break;
		}
		
		System.out.println();
		
	    String str1 = new String ("신민철");
	    //String str1 = "신민철";
	    String str2 = "신민철";
	    if(str1==str2) {//주소값 비교
	    	System.out.println("같은 String 객체를 참조");
	    }else {
	    	System.out.println("다른 String 객체를 참조");
	    }
	    if(str1.equals (str2)) {//내용(값)비교
	    	System.out.println("같은 String 객체를 참조");
	    }else {
	    	System.out.println("다른 String 객체를 참조");
	    }
	    
	    System.out.println();
	    int length = ssn.length();//문자열 길이
	    if (length ==13) {
	    	System.out.println("주민번호 자리수가 맞습니다.");
	    }else {
	    	System.out.println("주민번호 자리수가 틀립니다.");
	    }
	    
	    System.out.println();
	    String oldStr = "자바는 객체지향 언어입니다. 자바는 풍부한API를 지원합니다";
	    String newStr = oldStr.replace("자바", "JAVA");//문자열 대치
	    System.out.println(oldStr);
	    System.out.println(newStr);
	    
	    System.out.println();
	    String firstNum = ssn.substring(0,6);//문자열 잘라내기
	    //String secondNum = ssn.substring(6,13);
	    String secondNum =ssn.substring(6);
	    System.out.println(firstNum);
	    System.out.println(secondNum);
	    
	    System.out.println();
	    String str11 = String.valueOf(10);//문자열 변환
	    String str22 = String.valueOf(10.5);
	    String str33 = String.valueOf(true);
	    
	    System.out.println(str11);
	    System.out.println(str22);
	    System.out.println(str33);
	    
	    
	}

}
