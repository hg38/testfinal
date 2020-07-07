package pk26;

import java.util.Comparator;

public class Member implements Comparator<Member> {
	
	private int memberid;
	private String membername;
	
	public Member(int memberid, String membername) {
		this.memberid=memberid;
		this.membername=membername;	
	}
	@Override
	public int hashCode() {
		return memberid;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member memberid=(Member)obj;
			if(memberid.equals(memberid.memberid)) {
				return true;
			}
		} return false;
	}

	@Override
	public String toString() {

		return membername + "님의 아이디는 : " +memberid+" 입니다 ";
	}
	public int getMemberId() {
		return memberid;
	}
	
	public int compareTo(Member Member) {
		return (this.memberid-Member.memberid);
	}
	@Override
	public int compare(Member o1, Member o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
