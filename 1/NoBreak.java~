import java.io.*;

public class NoBreak {
    public static void main(String[] args) {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	try {
	    String line = reader.readLine();
	    boolean found = false;
	    int i=0;
	    do{
		if (line.charAt(i) == 'X') {
		    found = true;
		}else{
		    System.out.print(".");
		    i++;
		}
	    }while(i < line.length()&&found==false);
	    if (found) {
		System.out.println("Xが見つかりました．");
	    } else {
		System.out.println("Xが見つかりませんでした．");
	    }
	} catch (IOException e) {
	}
    }
}
