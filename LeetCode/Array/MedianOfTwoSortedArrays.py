# Given two sorted arrays nums1 and nums2 of size m and n respectively, return 
# the median of the two sorted arrays. The overall run time complexity should 
# be O(log (m+n)).

# https://leetcode.com/problems/median-of-two-sorted-arrays/

class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        mergedArray = nums1 + nums2
        mergedArray.sort()
        # Odd case
        if len(mergedArray) % 2 == 1:
            medianIndex = (len(mergedArray) - 1) // 2
            return mergedArray[medianIndex]
        # Even case
        else:
            medianIndex = (len(mergedArray) - 1) // 2
            return (mergedArray[medianIndex] + mergedArray[medianIndex + 1]) / 2