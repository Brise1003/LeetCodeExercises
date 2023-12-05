import java.security.spec.RSAOtherPrimeInfo;
import java.sql.Array;
import java.util.ArrayList;

public class ListNode<T> {

    public static void main(String[] args) {
        ListNode x3 = new ListNode(3, null);
        ListNode x2 = new ListNode(4, x3);
        ListNode l1 = new ListNode(2, x2);

        ListNode y3 = new ListNode(4, null);
        ListNode y2 = new ListNode(6, y3);
        ListNode l2 = new ListNode(5, y2);

        Solution.addTwoNumbers(l1, l2);

    }

    private int val;
    private ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    //    You are given two non-empty linked lists representing two non-negative integers.
//    The digits are stored in reverse order, and each of their nodes contains a single digit.
//    Add the two numbers and return the sum as a linked list.
//    You may assume the two numbers do not contain any leading zero, except the number 0 itself.
//    Input: l1 = [2,4,3], l2 = [5,6,4]
//    Output: [7,0,8]
//    Explanation: 342 + 465 = 807.
    static class Solution {
        public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode t = new ListNode(0);
            ListNode last = t;

            int carry = 0;

            while( l1 != null || l2 != null){
                int sum = 0 + carry;

                if(l1 != null){
                    sum +=l1.val;
                    l1 = l1.next;
                }
                if(l2 != null){
                    sum += l2.val;
                    l2 = l2.next;
                }
                carry = sum / 10;
                sum = sum % 10;
                last.next = new ListNode(sum);
                last = last.next;


            }
            if (carry == 1) last.next = new ListNode(1);

            return t.next;
        }


    }
}
