//Find the maximum element in an array.

fun main(){

    val arr= arrayOf(2,4,1,64,4,5,7,9,54)
    var maxE=arr[0]

    fun findmax(ar: Array<Int>): Int {
        for(i in arr){
            if(i>maxE){
                maxE=i
            }

        }
        return maxE
    }

    println(findmax(arr))

}
