package q01.s1;


class Solution1 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode c1 = l1;
        ListNode c2 = l2;
        ListNode sentinel = new ListNode(0);
        ListNode d = sentinel;
        int sum = 0;
        while (c1 != null || c2 != null) {
            sum /= 10;
            if (c1 != null) {
                sum += c1.val;
                c1 = c1.next;
            }
            if (c2 != null) {
                sum += c2.val;
                c2 = c2.next;
            }
            d.next = new ListNode(sum % 10);
            d = d.next;
        }
        if (sum / 10 == 1)
            d.next = new ListNode(1);
        return sentinel.next;
    }

    public static void main(String[] args){
        Solution1 solution = new Solution1();
        ListNode l1 = new ListNode(2);
        l1.next= new ListNode(3);
        l1.next.next= new ListNode(6);
        ListNode l2 = new ListNode(8);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(7);
        ListNode s = solution.addTwoNumbers(l1, l2);
        System.out.println(s);
        int a =21;
        int b =10;
        System.out.println(a/b);
        System.out.println(a%b);
    }
}
