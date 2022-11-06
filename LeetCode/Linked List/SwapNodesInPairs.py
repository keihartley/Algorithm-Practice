# Given a linked list, swap every two adjacent nodes and return its head. You 
# must solve the problem without modifying the values in the list's nodes 
# (i.e., only nodes themselves may be changed.)

# https://leetcode.com/problems/swap-nodes-in-pairs/

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def swapPairs(self, head: Optional[ListNode]) -> Optional[ListNode]:
        dummy = ListNode(0, head)
        prev, curr = dummy, head
        
        while curr and curr.next:
            nxt = curr.next.next
            temp = curr.next
            
            temp.next = curr
            curr.next = nxt
            prev.next = temp
            
            print(prev)
            prev = curr
            print(prev)
            curr = nxt
        
        return dummy.next
        
        