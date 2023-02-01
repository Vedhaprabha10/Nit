package com.collection;
import java.util.*;
public class ComparableSchool
{

	public static void main(String[] args) {
		List<ComparableStudent> Stud1=new ArrayList<ComparableStudent>();
			Stud1.add(new ComparableStudent("vedha",2,439));
			Stud1.add(new ComparableStudent("keerthi",5,493));
			Stud1.add(new ComparableStudent("priya",10,477));
			
			Collections.sort(Stud1);
			for(ComparableStudent S :Stud1) {
				System.out.println(S);
			}
			
	
	}
		
	}


