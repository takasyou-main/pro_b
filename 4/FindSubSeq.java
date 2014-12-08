import java.io.*;

public class FindSubSeq
{
    public static void main(String args[]) {
        int[] myArray;

        myArray = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	String line;

        try {
            System.out.print("Input " + myArray.length + " data: ");
            for (int i = 0; i < myArray.length; i++) {
                line = reader.readLine();
                myArray[i] = Integer.parseInt(line);
            }
	    int[] key = new int[args.length];
	    for(int i=0;i<args.length;i++)key[i]=Integer.parseInt(args[i]);//引数を整数配列にする
	    boolean printed=false;
            for(int i=0;i<myArray.length;i++){
		boolean isfound=false;
		for(int j=0;j<key.length;j++){
		    isfound=false;
		    if(i+j<myArray.length){
			if(myArray[i+j]!=key[j])continue;
			isfound=true;
		    }else {isfound=false;break;}
		}
		if(isfound==false)continue;
		System.out.print("Found at " + i + " Sequence: ");
		for(int j=0;j<key.length;j++)System.out.print(key[j]+" ");
		System.out.println("");
		printed=true;
	    }
	    if(!printed)System.out.println("Not Found");

        } catch (IOException e) {
        }
    }
}
