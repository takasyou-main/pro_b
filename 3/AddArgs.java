import java.io.*;

public class AddArgs
{
     public static void main(String[] args)
    {
	int sum=0;
	for (int i=0;i<args.length;i++) {
	    sum+=Integer.parseInt(args[i]);
	}
	System.out.println("和は"+sum+"です．");
    }                                                                                                                    
}   

