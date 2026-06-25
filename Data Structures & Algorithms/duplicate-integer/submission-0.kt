class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {

        val mp = HashSet<Int>()

        for(num in nums){
        if(mp.contains(num))
        {
            return true
        }
        
            mp.add(num)
        
    
    }
    
    return false
}
}