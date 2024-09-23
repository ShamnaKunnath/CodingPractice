import java.util.HashSet;
import java.util.Set;

class ListNode {
	int val;
	ListNode next;
	public ListNode(int val) {
		this.val = val;
		this.next = null;
	}
}

public class Main {
	public boolean hasCycle(ListNode head) {
		ListNode slow = head, fast = head;
		while(fast != null && fast.next != null){
			slow = slow.next;
			fast = fast.next.next;

            if(slow == fast){
                return true;
            } 
		}
		return false;
	}
	public boolean hasCycleBruteForce(ListNode head) {
		ListNode temp = head;
        Set<ListNode> nodeSet = new HashSet<>();
        while(temp != null){
            if(nodeSet.contains(temp)) return true;
            nodeSet.add(temp);
            temp = temp.next;
        }
        return false;
	}
	public static void main(String[] args){
		ListNode head = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode thrid = new ListNode(3);
		ListNode fourth = new ListNode(4);
		ListNode five = new ListNode(5);

		//create list
		head.next = second;
		second.next = thrid;
		third.next = four;
		four.next = five;
		
		//created cycle
		five.next = third;

		if(hasCycle(head)){
			System.out.println("Found cycle in list");
		}
		else {
			System.out.println("Didn't find cycle in list");
		}
	}
}