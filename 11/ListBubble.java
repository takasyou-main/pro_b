// ListBubble.java
class ListBubble
{
    public static void main (String[] args)
    {
	ListString head;

	System.out.println("Before sorting");
	head = ListString.FileRead();
	ListString.Display(head);

	System.out.println("After sorting");
	head = ListString.BubbleSort(head);
	ListString.Display(head);
    }
}
