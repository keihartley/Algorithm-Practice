# There is a function signFunc(x) that returns:

# - 1 if x is positive.
# - -1 if x is negative.
# - 0 if x is equal to 0.
# You are given an integer array nums. Let product be the product of all values in the array nums.

# https://leetcode.com/problems/sign-of-the-product-of-an-array/

class Solution:
    def arraySign(self, nums: List[int]) -> int:
        if 0 in nums: return 0
        return 1 if math.prod(nums) > 0 else -1