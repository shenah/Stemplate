package innerclass;

public class Main {

	public static void main(String[] args) {
		ThreadEx obj=new ThreadEx();
		obj.start();
		
		//Thread 클래스의 Anonymous 만들기
		Thread th=new Thread() {
			public void run() {
				try {
					for(int i=10; i<20; i=i+1) {
						System.out.println(i);
						Thread.sleep(1000);
					}
				}
				catch(Exception e) {}
			}
		};
		th.start();
	}

}
