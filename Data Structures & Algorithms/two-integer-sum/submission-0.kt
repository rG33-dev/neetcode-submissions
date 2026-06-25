class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {

        val bag = HashMap<Int,Int>()

       

        for(i in nums.indices)
        {
        var differ = target - nums[i]
        
        if(bag.containsKey(differ))
        {
            return intArrayOf(bag[differ]!!, i )
        }
        bag [nums[i]] = i
        
        }
        return intArrayOf()
    


    }
}
