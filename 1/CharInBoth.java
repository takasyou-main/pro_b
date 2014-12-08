import java.io.*;

public class CharInBoth {
    public static void main(String[] args) {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	try {
	    String line1 = reader.readLine();
	    String line2 = reader.readLine();
	    char common=0;
	    boolean result=false;
	    outer:
	    for(int i=0;i<line1.length();i++){
		for(int j=0;j<line2.length();j++){
		    if (line1.charAt(i) == line2.charAt(j)) {
			common = line1.charAt(i);
			result=true;
			break outer;
		    }
		}
	    }
	    if (result) {
		System.out.println("同じ文字'" + common + "'が見つかりました．");
	    } else {
		System.out.println("同じ文字が見つかりませんでした．");
	    }
	} catch (IOException e) {
	}
    }
}
