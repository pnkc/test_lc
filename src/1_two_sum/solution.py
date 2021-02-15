from typing import List

class TwoSum:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        d = {}
        print(nums)
        print(target)
        for i,n in enumerate(nums):
            m = target - n
            if m in d :
                return [d[m], i]
            d[n] = i
        return

    # init method or constructor
    def __init__(self, name):
        self.name = name 

p = TwoSum('PNKC')
target = 15
nums = [3, 2, 12, 14, 13]
result = p.twoSum(nums, target)
print( result)

