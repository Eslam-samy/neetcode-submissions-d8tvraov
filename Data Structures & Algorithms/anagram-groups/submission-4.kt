class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
    // make a map with string and list of string
    // where the key is the sorted string and the value is the list of anagrams
    //loop over the list and sort the string and put it in the map as key and it's value is the list of anagramd 
    //appending the new item that will be added
    val map : HashMap<String, MutableList<String>> =hashMapOf()

    for(s in strs){
        val sortedS = s.toCharArray().sorted().joinToString()
        map.getOrPut(sortedS){mutableListOf()}.add(s)
    }
    return map.values.toList()
}
}
