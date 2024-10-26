package LinkedList.InterviewQuestions;

import LinkedList.InterviewQuestions.CycleQuestions.ListNode;

public class MergeSort {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }

        ListNode mid = middleNode(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);
    }

    public static ListNode merge(ListNode first, ListNode second) {
        ListNode dummy = first.head;
        Node tail = second.head;

        ListNode ans = new ListNode();

        while(f != null && s != null) {
            if(f.value < s.value) {
                ans.insertLast(f.value);
                f = f.next;
            } else {
                ans.insertLast(s.value);
                s = s.next;
            }
        }

        while(f != null) {
            ans.insertLast(f.value);
            f = f.next;
        }

        while(s != null) {
            ans.insertLast(s.value);
            s = s.next;
        }

        return ans;
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
