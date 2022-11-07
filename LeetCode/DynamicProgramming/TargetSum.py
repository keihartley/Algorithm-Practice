# You are given an integer array nums and an integer target.

# You want to build an expression out of nums by adding one of the symbols '+' and '-' before each integer in nums and then concatenate all the integers.

# For example, if nums = [2, 1], you can add a '+' before 2 and a '-' before 1 and concatenate them to build the expression "+2-1".
# Return the number of different expressions that you can build, which evaluates to target.

# https://leetcode.com/problems/target-sum/

class Solution:
    def findTargetSumWays(self, nums: List[int], target: int) -> int:
        cache = {}

        def helper(index, total):
            if index == len(nums):
                return 1 if total == target else 0
            if (index, total) in cache: 
                return cache[(index, total)]
            cache[(index, total)] = (
                helper(index + 1, total + nums[index]) + 
                helper(index + 1, total - nums[index]))
            return cache[((index, total))]
        return helper(0, 0)