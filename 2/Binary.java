import java.io.*;

public class Binary {
    public static void main(String[] args) {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	try{
	    String line = reader.readLine();
	    int num = Integer.parseInt(line);
	    printBinary(num);
	    System.out.println("");
	} catch (IOException e) {
	}
    }

    public static void printBinary(int deci){
	if(deci!=0){
	    printBinary(deci/2);
	    if(deci%2==0)System.out.print("0");
	    else System.out.print("1");
	}
    }
}
