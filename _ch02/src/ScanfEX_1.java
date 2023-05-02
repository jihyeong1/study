import java.util.*; // 1. import문 추가

public class ScanfEX_1 {

	public static void main(String[] args) {
		// 2. scanner 클래스의 객체 생성
		Scanner scanner = new Scanner(System.in); //system.in 은 시스템상에서 입력하는 코드
		
//		int num = scanner.nextInt(); //스캐너에서 정수하나를 입력받아서 num이라는 변수에 저장
//		int num2 = scanner.nextInt();
//		System.out.println(num);
//		System.out.println(num2);
		
		String input = scanner.nextLine(); // 라인단위로 입력값을 받을 때
		int num = Integer.parseInt(input);
		
		System.out.println(num);

	}

}
