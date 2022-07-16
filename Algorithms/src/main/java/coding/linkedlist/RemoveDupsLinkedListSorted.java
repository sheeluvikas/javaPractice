package coding.linkedlist;

public class RemoveDupsLinkedListSorted {

    public static void main(String[] args) {
        ListNode node4 = new ListNode(1,
                new ListNode(1,
                        new ListNode(1,
                                new ListNode(1,
                                        new ListNode(2,
                                                new ListNode(3))))));

        printNodes(node4);

        System.out.println("************");
        ListNode outNode = deleteDuplicates(node4);
        while(outNode != null){
            System.out.println(outNode.val);
            outNode = outNode.next;
        }

    }

    public static ListNode deleteDuplicates(ListNode head){
        if(head == null){
            return null;
        }

        if(head.next != null) {
            if (head.next.val == head.val) {
                head.next = head.next.next;
                deleteDuplicates(head);
            } else {
                deleteDuplicates(head.next);
            }

        }
        return head;
    }


    public static void printNodes(ListNode outNode){
        while(outNode != null){
            System.out.println(outNode.val);
            outNode = outNode.next;
        }
    }

}
