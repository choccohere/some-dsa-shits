package Problems.addTwoNumbers;

import java.math.BigInteger;


public class try2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ZERO;
        BigInteger mul = BigInteger.ONE;

        while (l1 != null || l2 != null) {

            if (l1 != null) {
                a = a.add(mul.multiply(BigInteger.valueOf(l1.val)));
                l1 = l1.next;
            }

            if (l2 != null) {
                b = b.add(mul.multiply(BigInteger.valueOf(l2.val)));
                l2 = l2.next;
            }

            mul = mul.multiply(BigInteger.TEN);
        }

        BigInteger res = a.add(b);

        // Edge case
        if (res.equals(BigInteger.ZERO)) {
            return new ListNode(0);
        }

        ListNode head = null, tail = null;

        while (res.compareTo(BigInteger.ZERO) > 0) {

            int digit = res.mod(BigInteger.TEN).intValue();

            ListNode newNode = new ListNode(digit);

            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }

            res = res.divide(BigInteger.TEN);
        }

        return head;
    }
}
