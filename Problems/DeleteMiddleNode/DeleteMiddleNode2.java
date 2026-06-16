package Problems.DeleteMiddleNode;

public class DeleteMiddleNode2 {

    public ListNode deleteMiddle(ListNode head) {
        
        ListNode slow = head , fast = head, prev = null;

        while(fast!=null && fast.next!= null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = slow.next;

        return head;   
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
