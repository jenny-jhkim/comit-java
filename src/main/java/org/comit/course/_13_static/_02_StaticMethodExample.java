package org.comit.course._13_static;

class MathUtils {
	static int y = 10;
	int z = 10;
	
    static int square(int x) {
        return x * x;
    }
    
    static int square() {
    	y = 11;
    	return y * y;
    }
    
    static int rectangle(int x) {
    	//We cannot access non-static members from a static method
    	//doSomething();
    	//z = 20;
        return x * y;
    }
    
    void doSomething() {
    	System.out.println("Do something");
    }
    
    //Static Block
    //called just one time - Useful for initialising static variables.
    static {
    	y = 20;
    	System.out.println("Static block called: " + y);
    }
    static {
    	y = 30;
    	System.out.println("Static block 2 called: " + y);
    }
    
    //Static Nested Classes
    static class Nested {
    	void show() {
    		System.out.println("Static nested class method");
    	}
    }

}

public class _02_StaticMethodExample {

	public static void main(String[] args) {
		//can access static method without creating object
		int res = MathUtils.square(5);
		
		MathUtils obj = new MathUtils();
		int res2 = obj.square(6);
		
		int res3 = MathUtils.square();
		
	    System.out.println("Square of 5: " + res);
	    System.out.println("Square of 6: " + res2);
	    System.out.println("Square of 11: " + res3);

	    //Real-world scenario of Static methods - Math methods
	    double pow = Math.pow(2, 3);
	    System.out.println("2^3: " + pow);    

	}

}
