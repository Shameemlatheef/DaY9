package com.Day9;

import java.util.Scanner;

public class Parent {
	final int num;
	
	
public Parent(int num) {
		super();
		this.num = num;
	}

public void method1() {
	System.out.println("Method1 in parent class "+num);
}
public void method2() {
	System.out.println("method2 only in parent");
}
public void method3() {
	System.out.println("method 3 in parent");
}
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter num");
   int num=s.nextInt();
   if(num>=1 && num<=10) {
	
	   Parent p=new Child(num);
	   p.method1();
	   p.method2();
	   p.method3();
	  Child c=(Child)p;
	  c.method4();
	   
	   
   }
   else {
	   System.out.println("invalid num");
   }
    
	
	
}
}
