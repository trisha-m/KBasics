


fun main(){

    val arr= arrayOf(1,5,7,8,2,5,7,9)



    println(findSecSmall(arr))


}

fun findSecSmall(ar: Array<Int>): Int{

    var fs= Int.MAX_VALUE
    var ss=Int.MAX_VALUE

    for(i in ar){
        if(i < fs){
            ss=fs
            fs=i
        }else if(i < ss && i !=fs){
            ss=i
        }
    }



    return ss

}