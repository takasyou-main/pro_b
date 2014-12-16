// ListString.java
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
class ListString
{
    static int numOfElements = 0;
    int id;
    String name;
    ListString next;

    // Constructor
    ListString(String name, ListString tail) {
	this.id = numOfElements;
	this.name = new String(name); 
	this.next = tail;

	numOfElements++;
    }

    static ListString Insert(String s, ListString tail) {
	return new ListString(s, tail);
    }
    static ListString FileRead() {
	try {
	    ListString head=null;
	    File file = new File("strings.txt");
	    BufferedReader br = new BufferedReader(new FileReader(file));
	    while (true) {
		String str = br.readLine();
		if (str == null) break;
		head=Insert(str,head);

	    }
	    br.close();
	    return head;
	} catch(FileNotFoundException e){
	    System.out.println(e);
	    return null;
	} catch(IOException e){
	    System.out.println(e);
	    return null;
	}
    }


    static void Display(ListString element) {
	while (element != null) {
	    System.out.print(element.name+"[" + element.id + "]"+"-->");
	    element = element.next;
	}
	System.out.println("null");
    }

    // Q1
    static int length(ListString element) {
	int result=0;
	if(element==null)return 0;
	return 1+length(element.next);
    }

    // Q2
    static void DisplayReverse(ListString element){
	if(element.next==null) System.out.print("null");
	else DisplayReverse(element.next);		
	System.out.print("<--"+element.name+"["+element.id+"]");
    }

    // Q3
    static void Search(String query, ListString head){
	if(head==null)System.out.println("[Search] not found: "+query);
	else if(query.equals(head.name))System.out.println("[Search] found: "+head.name+"["+head.id+"]");
	else Search(query,head.next);
    }

    // Q4
    static ListString Delete(String s, ListString head)
    {
	if(head==null)return null;
	if(s.equals(head.name))return head.next;
	if(head.next==null){
	    System.out.println("not found: "+s);
	    return head;
	}
	ListString next=head.next;
	if(s.equals(next.name)){
	    System.out.println("found");
	    head.next=next.next;
	    return head;
	}else{

	    head.next=Delete(s,head.next);
	    return head;
	}
    }
    static ListString BubbleSort(ListString head){
	boolean needNextPass = true;
	for(int k=1;k<length(head)&&needNextPass;k++){
	    needNextPass=false;
	    for(int i=0;i<length(head)-k;i++){
		if(i==0)
		previous=get(head,i-1)
		now=previous.next;
		next=now.next;
		if(now.name.comperTo(now.next.name)){
		    now.next=next.next;
		    previous.next=next;
		    needNextPass=true;
		}
	    }
	}
    }
    

    static ListString get(ListString head, int index){
	if(index!=0){
	    index--;
	    return get(head.next,index);
	}
    }
    static ListString DeleteDisplay(String string, ListString head)
    {
	System.out.println("[Delete] " + string);
	head = ListString.Delete(string, head); // head
	ListString.Display(head);
	System.out.println("#Elements: " + ListString.length(head));

	return head;
    }
}

