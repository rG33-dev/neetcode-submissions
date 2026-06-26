class Solution {
    fun longestConsecutive(nums: IntArray): Int {

        if (nums.isEmpty()) return 0

        nums.sort()

        var count = 1
        var maxCount = 1

        for (i in 0 until nums.size - 1) {

            if (nums[i] == nums[i + 1]) {
                continue
            }

            if (nums[i] + 1 == nums[i + 1]) {
                count++
            } else {
                maxCount = maxOf(maxCount, count)
                count = 1
            }
        }

        return maxOf(maxCount, count)
    }
}