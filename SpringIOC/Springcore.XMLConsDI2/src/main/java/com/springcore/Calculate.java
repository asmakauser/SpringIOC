package com.springcore;

public class Calculate {

	private int a;
	private int b;
	
	public Calculate(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		System.out.println("Constructor: int, int");
	}
	
	
	public Calculate(double a, double b) {
		super();
		this.a = (int) a;
		this.b = (int) b;
		System.out.println("Constructor: double, double");
	}
	
	
	public Calculate(String a, String b) {
		super();
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(a);
		System.out.println("Constructor: string, string");
	}
	 
	
	
	public void doSum() {
		System.out.println("Sum is:"+ (this.a +this.b));
	}
	
	
	
}
