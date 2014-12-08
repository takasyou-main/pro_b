import java.io.*;

public class StringSort {
    final static int MAXLINE=1000;
    static int test=0;
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String line;
            int linenum = 0;
	    String[] tmp_text= new String[MAXLINE];
            while ((line = reader.readLine()) != null) {
		tmp_text[linenum]=line;
		linenum++;
            }
	    String[] text = new String[linenum];
	    for(int i=0;i<linenum;i++)text[i]=tmp_text[i];
	    quickSort(text,0,text.length-1);
	    for(String data : text)System.out.println(data);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    public static void quickSort(String[] a,int l,int r){
	int pivotPos = l;
	int pre_r=r;
	int pre_l=l;
	if(l!=r){
	    while(l<=r){
		if(a[l].compareTo(a[pivotPos])<=0)l++;
		else if(a[r].compareTo(a[pivotPos])>0)r--;
		else swap(a,l,r);
	    }
	    swap(a,pivotPos,r);

	    quickSort(a,pivotPos,r);
	    quickSort(a,r+1,pre_r);
	}
    }
    public static void swap(String[] a,int x,int y){
	String tmp=a[x];
	a[x]=a[y];
	a[y]=tmp;
    }
}
