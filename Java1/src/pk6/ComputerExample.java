package pk6;

public class ComputerExample {

	public static void main(String[] args) {
		Computer myCom=new Computer();
		System.out.println("----sum1 유형1----");
		int[] values1= {1,2,3};
		int result=myCom.sum1(values1);
		System.out.println("result: " + result);
		
		System.out.println("----sum1 유형2----");
		int result2=myCom.sum1(new int[] {1,2,3});
		System.out.println("reuslt: "+result2);
		
		
		System.out.println("----sum2 유형1----");
		int result3=myCom.sum2(1,2,3);
		System.out.println("result:" +result3);
		
		System.out.println("----sum2 유형2----");
		int result4=myCom.sum2(1,2,3,4,5);
		System.out.println("result:" +result4);
		

	}

}
