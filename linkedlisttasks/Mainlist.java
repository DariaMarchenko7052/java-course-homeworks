

import java.util.Collections;
import java.util.LinkedList;

public class Mainlist {

    // Метод для друку списку
    static void printList(ListNode head) {
        ListNode cur = head;
        while (cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Solution sol = new Solution();

        // ---------- Example 1 ----------
        ListNode l1_3 = new ListNode(4);
        ListNode l1_2 = new ListNode(2, l1_3);
        ListNode l1_1 = new ListNode(1, l1_2);

        ListNode l2_3 = new ListNode(4);
        ListNode l2_2 = new ListNode(3, l2_3);
        ListNode l2_1 = new ListNode(1, l2_2);

        ListNode merged1 = sol.mergeTwoLists(l1_1, l2_1);
        System.out.print("Example 1 result: ");
        printList(merged1);


        // ---------- Example 2 ----------
        ListNode merged2 = sol.mergeTwoLists(null, null);
        System.out.print("Example 2 result: ");
        printList(merged2); // виведе просто пустий рядок


        // ---------- Example 3 ----------
        ListNode list2 = new ListNode(0);
        ListNode merged3 = sol.mergeTwoLists(null, list2);
        System.out.print("Example 3 result: ");
        printList(merged3);


        // ---------- Додатково: те саме через LinkedList + Collections ----------

        LinkedList<Integer> a = new LinkedList<>();
        Collections.addAll(a, 1, 2, 4);

        LinkedList<Integer> b = new LinkedList<>();
        Collections.addAll(b, 1, 3, 4);

        a.addAll(b);
        Collections.sort(a);

        System.out.print("LinkedList + Collections result: ");
        for (int x : a) System.out.print(x + " ");
        System.out.println();
    }
}
