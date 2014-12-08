import java.io.*;

public class NoDoWhile {
    public static void main(String[] args) {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	try {
	    String line;
	    while(1==1){
		line = reader.readLine();
		System.out.println("You said: " + line);
		if(line.equals("bye") == true) break;
	    }
	} catch (IOException e) {
	}
    }
}
