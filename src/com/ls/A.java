package com.ls;

public class A implements Cloneable{

	int cno;
	String cname;

	A(int cno, String cname) {

		this.cno = cno;
		this.cname = cname;

	}

	public void disp() {
		System.out.println(cno + "   " + cname);
	}
	 protected void finalize() {
		System.out.println("cleaning activity is going on");
	 }
	public Object clone() throws CloneNotSupportedException {
		return (A) super.clone();
	}
	 }
