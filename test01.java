package D20201210;

public class test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SortSequence("1 2 5 9 17","4 8 13 23 25");
	}
}
class SortSequence{
	 public SortSequence(String strSequence01,String strSequence02) {
		int[] intSequenceArray=new int[10];
		String[] strSequenceArray=(strSequence01+" "+strSequence02).split(" ");
		for(int i=0;i<strSequenceArray.length;i++) {
			intSequenceArray[i]=Integer.parseInt(strSequenceArray[i]);
		}
		for(int i=0;i<intSequenceArray.length;i++ ) {
			intSequenceArray=funSortSequence(intSequenceArray,0);
		}
		for(int i=0;i<intSequenceArray.length;i++) {
			System.out.print(intSequenceArray[i]+",");
		}
	}
	 
	private int[] funSortSequence(int[] intSequenceArray,int intNowItem) {
		int max=0;
		if(intNowItem==9)
			return intSequenceArray;
		if(intSequenceArray[intNowItem]>intSequenceArray[intNowItem+1]) {
			max=intSequenceArray[intNowItem];
			intSequenceArray[intNowItem]=intSequenceArray[intNowItem+1];
			intSequenceArray[intNowItem+1]=max;
		}
		return funSortSequence(intSequenceArray,intNowItem+1);
	}
}
