package java1210;

import java.util.ArrayList;
import java.util.Comparator;

public class MergeSortArray_Merge {

	public ArrayList<Integer> arraySort(String[] num1,String[] num2){

		ArrayList<Integer> sortArr = new ArrayList<Integer>();
		
		for(String x:num1)
			sortArr.add(Integer.parseInt(x));
		for(String y:num2)
			sortArr.add(Integer.parseInt(y));
		sortArr.sort(Comparator.naturalOrder());
				
		return sortArr;
	}
	
	
}
