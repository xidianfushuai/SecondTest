import java.util.ArrayList;

/* �����Ǹ�3���С���ѣ�����һЩ��ͬ��״�Ļ�ľ��
 * ��״���������Σ������Σ�Բ�Σ����������֡�
 * ĳ�죬���콫�Լ��Ļ�ľ�õ������ǰ���������������Щ��ľ���������
 * ��Ϊ�����������������أ�
 * 1. ʹ�ö�̬
 * 2. ���Խ����еĻ�ľ�������ڴ����ж��壬������������*/
public class TestDemo {
	public static void main(String[]args){
		ArrayList<Shape> shapes=new ArrayList<Shape>();
		shapes.add(new Chang(2.3, 3.2));
		shapes.add(new Zheng(5));
		shapes.add(new Circle(3.14));
		shapes.add(new San(2.5 , 1.6, 3.1));
		double sumArea=0;
		for(int i=0;i<shapes.size();i++){
			sumArea=sumArea+shapes.get(i).getArea();
		}
		System.out.println("������ǣ�"+sumArea);
	}
}
interface Shape{
	public double getArea();
}
class Chang implements Shape{
	private double length;
	private double width;
	public Chang(double length,double width){
		this.length=length;
		this.width=width;
	}
	public double getArea(){
		return length*width;
	}
}
class Zheng extends Chang{
	private double edge_length;
	public Zheng(double edge_length) {
		super(edge_length,edge_length);
		// TODO Auto-generated constructor stub
		this.edge_length=edge_length;
	}
	public double getArea(){
		return edge_length*edge_length;
	}
}
class Circle implements Shape{
	private double r;
	public Circle(double r){
		this.r=r;
	}
	public double getArea(){
		return 3.14*r*r;
	}
}
class San implements Shape{
	private double length1;
	private double length2;
	private double length3;
	public San(double length1,double length2,double length3){
		this.length1=length1;
		this.length2=length2;
		this.length3=length3;
	}
	public double getArea(){
		double p=(length1+length2+length3)/2;
		return Math.sqrt(p*(p-length1)*(p-length2)*(p-length3));
	}
}