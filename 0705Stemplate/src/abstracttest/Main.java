package abstracttest;

public class Main {

	public static void main(String[] args) {
		Smartphone smartphone = new Iphone();
		smartphone.call();
		
		smartphone = new Android();
		smartphone.call();
		
		smartphone = new Winphone();
		smartphone.call();
		
		//final 변수 - 값을 변경할 수 없습니다.
		//지역변수지만 전역변수처럼 메모리에서 소멸되지 않습니다.
		final int ZERO = 0;
		//ZERO = 1; The final local variable ZERO cannot be assigned. It must be blank and not using a compound assignment
		
		//이렇게 final를 쓰면 코드가 명확해진다.
		/*int command = 1;
		final int LBUTTONDOWN = 1;
		final int RBUTTONDOWN = 2;
		if(command == LBUTTONDOWN) {}
		else if(command == RBUTTONDOWN) {}*/

	}

}
