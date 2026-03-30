class Solution {
   fun hasDuplicate(nums: IntArray): Boolean {
    val data : HashSet<Int> = hashSetOf()
    for (i in nums.indices){
        if (!data.add(nums[i]))
            return true
    }
    return false
}
}
