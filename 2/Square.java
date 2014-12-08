import java.io.*;

public class Square{
    public static void main(String arg[]){
	for(int i=1;i<=11;i+=2){
	    int squared = sq(i);
	    System.out.println(i+"の2乗は"+squared+"です．");
	}
    }
    public static int sq(int a){
	return a*a;
    }
}
						   
