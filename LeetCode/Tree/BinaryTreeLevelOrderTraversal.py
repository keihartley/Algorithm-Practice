# Given the root of a binary tree, return the level order traversal of its 
# nodes' values. (i.e., from left to right, level by level).

# https://leetcode.com/problems/binary-tree-level-order-traversal/

# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        res = []
        if not root: return res
        q = collections.deque()
        q.append(root)
        
        while q:
            qLength = len(q)
            level = []
            for i in range(qLength):
                node = q.popleft()
                if node:
                    level.append(node.val)
                    q.append(node.left)
                    q.append(node.right)
            if level: res.append(level)
        
        return res