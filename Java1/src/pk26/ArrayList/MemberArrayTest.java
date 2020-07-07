package pk26.ArrayList;
import pk26.Member;

public class MemberArrayTest {
	public static void main(String[] args) {
		MemberArrayList memberArrayList=new MemberArrayList();
		
		Member memberLee =new Member(1004,"이지원");
		Member memberSon =new Member(1003,"손민국");
		Member memberPark =new Member(1002,"박서원");
		Member memberHong =new Member(1004,"홍길동");
		
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberHong);
		
		
		memberArrayList.showAllMember();
		memberArrayList.removeMember(memberHong.getMemberId());
		memberArrayList.showAllMember();
	}

}
