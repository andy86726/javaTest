package D20201210;

public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//㊣⊿Τま计篶じ
		CCircle cirl1=new CCircle();
		cirl1.show();
		
		//㊣Τま计篶じ
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
	
	/*⊿Τま计篶じ*/
	public CCircle() {
		System.out.println("constructor CCircle() Called");
		color="Green";
		radius=1.0;
	}
	
	/*Τㄢま计篶じ*/
	public CCircle(String str,double r) {
		System.out.println("constructor CCircle(String,double) Called");
		color=str;
		radius=r;
	}
}
