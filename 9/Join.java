// Join.java
import java.io.*;
import java.util.*;

public class Join {
    public static void main(String[] args) throws IOException {
	int value;

	DataInputStream disR = new DataInputStream(new FileInputStream("R"));
	DataInputStream disS = new DataInputStream(new FileInputStream("S"));
	List<Integer> listR = new LinkedList<Integer>();
	List<Integer> listS = new LinkedList<Integer>();

	while (disR.available() > 0) {
	    value = disR.readInt();
	    listR.add(value);
	}
	while (disS.available() > 0) {
	    value = disS.readInt();
	    listS.add(value);
	}

	disR.close();
	disS.close();
	
	int count=0;
	for (Iterator<Integer> iterR = listR.iterator();
	     iterR.hasNext();) {
	    int rval = iterR.next();//比較用変数を作成して、iterRをインクリメント

	    for(Iterator<Integer> iterS = listS.iterator();
		iterS.hasNext();){
		int sval = iterS.next();//比較用変数を作成して、iterSをインクリメント
		if(sval==rval)count++;//比較[s,r]valを使用
	    }
	}

	System.out.println("Number of Matches: " + count);
    }
}
