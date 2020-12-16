package java1210;

import java.util.Arrays;
import java.util.Scanner;

/*
試寫一物件，達成以下功能:
輸入兩串各含五個數值且已依小到大排序好的資料串列。將此兩串資料串列
合併排序成一個含十個數值由小到大排序的資料串列，由螢幕輸出合併排序後的
數值串列。
// ========================
輸入樣本 1：
1 2 5 9 17
4 8 13 23 25
輸出樣本 1：
1 2 4 5 8 9 13 17 23 25
// ========================
輸入樣本2：
6 7 8 9 10
1 2 3 4 5
輸出樣本2：
1 2 3 4 5 6 7 8 9 10*/
public class MergeSortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] num1 = { 1, 2, 5, 9, 17 };
//		int[] num2 = { 4, 8, 13, 23, 25 };
		String num1, num2;
		String num1_arr[],num2_arr[];
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入一串小到大的數列並以逗號間隔");
		num1 = scn.next();
		System.out.println("請輸入一串小到大的數列並以逗號間隔");
		num2 = scn.next();
		num1_arr = num1.split(",");
		num2_arr = num2.split(",");
		Arrays.sort(num1_arr);
		Arrays.sort(num2_arr);
	
		MergeSortArray_Merge merge = new MergeSortArray_Merge();
		System.out.print(merge.arraySort(num1_arr, num2_arr));
		scn.close();

	}

}
