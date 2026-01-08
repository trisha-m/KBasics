//Find the minimum element in an array

fun main(){

    val arr= arrayOf(2,4,1,64,4,5,7,9,54, -6)
    var minE=arr[0]

    fun findmin(ar: Array<Int>): Int {
        for(i in arr){
            if(i <minE){
                minE=i
            }

        }
        return minE
    }

    println(findmin(arr))

}