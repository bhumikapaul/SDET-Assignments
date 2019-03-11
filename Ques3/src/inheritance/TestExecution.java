package inheritance;

import inheritance.Swift;
import inheritance.NewCar;

public class TestExecution {

	public static void main(String[] args) {
		
		Swift s = new Swift();
		s.start();
		s.stop();
		s.theftsafety();

		new NewCar();
		new Swift();
		
		NewCar c = new Swift();
		c.start();
		c.stop();		

	}

}
