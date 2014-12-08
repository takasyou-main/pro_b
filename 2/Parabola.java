import java.io.*;

public class Parabola{
    public static void main(String arg[]){
	for(int i=0;i<17;i++){
	    int squared = sq(i-8);
	    printGraph(squared);
	}
    }
    public static int sq(int a){
	return a*a;
    }
    public static void printGraph(int x) {
	for (int i = 0; i < x; i++) {
	    System.out.print("*");
	}
	System.out.println("");
    }
}
						   
