package pk6;

public class CarGas {
	
	//�ʵ�
	int gas;
	//������
	//�޼ҵ�
	void setGas(int gas) {
		this.gas=gas;
	}
	boolean isLeftGas() {
		//gas�� 0�̸�  gas�� �����ϴ� ->false
		//�������� �ݴ�
		if(gas==0) {
			return false;
		}
		return true;
	}
	void run() {
		//gas�� 0���� ũ�� �޸��ϴ�
		while(true)
		if(gas>0) {
			System.out.println(" �������Դϴ�. (Gas�ܿ���: " +gas+")");
			gas-=1;
			
		}
		else{
			System.out.println("�������Դϴ�. (gas������" +gas+")");
			return;
		}
		
	}

}
