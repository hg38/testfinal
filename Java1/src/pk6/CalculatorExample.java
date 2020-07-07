package pk6;

public class CalculatorExample {

	public static void main(String[] args) {
		 Calculator myCalc=new Calculator();
		 
		 
		myCalc.powerOn();
		System.out.println(" x / y = : " + myCalc.divide(1, 10)); 
		System.out.println(" x + y = : " + myCalc.plus(2, 2));
		myCalc.powerOn();

	}

}
