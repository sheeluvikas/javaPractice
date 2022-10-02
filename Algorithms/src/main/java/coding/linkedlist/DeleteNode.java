package coding.linkedlist;

public class DeleteNode {

    public static void main(String[] args) {
        ListNode node = new ListNode(4,
                        new ListNode(5,
                                new ListNode(1,
                                        new ListNode(9))));

        DeleteNode deleteNode = new DeleteNode();
        deleteNode.deleteNode(node.next);


    }

    public void deleteNode(ListNode node) {
        ListNode nextNode = node.next;
        node.val = nextNode.val;
        node.next = nextNode.next;

        System.out.println(node);
    }
}
