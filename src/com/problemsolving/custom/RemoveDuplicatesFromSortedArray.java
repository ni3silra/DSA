package com.problemsolving.custom;

import java.util.ArrayList;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		System.out.println();

	}
	
	public int removeDuplicates(ArrayList<Integer> A) {
	    
	    for(int i = 1; i< A.size();){
	        if(A.get(i-1).equals(A.get(i)))
	            A.set(i,A.get(i+1));
	        else
	            i++;
	    }
	    
	    return A.size();
	}

}
