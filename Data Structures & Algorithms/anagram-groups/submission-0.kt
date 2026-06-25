class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {

       val map = HashMap<String, MutableList<String>>()

        for (word in strs) {

    val chars = word.toCharArray()
    chars.sort()

    val key = String(chars)

    if (!map.containsKey(key)) {
        map[key] = mutableListOf()
    }

    map[key]!!.add(word)
}   
   return  map.values.toList()


    }
}
