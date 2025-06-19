package Abstraction;

public abstract class Car {
	Car() {
		System.out.println("bike is created");
	}
	abstract void run();
	void changeGear() {
		System.out.println("gear changed");
	}
}
//Creating a child class which inherits Abstract class 
class Honda extends Car{
	void run() {
		System.out.println("runnig safely...");
	}

//Creating a Test class which calls abstract and non-absract methods
	class TestAbstraction{
		public void main(String[] args) {
			Car obj = new Honda();
			obj.run();
			obj.changeGear();
		}
	}
}
