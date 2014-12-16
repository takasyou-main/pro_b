// FileReadWrite.java
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;

class FileReadWrite
{
    static void fileRead() {
	try {
	    File file = new File("strings.txt");
	    BufferedReader br = new BufferedReader(new FileReader(file));
	    while (true) {
		String str = br.readLine();
		if (str == null) break;
		System.out.println(str);;
	    }
	    br.close();
	} catch(FileNotFoundException e){
	    System.out.println(e);
	} catch(IOException e){
	    System.out.println(e);
	}
    }

    static void fileWrite(int max) {
	try{
	    File file = new File("strings.txt");
	    FileWriter filewriter = new FileWriter(file);

	    for (int i = 0; i < max; i++) {
		String str = new String();
		for (int j = 0; j < 4; j++) {
		    Random rnd = new Random();
		    int ran = rnd.nextInt(25);
		    char newChar = 'a';
		    for (int k = 0; k < ran; k++) newChar++;
		    str += newChar;
		}
		//System.out.println(str);
		filewriter.write(str + "\n");
	    }
	    filewriter.close();
	}catch(IOException e){
	    System.out.println(e);
	}
    }

    public static void main(String[] args) {
	int max = Integer.parseInt(args[0]);
	fileWrite(max);
	fileRead();
    }
}
