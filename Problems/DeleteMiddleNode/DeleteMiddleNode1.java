package Problems.DeleteMiddleNode;

class ListNode {
  int val;
  ListNode next;
  ListNode() {}
  ListNode(int val) { this.val = val; }
  ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class DeleteMiddleNode1 {
   public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }
        ListNode temp = head, ptemp = null;
        int mid = findMiddle(head);
        for(int i = 0; i < mid - 1; i++){
            ptemp = temp;
            temp = temp.next;
        }
        ptemp.next = temp.next;
        temp = null;
        return head;

        
    }
    int findMiddle(ListNode head){
        ListNode temp = head;
        int mid = 0;
        while(temp!=null){
            mid++;
            temp = temp.next;
        }
        return mid/2 + 1;
    }
    public static void main(String[] args) {
      ListNode head = new ListNode(1);
      head.next = new ListNode(2); 
      head.next.next = new ListNode(3);
      head.next.next.next = new ListNode(4);
      DeleteMiddleNode1 d = new DeleteMiddleNode1();
      ListNode temp = head;
      while(temp!=null){
        System.out.println("{" + temp.val + "}");
        temp = temp.next;
      }
      d.deleteMiddle(head);
      temp = head;
      while(temp!=null){
        System.out.println("{" + temp.val + "}");
        temp = temp.next;
      }
      
    }
    
}
