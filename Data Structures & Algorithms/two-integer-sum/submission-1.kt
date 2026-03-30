class Solution {
   fun twoSum(nums: IntArray, target: Int): IntArray {
    /*
    * define hash
    * */
    val hash: MutableMap<Int, Int> = mutableMapOf()
    for (i in nums.indices){
        hash[nums[i]] =i
    }
    for (i in nums.indices){
        val diff = target- nums[i]
        val hashOp =hash.getOrDefault(diff,-1)
        if (hashOp!=-1 && hashOp!=i)
            return intArrayOf(i,hashOp)

    }
    return intArrayOf()
}
}
