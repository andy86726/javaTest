package D20201210;

public class test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LongestIncreasingSubSequence(new String[] {"1","2","3","1","11","7","5","4","6","7","8"});
	}

}
class LongestIncreasingSubSequence{

	public LongestIncreasingSubSequence(String[] strSequenceAry) 
	{
		int [] intSequenceAry=new int[strSequenceAry.length];
		for(int i=0;i<strSequenceAry.length;i++) {
			intSequenceAry[i]=Integer.parseInt(strSequenceAry[i]);
		}
		
		int intStart=0,intMax=intSequenceAry[0];
		
		for(int i=intStart;i<intSequenceAry.length;i++) {
			for(int j=i;j<intSequenceAry.length;j++) {
				
				if(intSequenceAry[j]>intMax) {
					intSequenceAry[]
				}
				
			}
		}
		
	}
}
