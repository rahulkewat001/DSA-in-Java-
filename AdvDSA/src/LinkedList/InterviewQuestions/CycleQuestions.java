package LinkedList.InterviewQuestions;

import org.w3c.dom.Node;

import LinkedList.LL;

public class CycleQuestions {

    class ListNode {
        int val;
        ListNode next;

        public ListNode() {
            
        }

        public ListNode(int value) {
            this.val = value;
        }

        public ListNode(int value, ListNode next) {
            this.val = value;
            this.next = next;
        }
    }

    // Amazon and Microsoft
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && slow != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) {
                return true;
            }
        }
        return false;
    }

    // find length of cycle
    public int lengthCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && slow != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) {
                // calculate the length
                ListNode temp = slow;
                int length = 0;
                do {
                    temp = temp.next;
                    length++;
                } while (temp != slow);
                return length;
            }
        }
        return 0;
    }

    public ListNode middleNode(ListNode head) {
        ListNode s = head;
        ListNode f = head;

        while(f != null && f.next != null) {
            s = s.next;
            f= f.next.next;
        }
        return s;
    }
    
}
