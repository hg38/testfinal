
public class Car {
	
	//필드((멤버변수)
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자
	Car(){
		
	}
	
	Car(String model){
		this.model=model;
	}
	Car(String model,String color){
		this.model=model;
		this.color=color;
	}
	
	Car(String model,String color,int maxSpeed){
		this.model=model;
		this.color=color;
		this.maxSpeed=maxSpeed;
	}
	
	public void show() {
		System.out.println();
	}
	
	//메소드 

}
