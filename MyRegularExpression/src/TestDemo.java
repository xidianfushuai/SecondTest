import java.util.Scanner;

/*���룺������ʽ�ʹ�ƥ����ַ���
��������ƥ����ַ��������߿�
˵����
����ֻ��֧������Ԫ���� [0-9a-zA-Z], *, +
���ӣ�
���룺
[0-9]+
adfefs998760defdsf
���: 998760*/
public class TestDemo {
	public static void main(String[]args){
		System.out.println("�����������ַ������м��ÿո��������");
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