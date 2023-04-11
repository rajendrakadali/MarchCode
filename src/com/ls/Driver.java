package com.ls;

public class Driver {

	public static void main(String[] args) throws CloneNotSupportedException {
		A a1 = new A(10, "malli");
		A a2=(A)a1.clone();
		
		a1.disp();
		a2.disp();	
	}

}
