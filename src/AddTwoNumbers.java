public class AddTwoNumbers {
    static class ListNode { int val; ListNode next; ListNode(int v){val=v;} }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0), p = dummy;
        int carry=0;
        while (l1!=null || l2!=null || carry!=0) {
            int s = carry + (l1!=null?l1.val:0) + (l2!=null?l2.val:0);
            carry = s/10;
            p.next = new ListNode(s%10);
            p = p.next;
            if (l1!=null) l1=l1.next;
            if (l2!=null) l2=l2.next;
        }
        return dummy.next;
    }
}
