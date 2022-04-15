/*
 * ou are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

 

Example 1:


Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
Example 2:

Input: l1 = [0], l2 = [0]
Output: [0]
Example 3:

Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]
 

Constraints:

The number of nodes in each linked list is in the range [1, 100].
0 <= Node.val <= 9
It is guaranteed that the list represents a number that does not have leading zeros.
 */

//Definition for singly-linked list.

public class AddTwoNumbers {
	
	public static void main(String [] args) {
		ListNode l1= new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);
		
		ListNode l2= new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);	
		
		addTwoNumbers(l1,l2);
		
	}

	public static class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
			this.next = null;
		}

		boolean hasNext(){
			return next != null;
		}

		@Override
		public String toString() {
			return "ListNode [val=" + val + ", next=" + next + "]";
		}
		
	}

	public static void addTwoNumbers(ListNode l1, ListNode l2) {
		int carry = 0;
		boolean isFirstNode = true;
		ListNode masterListNode = new ListNode();
		ListNode headNode = new ListNode();
		while(l1.hasNext() && l2.hasNext()) {
			ListNode finalListNode = new ListNode();			
			
			int totalCountOfNode = l1.val + l2.val + carry;
			
			carry = 0;
			
			if(totalCountOfNode > 10) {
				finalListNode.val = totalCountOfNode % 10;
				carry = totalCountOfNode / 10;
			}else {
				finalListNode.val = totalCountOfNode;
			}
			
			if(!isFirstNode) {
				
				masterListNode.next = finalListNode;
				masterListNode = masterListNode.next;
				
			}else {
				masterListNode = finalListNode;
				headNode = masterListNode;
				
				
			}
			
			
			isFirstNode = false;
		}
		System.out.println(headNode.toString());

	}

}
