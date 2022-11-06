# Given a string containing digits from 2-9 inclusive, return all possible letter 
# combinations that the number could represent. Return the answer in any order. A 
# mapping of digits to letters (just like on the telephone buttons) is given below. 
# Note that 1 does not map to any letters.

# https://leetcode.com/problems/letter-combinations-of-a-phone-number/

class Solution:
    def letterCombinations(self, digits: str) -> List[str]:
        output = []
        hashMap = {
            "1": "",
            "2": "abc",
            "3": "def",
            "4": "ghi",
            "5": "jkl",
            "6": "mno",
            "7": "pqrs",
            "8": "tuv",
            "9": "wxyz"
        }
        
        def builder(i, current):
            if len(current) == len(digits):
                output.append(current)
                return
            for ch in hashMap[digits[i]]:
                builder(i + 1, current + ch)
        
        if digits:
            builder(0, "")
        return output