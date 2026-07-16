class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        
         var map = HashMap<Int,Int>()

         for(i in numbers.indices){
            val differ = target- numbers[i]

            if(map.containsKey(differ)){
            
                return intArrayOf(map[differ]!!+1,i+1)
            }


            map[numbers[i] ] = i
         }

         return intArrayOf()
}


           
          
        }
    