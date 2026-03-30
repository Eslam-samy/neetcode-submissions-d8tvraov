class Solution {
    fun reverseString(s: CharArray) {
    val temp = CharArray(s.size)
    val size = s.size
    for (i in size-1 downTo 0){
        temp[size-i-1] = s[i]
    }
    for (i in temp.indices){
        s[i] = temp[i]
    }
    print(temp)
    print(s)
}
}
