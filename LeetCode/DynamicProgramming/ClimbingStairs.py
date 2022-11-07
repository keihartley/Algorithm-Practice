# You are climbing a staircase. It takes n steps to reach the top.

# Each time you can either climb 1 or 2 steps. In how many distinct ways can 
# you climb to the top?

# https://leetcode.com/problems/climbing-stairs/

from functools import lru_cache
class Solution:
    @lru_cache(None)
    
    def climbStairs(self, n: int) -> int:
        if n == 1: 
            return 1
        elif n == 2: 
            return 2
        else: 
            return self.climbStairs(n - 1) + self.climbStairs(n - 2)