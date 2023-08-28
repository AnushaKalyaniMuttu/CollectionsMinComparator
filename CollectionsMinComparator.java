package com.bean;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsMinComparator {

	public static void main(String[] args) {
		
		 List<Integer> sourceList = new ArrayList<>();
	        sourceList.add(1);
	        sourceList.add(2);
	        sourceList.add(3);
	        
	        
	        
	  int min= Collections.max(sourceList);
	  System.out.println(min);
	int minValue= Collections.max(sourceList, Comparator.comparing(Integer:: intValue));
	System.out.println(minValue);
	      	}
		
	}
