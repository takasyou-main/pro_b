import java.io.*;

public class MaxMin
{
     public static void main(String[] args)
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] Array= new int[10];

        try {
            
            System.out.println("Input 10 values");
            for (int i = 0; i < Array.length; i++) {
                String line = br.readLine();
                Array[i] = Integer.parseInt(line);
            }
	    System.out.println("Max: myArray["+max(Array)+"] "+Array[max(Array)]);
	    System.out.println("Min: myArray["+min(Array)+"] "+Array[min(Array)]);
        }
	catch (IOException e){
        }
    }                                             
    public static int max(int[] ary)
    {
	int result_index=0;
	for(int i=1;i<ary.length;i++){
	    if(ary[result_index]<ary[i])result_index=i;
	}
	return result_index;
    }
    public static int min(int[] ary)
    {
	int result_index=0;
	for(int i=1;i<ary.length;i++){
	    if(ary[result_index]>ary[i])result_index=i;
	}
	return result_index;
    }

}   
