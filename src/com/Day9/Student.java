package com.Day9;

public class Student {
 private int roll;
 private String name;
 private int marks;
 private char grade;
 public void displaydeyails() {
	 System.out.println(name);
	 System.out.println(roll);
	 System.out.println(marks);
	 System.out.println(grade);
	 
 }
 private char calculateGrade() {
	  int m=getMarks();
	 if(m>500) {
		 grade='A';
		 
	 }
	  if(m<500 && m>400) {
		 grade ='B';	
		 }
	if(m<400)
 grade='C';
	 return grade;
 }
public Student(int roll, String name, int marks) {
	super();
	this.roll = roll;
	this.name = name;
	this.marks = marks;
	this.grade = grade;
}
public int getRoll() {
	return roll;
}
public void setRoll(int roll) {
	this.roll = roll;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
public char getGrade() {
	return grade;
}
public void setGrade(char grade) {
	this.grade = grade;
}
public Student() {
	super();
	
}
@Override
public String toString() {
	return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + ", Grade=" + calculateGrade()
			+ "]";
}


}
