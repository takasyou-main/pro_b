import java.io.*;

public class Gate {
    public static void main(String[] args) {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	try {
	    String dataLine = "3345678887654322";
	    int pos = 3;
	    System.out.println("Print command line L (Left), R (Right), D (Down): ");
	    String commandLine = reader.readLine();
	    boolean crash = false;
	    for (int i = 0; crash == false && i < dataLine.length(); i++) {
		int d = (int)(dataLine.charAt(i) - '0');
		if (i < commandLine.length()) {
		    switch (commandLine.charAt(i)) {
		    case 'L': pos--; break;
		    case 'R': pos++; break;
		    }
		}
		for (int j = 0; j < 20; j++) {
		    boolean wall = j <= d - 2 || j >= d + 2;
		    if (j == pos) {
			System.out.print('V');
			if (wall) {
			    crash = true;
			}
			continue;
		    }
		    if (j == d - 2) {
			System.out.print(']');
			continue;
		    }
		    if (j == d + 2) {
			System.out.print('[');
			continue;
		    }
		    if (wall) {
			System.out.print('-');
		    } else {
			System.out.print(' ');
		    }
		}
		System.out.println('|');
	    }
	    if (crash) {
		System.out.println("Crash!   Game over.");
	    } else {
		System.out.println("Clear!");
	    }
	} catch (IOException e) {
	}
    }
}
