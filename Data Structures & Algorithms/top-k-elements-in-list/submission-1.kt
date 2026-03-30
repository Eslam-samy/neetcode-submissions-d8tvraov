class Solution {
   fun topKFrequent(nums: IntArray, k: Int): IntArray {

    val map = hashMapOf<Int,Int>()
    for (i in nums){
        map[i]=map.getOrDefault(i,0)+1
    }
    val sortedMapList = map.toList().sortedByDescending { it.second }
    val op = IntArray(k)
    for (i in 0 until k)
        op[i]=sortedMapList[i].first

    return op
}
}
