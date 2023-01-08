//83. Remove Duplicates from Sorted List
/* 
package mainjava;

public class Problem_17_leet_83 {
    public static void main(String[] args) {

    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode node = head;
        while (node.next != null) {
            if (node.val != node.next.val) {
                node = node.next;
            } else {
                node.next = node.next.next;
            }
        }
        return head;
    }
}
*/