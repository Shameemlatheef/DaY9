package com.Day9;

public class Demo {
public static void main(String[] args) {
	Student s=new Student();
	s.setName("shameem");
	s.setMarks(300);
	s.setRoll(20);

	s.displaydeyails();
	Student s1=new Student(21,"micehal",600);
	System.out.println(s);
	System.out.println(s1);

}
}
