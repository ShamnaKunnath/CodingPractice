# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def getDecimalValue(self, head: ListNode) -> int:
        curr=head
        c=-1
        while curr:
            c+=1
            curr=curr.next
        res=0
        while head:
            res+=head.val*(2**c)
            head=head.next
            c-=1
        return res
