import java.io.*;

public class SelectionSort {
    public static void main(String args[]) {
	int[] myArray;
	int nData = 10;
	if (args.length > 0) {
	    nData = Integer.parseInt(args[0]);
	}
	myArray = new int[nData];
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	String line;

	try {
	    System.out.println("Input " + myArray.length + " data:");
	    for (int i = 0; i < myArray.length; i++) {
		line = reader.readLine();
		myArray[i] = Integer.parseInt(line);
	    }
	    selectionSort(myArray);
	    System.out.println("Result:");
	    for (int x : myArray) {
		System.out.println(x);
	    }
	} catch (IOException e) {
	}
    }
    public static void swap(int[] a, int pos1, int pos2) {
	int tmp = a[pos1];
	a[pos1] = a[pos2];
	a[pos2] = tmp;
    }
    public static int selectMax(int i, int[] a) {
	int max = 0;
	for (int j = 1; j <= i; j++) {
	    if (a[j] > a[max]) {
		max = j;
	    }
	}
	return max;
    }
    public static void selectionSort(int[] array){
	for(int i=array.length-1;i>=0;i--){
	    int maxPos=selectMax(i,array);
	    swap(array,maxPos,i);
	}
	
    }
}
