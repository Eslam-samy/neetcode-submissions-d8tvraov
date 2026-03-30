class Solution {
fun firstUniqChar(s: String): Int {
    val characterCount = mutableMapOf<Char,Int>()
    for(char in s){
        characterCount[char] = characterCount.getOrDefault(char,0)+1
    }
    for (i  in s.indices){
        if(characterCount[s[i]]==1){
            return i
        }
    }

    return -1
}
}
