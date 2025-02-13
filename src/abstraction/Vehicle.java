package abstraction;

abstract class Vehicle {

	abstract void start();//abstract method (No implementation)
   
	
	void stop() {            //concrete method with implementation
    	System.out.println("car stoping......");
    }
}
