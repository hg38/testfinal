package pk6;



public class CarGasExample {

	public static void main(String[] args) {
		
		CarGas myCarGas=new CarGas();
		//CarGas setGa()�޼ҵ� ȣ��
		myCarGas.setGas(100);
		
		//isLeftGas()ȣ��
		boolean gasState=myCarGas.isLeftGas();
				
		if(gasState) {
			System.out.println("����մϴ�");
					//CarGas�� run() �޼ҵ� ȣ��
			myCarGas.run();
		}
		//������ �ʿ�����
		if(myCarGas.isLeftGas()==true
				/*CarGas�� isLeftGas()�޼ҵ�ȣ��*/) {
			
			
		}

	}

}
