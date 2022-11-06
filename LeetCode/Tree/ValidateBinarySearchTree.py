# Given the root of a binary tree, determine if it is a valid binary search tree (BST).

# A valid BST is defined as follows:
# - The left subtree of a node contains only nodes with keys less than the node's key.
# - The right subtree of a node contains only nodes with keys greater than the node's key.
# - Both the left and right subtrees must also be binary search trees.

# https://leetcode.com/problems/validate-binary-search-tree/

# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isValidBST(self, root: Optional[TreeNode]) -> bool:
        # lt, rt: left & right bounds respectively
        def helper(node, lt, rt):
            # empty search tree still a proper tree
            if not node: return True
            
            # node val is less than right boundry and more than left boundary
            # if not, return False
            if not (node.val < rt and node.val > lt): return False
            
            # node.left & node.right: right & left boundary updated to parent val, respectively
            # both left and right sub trees are checked, returns true if both goes through the
            # tree nodes with no issues
            return (helper(node.left, lt, node.val) and helper(node.right, node.val, rt))
        
        return helper(root, float("-inf"), float("inf"))