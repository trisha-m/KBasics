//Remove duplicates from an array.

fun main(){

    val arr= arrayOf(1,3,4,5,6,2,3,4,5,7)

    val hm= mutableMapOf<Int, Int>()

    val op= mutableListOf<Int>()

    for(i in 0..arr.size-1){

        if(!hm.containsKey(arr[i])){
            op.add(arr[i])
            hm[arr[i]]=1

        }
    }
    println(op)

}