
package list;

public class ListNode {
    private int data;
    private ListNode next;

    public ListNode(){
        this.next = null;
    }
    public ListNode(int data){
        this.data = data;
        this.next = null;
    }

    public int showData(){
        return this.data;
    }
}
