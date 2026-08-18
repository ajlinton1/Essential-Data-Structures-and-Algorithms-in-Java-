package chapter2;

public class MergeSortedLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode returnNode = null;
        if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        }
        if (list1.val < list2.val) {
            returnNode = list1;
            returnNode.next = mergeTwoLists(list1.next, list2);
        } else {
            returnNode = list2;
            returnNode.next = mergeTwoLists(list1, list2.next);
        }
        return returnNode;
    }

}
