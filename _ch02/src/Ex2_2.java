
public class Ex2_2 {

	public static void main(String[] args) {
		// 변수,상수,리터럴
		/*
		 변수는 하나의 값을 저장하기 위한 공간으로 값이 언제든 변경이 가능하다
		 
		 상수는 한 번만 값을 저장가능한 변수로 값 변경이 불가능하다.
		 <상수의 사용 예>
		 final int MAX = 100; 이렇게 사용하며 타입 앞에 <final> 을 사용하면 값을 절대로 변경하지 못한다.
		 
		 리터럴은 그 자체로 값을 의미하는 것이다. (변수의 값을 의미한다는 말이다.) 
		 
		 */
		
		int score = 100;
		final int x = 200; // 상수사용의 예
//				x=300; // 이렇게 값을 바꾸려고하면 에러가 난다 
		
		System.out.println(score);
		System.out.println(x);
		
		//리터럴 값
		char ch = 'A'; //출력 값 A
		int i = 'A'; // 출력 값 65, A 가 문자로 나오는 것이 아니라 int 타입이기때문에 정수로 변경되어 출력 됨
		
		String str = ""; //빈 문자열이여도 됨
		
		// 두 변수의 값 교환하기
		int e= 10 , y=20;
		int tmp; //빈 컵
		tmp = e; // e의 값을 tmp 에 저장
		e = y; // y의 값을 e에 저장
		y = tmp; // tmp에 담김 e값을 y에 저장
		
		System.out.println("e=" + e); // 출력 값 e=20
		System.out.println("y=" + y); // 출력 값 y=10
		
	}

}
