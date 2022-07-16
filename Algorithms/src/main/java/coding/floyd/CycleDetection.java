package coding.floyd;

public class CycleDetection {


    public static void main(String[] args) {
        ListNode node = ListNode.getCycledNode(1, -1);
        System.out.println(hasCycle(node));

    }


    public static boolean hasCycle(ListNode head) {

        ListNode slow = head;
        if(slow == null){
            return false;
        }
        ListNode fast = head.next;

        if(fast == null){
            return false;
        }
        while(fast.next != null){
            if(fast == slow){
                return true;
            }
            fast = fast.next.next;
            slow = slow.next;
        }

        return false;
    }
}
