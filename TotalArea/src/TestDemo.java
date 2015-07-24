import java.util.ArrayList;

/* 天天是个3岁的小朋友，她有一些不同形状的积木，
 * 形状包括长方形，正方形，圆形，三角形四种。
 * 某天，天天将自己的积木拿到你的面前，请求你计算下这些积木的总面积。
 * 作为大哥哥大姐姐的你如何完成呢？
 * 1. 使用多态
 * 2. 可以将所有的积木的属性在代码中定义，不用输入数据*/
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
		System.out.println("总面积是："+sumArea);
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