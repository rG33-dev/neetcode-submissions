class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {

        val mp = HashMap<Int,Int>()

        for(i in numbers.indices)
        {
            val  differ = target - numbers[i]

            if(mp.containsKey(differ))
            {
                return intArrayOf(mp[differ]!!+1
                ,i+1)
            }
            mp[numbers[i]] = i
        }
        return intArrayOf()

    }
}
