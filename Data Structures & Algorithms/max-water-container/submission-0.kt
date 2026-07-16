class Solution {
    fun maxArea(heights: IntArray): Int {

        var left = 0 
        var right  = heights.lastIndex
        var answer = 0

        while(left < right)
        {
            val width = right - left 

            val minLength = minOf(heights[left] , heights[right])


            answer = maxOf(answer,width*minLength)

            if(heights[left] < heights[right]) 
            {
                left++
            }
            else{
                right--
            }
        }
        return answer


    }
}
