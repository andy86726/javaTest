package java1210;

import java.util.Arrays;
import java.util.Scanner;

/*
�ռg�@����A�F���H�U�\��:
��J���U�t���ӼƭȥB�w�̤p��j�ƧǦn����Ʀ�C�C�N������Ʀ�C
�X�ֱƧǦ��@�ӧt�Q�ӼƭȥѤp��j�ƧǪ���Ʀ�C�A�ѿù���X�X�ֱƧǫ᪺
�ƭȦ�C�C
// ========================
��J�˥� 1�G
1 2 5 9 17
4 8 13 23 25
��X�˥� 1�G
1 2 4 5 8 9 13 17 23 25
// ========================
��J�˥�2�G
6 7 8 9 10
1 2 3 4 5
��X�˥�2�G
1 2 3 4 5 6 7 8 9 10*/
public class MergeSortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] num1 = { 1, 2, 5, 9, 17 };
//		int[] num2 = { 4, 8, 13, 23, 25 };
		String num1, num2;
		String num1_arr[],num2_arr[];
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J�@��p��j���ƦC�åH�r�����j");
		num1 = scn.next();
		System.out.println("�п�J�@��p��j���ƦC�åH�r�����j");
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
