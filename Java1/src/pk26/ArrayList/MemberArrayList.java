package pk26.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

import pk26.Member;

public class MemberArrayList {
	
	private ArrayList<Member> arraylist; //ArrayList 선언
	
	public MemberArrayList(){
		arraylist=new ArrayList<Member>();
		//멤버로 선언한 ArrayList가 인스턴스화 됨
	}
	public void addMember(Member member) {
		//ArrayList에 member를 추가
		arraylist.add(member);
	}
	
	public boolean removeMember(int memberid) { //멤버 아이디를 매개변수로, 삭제 여부를 반환
		for(int i=0; i<arraylist.size();i++) { //해당 아이디를 가진 멤버를 ArrayList해서 찾음
			Member member=arraylist.get(i);
			int teamid=member.getMemberId();
			if(teamid==memberid) {		//멤버아이디가 매개변수와 일치하면
				arraylist.remove(i);	// 해당 멤버를 삭제
				return true;			//true 반환
			}
		}
		Iterator<Member> ir = arraylist.iterator();
		while(ir.hasNext()) {
			Member member=ir.next();
			int teamid=member.getMemberId();
			if(teamid==memberid) { //멤버아이디가 매개변수와 일치하면
				arraylist.remove(member); //해당 멤버를 삭제
				return true;
			}
		}
		System.out.println(memberid + "가 존재하지 않습니다.");
		return false;
	}
	public void showAllMember() {
		for(Member member : arraylist) {
			System.out.println(member);
		}
		System.out.println();
	}


}
