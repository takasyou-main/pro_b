import java.io.*;

public class Inverse
{
     public static void main(String[] args)
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] myArray;

        try {
            myArray = new int[10];
            System.out.println("Input 10 values");
            for (int i = 0; i < myArray.length; i++) {
                String line = br.readLine();
                myArray[i] = Integer.parseInt(line);
            }
	    System.out.println("Result:");
	    for(int i=myArray.length-1; i>=0;i--){
		System.out.println(myArray[i]);
	    }
        }
        catch (IOException e){
        }
    }                                                                                                                    
}   

