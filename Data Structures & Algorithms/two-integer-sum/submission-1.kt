class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {

        val map = HashMap<Int, Int>()

        for (i in nums.indices) {
            val answer = target - nums[i]

            if (map.containsKey(answer)) {
                return intArrayOf(map[answer]!!, i)
            }

            map[nums[i]] = i
        }

        return intArrayOf()
    }
}