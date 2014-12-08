// TestWrite.java
import java.io.*;

public class TestWrite {
    public static void main(String[] args) throws IOException {
	final int max = Integer.parseInt(args[0]);

	DataOutputStream dosR = new DataOutputStream(new FileOutputStream("R"));
	DataOutputStream dosS = new DataOutputStream(new FileOutputStream("S"));
	for (int i = 1; i <= max; i++) {
	    dosR.writeInt(i);
	    dosS.writeInt(i);
	}
	dosR.close();
	dosS.close();
    }
}
