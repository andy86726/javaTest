package D20201210;

public class test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RandomSort(100000);
	}
}
class RandomSort{
	public RandomSort(int intLoopNum) {
		int[] intRandomAry=new int[intLoopNum];
		
		for(int i=0;i<intLoopNum;i++) {
			intRandomAry[i]=(int)(Math.random()*50);
			if(intRandomAry[i]==0)
				i--;
		}
		
		for (int i = 0; i < intRandomAry.length; i++) {
			for (int j = 0; j < intRandomAry.length - 1 - i; j++) {
				if (intRandomAry[j] > intRandomAry[j + 1]) {
					int	intMin = intRandomAry[j];
					intRandomAry[j] = intRandomAry[j + 1];
					intRandomAry[j + 1] = intMin;
				}
			}
		}
		
		
		for(int i=0;i<intRandomAry.length;i++) {
			int intNum01=intRandomAry[i],intCount=0;
			for(int j=i;j<intRandomAry.length;j++) {
				if(intRandomAry[j]==intNum01) {
					intCount++;
				}else {
					i=j;
					System.out.printf("數字%d總共重複了%d次\n",intNum01,intCount);
					break;
				}
			}
		}
		
	}
}
