package interfacetest;

//MemberService 인터페이스를 implements한 클래스 생성 
//Imp1을 붙이는 것이 관례입니다.
public class MemberServiceImp1 implements MemberService {

	@Override
	public boolean idCheck(String id) {
		boolean result = false;
		
		//id가 root가 아니면 true
		if(id.equals("root")==false) {
			result = true;
		}
		return result;
	}

	@Override
	public int login(String id, String password) {
		//id가 root password가 1234면 로그인 성공 - 0
		//id가 root password가 1234 아니면 비번 틀림 - 1
		//id가 root가 아니면 없는 id - 2
		int result = 2;
		if(id.equals("root")){
			result = 0;
		}
		else {
			result = 1;
		}
		return result;
	}
		
}

