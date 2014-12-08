import java.io.*;

public class Combination {
    public static void main(String[] args) {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	try {
	    String line1 = reader.readLine();
	    int all = Integer.parseInt(line1);
	    String line2 = reader.readLine();
	    int chose = Integer.parseInt(line2);
	    System.out.println("comb("+all+","+chose+") = "+comb(all,chose));
	} catch (IOException e) {
	}
    }

    public static int comb(int m,int n){
	if(m==n||n==0)return 1;
	else return comb(m-1,n-1)+comb(m-1,n);
    }
}
