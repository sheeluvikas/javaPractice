package coding.floyd;

public class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }


    public static ListNode getCycledNode(int size, int cycleNode){

        ListNode listNode = new ListNode(1);
        ListNode head = listNode;
        ListNode lastNode = null;
        for(int i = 0; i < size ; i ++){
            ListNode listNode1 = new ListNode(i + 2);
            listNode.next = listNode1;
            listNode = listNode.next;
            lastNode = listNode1;
        }

        ListNode node = head;
        int x = 0;
        while(x < cycleNode){
            node = node.next;
            x ++;
        }

        if(cycleNode >= 0) {
            lastNode.next = node;
        }

        return head;
    }

    public static void printListNode(ListNode node){
        int x = 0;
        while(node.next != null){
            System.out.print( node.val + " -> ");
            node = node.next;
            x ++;
            if(x == 10){
                break;
            }
        }
    }
}
