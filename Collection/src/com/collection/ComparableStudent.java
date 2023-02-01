package com.collection;

public class ComparableStudent  implements Comparable<ComparableStudent>
{

	private String sName;
	private int Rollno;
	private int Marks;

	public ComparableStudent(String sName, int rollno, int marks) {
		super();
		this.sName = sName;
		Rollno = rollno;
		Marks = marks;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public int getRollno() {
		return Rollno;
	}

	public void setRollno(int rollno) {
		Rollno = rollno;
	}
 
	public int getMarks() {
		return Marks;
	}

	public void setMarks(int marks) {
		Marks = marks;
	}

	@Override
	public String toString() {
		return "ComparableStudent [sName=" + sName + ", Rollno=" + Rollno + ", Marks=" + Marks + "]";
	}

	@Override
	public int compareTo(ComparableStudent Stud) {
	if (this.getRollno()>Stud.getRollno())
		return 1;
	else
		return -1;
	}

}
