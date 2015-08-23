package q01.s2;


public class Solution2 {
    public ListNode addTwoNumbersWithCarryOver(ListNode l1,ListNode l2, int carryOver){
        if (l1 == null) {
            return carryOver == 0 ? l2 : addTwoNumbersWithCarryOver(new ListNode(carryOver), l2,0);
        }

        if (l2 == null) {
            return carryOver == 0 ? l1 : addTwoNumbersWithCarryOver(l1, new ListNode(carryOver),0);
        }

        int sumVal = l1.val + l2.val + carryOver;
        ListNode returnVal = new ListNode(sumVal%10);
        returnVal.next = addTwoNumbersWithCarryOver(l1.next,l2.next, sumVal/10);
        return returnVal;
    }
    public static void main(String[] args){
        Solution2 solution = new Solution2();
        ListNode l1 = new ListNode(2);
        l1.next= new ListNode(3);
        l1.next.next= new ListNode(6);
        ListNode l2 = new ListNode(8);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(7);
        int carryOver = 0;
        ListNode s = solution.addTwoNumbersWithCarryOver(l1, l2,carryOver);
        System.out.println(s);
    }
}
