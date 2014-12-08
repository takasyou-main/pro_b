import java.io.*;

public class CharIntersection {
    public static void main(String[] args) {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	try {
	    String line1 = reader.readLine();
	    String line2 = reader.readLine();
	    char[] ch1= new char[line1.length()];
	    char[] ch2= new char[line2.length()];
	    for(int i=0;i<line1.length();i++){
		ch1[i]=line1.charAt(i);//配列におとす
	    }
	    for(int i=0;i<line2.length();i++){
		ch2[i]=line2.charAt(i);//配列におとす
	    }
	    //重複チェックルーチン1
	    for(int i=0;i<line1.length();i++){
		int len=line1.length();
		char[] ch = new char[len];
		for(int j=0;j<len;j++)ch[j]=ch1[j];
		//jはiより先からチェックを回す
		for(int j=i+1;j<len;j++){
		    //iより先に同じ文字のj番目の文字が見つかったら？
		    if(ch[i]==ch[j]){
			//j以降の文字を一つずつ詰める作業
			for(int k=j;k<len;k++){
			    //端ではない時
			    if(k!=len-1) ch[k]=ch[k+1];
			}
		    }
		}
		for(int j=0;j<len;j++)ch1[j]=ch[j];
	    }
	    //重複チェックルーチン2
	    for(int i=0;i<line2.length();i++){
		int len=line2.length();
		char[] ch = new char[len];
		for(int j=0;j<len;j++)ch[j]=ch2[j];
		//jはiより先からチェックを回す
		for(int j=i+1;j<len;j++){
		    //iより先に同じ文字のj番目の文字が見つかったら？
		    if(ch[i]==ch[j]){
			//j以降の文字を一つずつ詰める作業
			for(int k=j;k<len;k++){
			    //端ではない時
			    if(k!=len-1) ch[k]=ch[k+1];
			}
		    }
		}
		for(int j=0;j<len;j++)ch2[j]=ch[j];
	    }
	    System.out.print("両方に含まれている文字は「");
	    for(int i=0;i<ch1.length;i++){
		for(int j=0;j<ch2.length;j++){
		    if(ch1[i]==ch2[j]){
			System.out.print(ch1[i]);
			break;
		    }
		}
	    }

	    System.out.println("」です．");
	    
	} catch (IOException e) {
	}
    }
}
