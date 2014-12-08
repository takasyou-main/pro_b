import java.io.*;

public class ShowAllFiles{
    public static void main(String[] args){
	String dirname=args[0];
	File dir=new File(dirname);
	String[] dirlist=dir.list();
	for(int i=0;i<dirlist.length;i++){
	    System.out.println("File: "+dirname+"/"+dirlist[i]);
	    try{
		BufferedReader reader = new BufferedReader(new FileReader(dirname+"/"+dirlist[i]));
		String line;
		while((line=reader.readLine())!=null){
		    System.out.println(line);
		}
		reader.close();
	    }catch(IOException e){
		System.out.println(e);
	    }
	}
    }
}
		
