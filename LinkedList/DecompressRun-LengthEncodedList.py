class Solution:
    def decompressRLElist(self, nums: List[int]) -> List[int]:
        res=[]
        i=0
        while i<len(nums):
            for j in range(nums[i]):
                res.append(nums[i+1])
            i+=2
        return res
