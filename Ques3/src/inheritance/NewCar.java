package inheritance;

public class NewCar {

	public NewCar(){
		System.out.println("We are in NewCar constructor");
	}

	public void start(){
		System.out.println("We are in NewCar start");
	}
	
	protected void stop(){
		System.out.println("We are in NewCar stop");
	}
	
}
