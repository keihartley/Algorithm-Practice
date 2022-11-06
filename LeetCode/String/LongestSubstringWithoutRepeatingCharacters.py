# Given a string s, find the length of the longest substring without repeating characters.

# https://leetcode.com/problems/longest-substring-without-repeating-characters/

class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        collect = set()
        l = 0
        result = 0
        
        for r in range(len(s)):
            # print(collect, s[r], l, r, result)
            while s[r] in collect:
                collect.remove(s[l])
                l += 1
            collect.add(s[r])
            result = max(result, r - l + 1)
        return result

# Console:
# set() a 0 0 0
# {'a'} b 0 1 1
# {'b', 'a'} c 0 2 2
# {'b', 'c', 'a'} a 0 3 3
# {'b', 'c', 'a'} b 1 4 3
# {'b', 'c', 'a'} c 2 5 3
# {'b', 'c', 'a'} b 3 6 3
# {'b', 'c'} b 5 7 3