import java.io.*;
import java.util.*;
public class Factor {
    public static void main(String[] args) {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	try {
	    String line = reader.readLine();
	    int num=Integer.parseInt(line);
	    Vector prime=new Vector();
	    for(int i=2;i<=Math.sqrt(num);i++){
		boolean isprime=true;
		for(int j=2;j<=Math.sqrt(i);j++){
		    if(i%j==0){
			isprime=false;
			break;
		    }
		}
		if(isprime){
		    prime.add(i);

		}
		
	    }
	    String prefix=""+num+" = ";
	    for(int i=prime.size()-1;i>=0;i--){
		int power=0;
		int l_prime=(int)(prime.elementAt(i));
		while(num%l_prime==0){
		    power++;
		    num/=l_prime;
		    }
		if(power>0){
		    System.out.print(prefix + l_prime + "^" + power);
		    prefix=" * ";
		}
	    }
	    System.out.println("");


	} catch (IOException e) {
	}
    }
}
