# Given a string s which consists of lowercase or uppercase letters, 
# return the length of the longest palindrome that can be built with 
# those letters. Letters are case sensitive, for example, "Aa" is not
# considered a palindrome here.

# https://leetcode.com/problems/longest-palindrome/?envType=study-plan&id=level-1

class Solution:
    def longestPalindrome(self, s: str) -> int:
        letterSet = set()
        length = 0
        # Loops through the given string
        for letter in s:
            # Adds two to the length if the letter is already stored
            # in the letterSet & removes the letter from the set
            if letter in letterSet:
                length += 2
                letterSet.remove(letter)
            else:
                letterSet.add(letter)
        
        # Odd & Even case
        # If there is still a stored value, return length + 1
        # Else, return the length
        return length + 1 if len(letterSet) > 0 else length