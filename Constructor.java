package D20201210;

public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�I�s�S���޼ƪ��غc��
		CCircle cirl1=new CCircle();
		cirl1.show();
		
		//�I�s���޼ƪ��غc��
		CCircle cirl2=new CCircle("Blue",4.0);
		cirl2.show();
	}


}
class CCircle{
	private String color;
	private double pi=3.14;
	private double radius;
	
	public void show() {
		System.out.println("color="+color+",Radius="+radius);
		System.out.println("arear="+pi*radius*radius);
	}
	
	/*�S���޼ƪ��غc��*/
	public CCircle() {
		System.out.println("constructor CCircle() Called");
		color="Green";
		radius=1.0;
	}
	
	/*����Ӥ޼ƪ��غc��*/
	public CCircle(String str,double r) {
		System.out.println("constructor CCircle(String,double) Called");
		color=str;
		radius=r;
	}
}
