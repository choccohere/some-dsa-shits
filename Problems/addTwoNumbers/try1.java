package Problems.addTwoNumbers;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        long a, b, res;
        a = b = 0;
        long mul = 1;
        while (l1 != null || l2 != null) {

            if (l1 != null) {
                a = a + l1.val * mul;
                l1 = l1.next;
            }
            if (l2 != null) {
                b = b + l2.val * mul;
                l2 = l2.next;
            }

            mul *= 10;

        }
        res = a + b;
        ListNode head = null;
        ListNode tail = null;
        if (res == 0) {
            ListNode newNode = new ListNode(0);
            return newNode;
        }
        while (res > 0) {
            int r = (int) res % 10;
            ListNode newNode = new ListNode(r);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
            res = res / 10;
        }
        return head;

    }
}