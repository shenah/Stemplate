package sharedata;

public class Map {
	private double latitude;
	private double longitude;
	
	//위치 정보를 받는 생성자
	public Map(double latitude, double longitude) {
		super();
		this.latitude = latitude;
		this.longitude = longitude;
	}


	public Map() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getLatitude() {
		return latitude;
	}


	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}


	public double getLongitude() {
		return longitude;
	}


	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}


	//지도를 출력하는 메소드
	public void showMap() {
		System.out.println("위도:" + latitude + "경도:" + longitude + " 위치의 지도를 출력합니다." );
	}

}
