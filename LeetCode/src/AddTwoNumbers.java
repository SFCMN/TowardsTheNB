
 class ListNode {
  int val;
  ListNode next;
  ListNode() {}
  ListNode(int val) { this.val = val; }
  ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class AddTwoNumbers {
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    int carry = 0;
    ListNode currentL1Node = l1;
    ListNode currentL2Node = l2;

    ListNode pre = new ListNode();
    ListNode currentResultNode = pre;

    while (currentL1Node != null || currentL2Node != null || carry > 0) {
      currentResultNode.next = new ListNode();
      currentResultNode = currentResultNode.next;
      int l1Val = currentL1Node == null ? 0 : currentL1Node.val;
      int l2Val = currentL2Node == null ? 0 : currentL2Node.val;

      int sum = carry + l1Val + l2Val;

      currentResultNode.val = sum > 9 ? sum - 10 : sum;
      carry = sum > 9 ? 1 : 0;

      currentL1Node = currentL1Node == null ? null : currentL1Node.next;
      currentL2Node = currentL2Node == null ? null : currentL2Node.next;
    }

    return pre.next;
  }

  public static void main(String[] args) {
    ListNode l1 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))));
    ListNode l2 = new ListNode(9, new ListNode(9, new ListNode(9)));

    final AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
    ListNode result = addTwoNumbers.addTwoNumbers(l1, l2);

    while(result != null) {
      System.out.println(result.val);
      result = result.next;
    }
  }
}
