import java.io.*;

public class InsertSort1 {
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
	    insertSort(myArray);
	    System.out.println("Result:");
	    for (int x : myArray) {
		System.out.println(x);
	    }
	} catch (IOException e) {
	}
    }

    public static void shiftPos(int[] a, int p, int j) {
	while (j >= p) {
	    a[j + 1] = a[j]; 
	    j--;
	}
    }

    public static void insertSort(int[] a) {
	for (int i = 1; i < a.length; i++) {
	    int d = a[i];
	    int p = binarySearch(a, i, d);
	    shiftPos(a, p, i - 1);
	    a[p] = d;
	}
    }
    
    public static int binarySearch(int[] a, int right, int key) {
	int left=0;
	int mid = (left + right) / 2;
	while(a[mid]!=key){
	    mid=(left+right)/2;//midの更新
	    if (a[mid] > key) {
		if(right==left)return mid;
		right=mid;//左を調べる
		} else {
		if(right==left)return mid+1;
		left=mid+1;//右を調べる
		}
	    
	}
	return mid;
    }
 
}
