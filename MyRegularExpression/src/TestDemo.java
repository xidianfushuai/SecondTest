import java.util.Scanner;

/*输入：正则表达式和待匹配的字符串
输出：输出匹配的字符串，或者空
说明：
我们只需支持如下元规则 [0-9a-zA-Z], *, +
例子：
输入：
[0-9]+
adfefs998760defdsf
输出: 998760*/
public class TestDemo {
	public static void main(String[]args){
		System.out.println("请输入规则和字符串（中间用空格隔开）：");
		Scanner scanner=new Scanner(System.in);
		String str=scanner.nextLine();
		String[] s=str.split(" ");
		//System.out.println(s[0]+s[1]);
		Output out=new Output(s[1]);
		char[] ch1=s[0].toCharArray();
		for(int i=0;i<ch1.length;i++){
			if(ch1[i]=='a')
				out.outputSmallLetter();
			if(ch1[i]=='A')
				out.outputCapital();
			if(ch1[i]=='0')
				out.outputNum();
			if(ch1[i]=='*')
				out.outputCharStar();
			if(ch1[1]=='+')
				out.outputCharAdd();
		}
	}
}
class Output{
	private String str=null;
	public Output(String str){
		this.str=str;
	}
	public void outputNum(){
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++){
			if(ch[i]>'/'&&ch[i]<':'){
				System.out.print(ch[i]);
			}
		}
	}
	public void outputCapital(){
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++){
			if(ch[i]>'@'&&ch[i]<'['){
				System.out.print(ch[i]);
			}
		}
	}
	public void outputSmallLetter(){
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++){
			if(ch[i]>96&&ch[i]<123){
				System.out.print(ch[i]);
			}
		}
	}
	public void outputCharAdd(){
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++){
			if(ch[i]=='+'){
				System.out.print(ch[i]);
			}
		}
	}
	public void outputCharStar(){
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++){
			if(ch[i]=='*'){
				System.out.print(ch[i]);
			}
		}
	}
}