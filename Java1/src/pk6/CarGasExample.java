package pk6;



public class CarGasExample {

	public static void main(String[] args) {
		
		CarGas myCarGas=new CarGas();
		//CarGas setGa()메소드 호출
		myCarGas.setGas(100);
		
		//isLeftGas()호출
		boolean gasState=myCarGas.isLeftGas();
				
		if(gasState) {
			System.out.println("출발합니다");
					//CarGas의 run() 메소드 호출
			myCarGas.run();
		}
		//주유의 필요유무
		if(myCarGas.isLeftGas()==true
				/*CarGas의 isLeftGas()메소드호출*/) {
			
			
		}

	}

}
