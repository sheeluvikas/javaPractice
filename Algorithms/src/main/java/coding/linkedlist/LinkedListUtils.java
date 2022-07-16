package coding.linkedlist;

public class LinkedListUtils {

    public static void printNodes(ListNode outNode){
        while(outNode.next != null){
            System.out.print(outNode.val + "->");
            outNode = outNode.next;
        }

        System.out.print(outNode.val);
    }
}
