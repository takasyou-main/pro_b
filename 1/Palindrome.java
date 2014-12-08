import java.io.*;

public class Palindrome {
    public static void main(String[] args) {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	try {
	    String line = reader.readLine();
	    boolean kai=true;
	    for(int i=0;i<line.length()/2;i++){
		if(line.charAt(i) != line.charAt(line.length()-i-1)){
		    System.out.println("\'"+line+"\'は回文ではありません。");
		    kai=false;
		    break;
		    }
	    }
	    if(kai) System.out.println("\'"+line+"\'は回文です。");
	} catch (IOException e) {
	}
    }
}
