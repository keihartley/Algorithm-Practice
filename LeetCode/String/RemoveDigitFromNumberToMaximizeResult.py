# You are given a string number representing a positive integer and a character 
# digit. Return the resulting string after removing exactly one occurrence of 
# digit from number such that the value of the resulting string in decimal form 
# is maximized. The test cases are generated such that digit occurs at least once 
# in number.

# https://leetcode.com/problems/remove-digit-from-number-to-maximize-result/

class Solution:
    def removeDigit(self, number: str, digit: str) -> str:
        maxNum = 0
        
        for index, num in enumerate(number):
            if num == digit:
                newNum = int(number[:index] + number[index + 1:])
                maxNum = max(newNum, maxNum)
                
        return str(maxNum)