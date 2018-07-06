package abstracttest;

public class Android extends Smartphone{
	public void call() {
		double x = 10.75;
		//소수 첫째자리 반올림해서 출력하기
		System.out.println("x:"+(int)(x+0.5));
		//소수 둘째자리 반올림해서 출력하기 107.5=>108.0=>108=>10.8
		System.out.println("x:"+((int)(x*10+0.5))/10.0);
	}
}
