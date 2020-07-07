package pk26.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

import pk26.Member;

public class MemberArrayList {
	
	private ArrayList<Member> arraylist; //ArrayList ����
	
	public MemberArrayList(){
		arraylist=new ArrayList<Member>();
		//����� ������ ArrayList�� �ν��Ͻ�ȭ ��
	}
	public void addMember(Member member) {
		//ArrayList�� member�� �߰�
		arraylist.add(member);
	}
	
	public boolean removeMember(int memberid) { //��� ���̵� �Ű�������, ���� ���θ� ��ȯ
		for(int i=0; i<arraylist.size();i++) { //�ش� ���̵� ���� ����� ArrayList�ؼ� ã��
			Member member=arraylist.get(i);
			int teamid=member.getMemberId();
			if(teamid==memberid) {		//������̵� �Ű������� ��ġ�ϸ�
				arraylist.remove(i);	// �ش� ����� ����
				return true;			//true ��ȯ
			}
		}
		Iterator<Member> ir = arraylist.iterator();
		while(ir.hasNext()) {
			Member member=ir.next();
			int teamid=member.getMemberId();
			if(teamid==memberid) { //������̵� �Ű������� ��ġ�ϸ�
				arraylist.remove(member); //�ش� ����� ����
				return true;
			}
		}
		System.out.println(memberid + "�� �������� �ʽ��ϴ�.");
		return false;
	}
	public void showAllMember() {
		for(Member member : arraylist) {
			System.out.println(member);
		}
		System.out.println();
	}


}
