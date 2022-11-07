# The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci 
# sequence, such that each number is the sum of the two preceding ones, starting from 
# 0 and 1. That is,

# F(0) = 0, F(1) = 1
# F(n) = F(n - 1) + F(n - 2), for n > 1.
# Given n, calculate F(n).

# https://leetcode.com/problems/fibonacci-number/

class Solution:
    # recursive solution
    def fib(self, n: int) -> int:
        if n <= 1:
            return n
        
        return self.fib(n - 1) + self.fib(n - 2)

    # recursive solution
    def fib(self, n: int) -> int:
        if n <= 1:
            return n
        
        cache = [0] * (n + 1)
        cache[1] = 1
        for i in range(2, n + 1):
            cache[i] = cache[i - 1] + cache[i - 2]
        
        return cache[n]

    def fib(self, n: int) -> int:
        cache = {0: 0, 1: 1}

        if n in cache[n]:
            return cache[n]
        
        cache[n] = self.fib(n - 1) + self.fib(n - 2)
        return cache[n]