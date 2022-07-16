package coding.linkedlist;

public class ReverseLinkedList {

    public static void main(String[] args) {
        ListNode node4 = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5,
                                                new ListNode(6))))));

        LinkedListUtils.printNodes(node4);

        System.out.println();
        LinkedListUtils.printNodes(reverseBetween(node4, 0, 0));

    }

    public static ListNode reverseBetween(ListNode head, int left, int right) {

        ListNode current = head;
        ListNode previous = null;

        while(current != null){

            ListNode temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
        }

        return previous;
    }


}
