import java.io.*;

public class LinearInt
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
            System.out.print("Input key: ");
            line = reader.readLine();
            int key = Integer.parseInt(line);
            for(int i=0;i<myArray.length;i++){
	    if (myArray[i]==key) {
                System.out.println("Found at myArray[" + i + "] " + myArray[i]);
            }
	    }
                System.out.println("Not Found");

        } catch (IOException e) {
        }
    }
}
