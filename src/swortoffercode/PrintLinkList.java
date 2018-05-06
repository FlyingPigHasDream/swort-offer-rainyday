package swortoffercode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 从头到尾打印链表
 * 输入一个链表，从尾到头打印链表每个节点的值。
 *
 * 借助栈
 *
 * @author LiaoYangJun
 * @createTime 2018/5/6.
 */
public class PrintLinkList {

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> stack = new Stack<>();

        while (listNode != null) {
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        ArrayList<Integer> list = new ArrayList<>();
        while (!stack.empty()) {
            list.add(stack.pop());
        }
        return list;
    }


    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}

