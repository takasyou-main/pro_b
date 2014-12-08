import java.io.*;

public class Ack {
    public static void main(String[] args) {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	try {
	    String line1 = reader.readLine();
	    int x = Integer.parseInt(line1);
	    String line2 = reader.readLine();
	    int y = Integer.parseInt(line2);
	    System.out.println("ack("+x+","+y+") = "+ack(x,y));
	} catch (IOException e) {
	}
    }
    public static int ack(int m,int n){
	if(m==0)return n+1;
	if(n==0)return ack(m-1,1);
	return ack(m-1,ack(m,n-1));
    }
}	
