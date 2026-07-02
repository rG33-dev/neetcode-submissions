class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        val charSet = HashSet<Char>() // to add differ characters
        var l = 0 //window initialzed
        var count = 0 // 

        for (r in s.indices) {
            while (s[r] in charSet) {
                charSet.remove(s[l])
                l++
            }
            charSet.add(s[r])
             count  = maxOf(count , r - l + 1)
        }
        return count 
    }
}