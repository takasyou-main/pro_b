import java.io.*;

public class Prime {
    public static void main(String[] args) {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	try {
	    String line = reader.readLine();
	    int num=Integer.parseInt(line);
	    boolean prime=true;
	    for(int i=2;i<num;i++){
		if(num%i==0){
		System.out.println(num+"は素数ではありません．");
		prime=false;
		break;
	    }
	    }
	    if(prime) System.out.println(num+"は素数です．");
	} catch (IOException e) {
	}
    }
}
