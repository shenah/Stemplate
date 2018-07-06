package interfacetest;

public interface MemberService {
	//인터페이스의 메소드는 abstract를 붙이지 않아도 추상 메소드입니다.
	//메소드가 내용({})을 가지면 안됩니다.
	
	//아이디 중복 체크 메소드
	public boolean idCheck(String id);
	//로그인 처리를 위한 메소드
	public int login(String id, String password);
}
