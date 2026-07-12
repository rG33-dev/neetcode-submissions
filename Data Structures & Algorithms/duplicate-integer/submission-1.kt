class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {

        val box = HashSet<Int>()

        for(num in nums){
        if(box.contains(num))
        {
            return true
        }
        
            box.add(num)
        
    
    }
    
    return false
}
}