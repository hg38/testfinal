package pk12;

import javax.swing.JOptionPane;

public class CharArray {

	public static void main(String[] args) {
		String str[]= {"ab111","cd222","ef333","gh444","ij555"};
		String res="";
		int i;
		/*for(int j=0;j<str.length;j++) {
			System.out.println(str[j]+res);
		}*/
		for(i=0;i<str.length;i++)
			res=res+str[i]+"\n";
			System.out.println(res);
		
			JOptionPane.showMessageDialog(null, "�迭�� ���� ����"+res);
		

	}

}
