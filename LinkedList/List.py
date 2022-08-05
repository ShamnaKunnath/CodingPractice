class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
        
    def __str__(self):
        l=[]
        head=self
        while head:
            l.append(head.val)
            head=head.next
        return str(l)
        
class LinkedList:
    def __init__(self,head=None):
        self.head=head
    
    def push(self,val):
        node=ListNode(val)
        node.next=self.head
        self.head=node
    def __str__(self):
        l=[]
        head=self.head
        while head:
            l.append(head.val)
            head=head.next
        return str(l)
