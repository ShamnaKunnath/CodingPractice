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

	public boolean detectCycleOptimal(ListNode head) {
		ListNode slow = head, fast = head;
        
        if(head == null || head.next == null){
        	return null;
        }
        slow = slow.next;
        fast = fast.next.next;

        while(fast != null && fast.next != null && slow != fast){
        	slow = slow.next;
        	fast = fast.next.next;
        }
        if(fast == null || fast.next != null){
        	return null;
        }
        else {
        	slow = head;
        	while(slow != fast){
        		slow = slow.next;
        		fast = fast.next;
        	}
        	return slow;
        }

	}

	public boolean detectCycleBruteForce(ListNode head) {
		ListNode temp = head;
        Set<ListNode> nodeSet = new HashSet<>();
        while(temp != null){
            if(nodeSet.contains(temp)){
                return temp;
            }
            nodeSet.add(temp);
            temp = temp.next;
        }
        return temp;
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
		ListNode cycle = detectCycleBruteForce(head);
		System.out.print("Found cycle in list at node");
		System.out.print(cycle.val);
		
	}
}