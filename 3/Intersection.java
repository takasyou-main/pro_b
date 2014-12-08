import java.io.*;

public class Intersection
{

    public static void main(String[] args)
    {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
	int[] myArrayA=new int[10];
	int[] myArrayB=new int[10];
    
	System.out.println("myArrayA:");
	substitution(myArrayA,br);
	System.out.println("myArrayB:");
	substitution(myArrayB,br);
	
	System.out.println("Result:");
	for(int i=0;i<myArrayA.length;i++){
	    for(int j=0;j<myArrayB.length;j++){
		if(myArrayA[i]==myArrayB[j])System.out.println(myArrayB[j]);
	    }
	}   
    }
    public static void substitution(int[] ary,BufferedReader buff){
	try{
	    
	    for(int i=0;i<ary.length;i++){
		String line = buff.readLine();
		ary[i] = Integer.parseInt(line);//大丈夫？ジャバの参照型だよ？
	    }

	}catch(IOException e){
	}
    }
}
