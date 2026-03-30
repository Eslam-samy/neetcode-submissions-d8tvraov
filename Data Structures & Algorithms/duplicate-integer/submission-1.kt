class Solution {
   fun hasDuplicate(nums: IntArray): Boolean {
    val data : MutableSet<Int> = mutableSetOf()
    for (i in nums.indices){
        if (!data.add(nums[i]))
            return true
    }
    return false
}
}
