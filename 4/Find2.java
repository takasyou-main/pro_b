import java.io.*;

public class Find2 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("使用法： java Find1 検索文字列 < 検索対象ファイル");
            System.out.println("例： java Find2 System < Find2.java");
            System.exit(0);
        }
        String findstring = args[0];
        System.out.println("検索文字列は「" + findstring + "」です。");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String line;
            int linenum = 1;
            while ((line = reader.readLine()) != null) {
		boolean isfound=false;
                for(int i=0;i<line.length();i++){isfound=line.startsWith(findstring,i);if(isfound)break;}
		if (isfound) {
                    System.out.println(linenum + ":" + line);
                }
                linenum++;
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

