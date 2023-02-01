package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorRunner
{
	public static void main(String[] args) {
	List<ComparatorLaptops>laps=new ArrayList<>();
		laps.add(new ComparatorLaptops("Dell",8,1024));
		laps.add(new ComparatorLaptops("Lenovo",8,750));
		laps.add(new ComparatorLaptops("Apple",16,500));
		laps.add(new ComparatorLaptops("Lenovo",14,700));
		
		
	
		Collections.sort(laps, Comparator.comparing(ComparatorLaptops::getBrand).thenComparing(ComparatorLaptops::getRom).thenComparing(ComparatorLaptops::getRam));
		System.out.println(laps);
	
		
//		
//		Comparator<ComparatorLaptops> com=new Comparator<ComparatorLaptops>()
//				{
//					public int compare(ComparatorLaptops l1,ComparatorLaptops l2)
//					{
//						if (l1.getBrand()==l2.getBrand())
//						return 0;
//						else if(l1.getRam()>l2.getRam())
//							return -1;
//						else 
//					return -1;
//					}
//				};
//	Collections.sort(laps , com);
//	for (ComparatorLaptops l : laps)
//		{
//			System.out.println(l);
//		}		
}
}
