import java.io.*;

public class BinaryIntIter
{
    public static int binarySearch(int[] a, int left, int right, int x) {
	if (left >= right)return -1;
	int mid = (left + right) / 2;
	while(a[mid]!=x){
	    mid=(left+right)/2;//midの更新
	    if (a[mid] > x) {
		right=mid;//左を調べる
		} else {
		left=mid+1;//右を調べる
		}
	}
	return mid;
    }
    
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
            System.out.print("Input key: ");
            line = reader.readLine();
            int key = Integer.parseInt(line);

            int p; // position
            p = binarySearch(myArray, 0, myArray.length, key); 
            if (p == -1) {
                System.out.println("Not Found");
            }
            else {
                System.out.println("Found at myArray[" + p + "] " + myArray[p]);
            }
        } catch (IOException e) {
        }
    }
}
