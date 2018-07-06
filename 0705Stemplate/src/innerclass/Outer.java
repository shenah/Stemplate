package innerclass;

public class Outer {
	//일반 inner class: 클래스 안에 존재하는 클래스
	//다른 클래스에서 사용할 수 없음
	/*class Inner{	
	}*/
	//일반 inner class 안에 static 멤버가 있으면 에러가 생김
	//static inner class: 이때 쓰는 클래스 
	
	static class Inner{
		static int n;
	}
	
	//local inner class: 메소드 안에 만드는 클래스
	//메소드가 호출되서 실행될 때 만들어졋다가 없어지는 클래스
	//클래스가 메소드를 호출할 때 만 존재하기 때문에 메모리 효율을 높일 수도 있습니다.
	public void sample() {
		class Inner{
		}
	}

}
