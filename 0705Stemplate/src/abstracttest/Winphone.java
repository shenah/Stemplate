package abstracttest;

public class Winphone extends Smartphone {

	@Override
	public void call() {
		int time =132400;
		int hour = time/3600;
		int minute = (time%3600)/60;
		int second = time%60;
		
		minute = minute%60;                                                              
		System.out.println(hour + "시간" + minute + "분" + second + "초");
	}

}
