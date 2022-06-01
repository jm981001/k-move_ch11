package member;

public class Member {
public String id;
	
	public Member(String id) {
		this.id=id;
		
	}
	public boolean equals(Object obj) {//자동 타입 변환
		if(obj instanceof Member) {
		Member member = (Member)obj;//강제 타입 변환
		if (id.equals(member.id)) {//내용(값)이 같은지 비교
			return true;
		}
	}
	return false;
}
	
	//orverrid
	public int hashCode() {
		return id.hashCode();
	}
}

