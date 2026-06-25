class Solution {
    fun isAnagram(s: String, t: String): Boolean {

       
    val chars = s.toCharArray()
    chars.sort()

    val chars2 =t.toCharArray()
    chars2.sort()


    if(chars.contentEquals(chars2))
    {
        return true
    }
    return false
    
    }
   

    }

