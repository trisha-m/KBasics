//Find the second largest number from the array.

fun main(){

    val arr= arrayOf(1,5,7,8,2,5,7,9)



    println(findSecLargest(arr))


}

fun findSecLargest(ar: Array<Int>): Int{

    var fl= Int.MIN_VALUE
    var sl=Int.MIN_VALUE

    for(i in ar){
        if(i >fl){
            sl=fl
            fl=i
        }else if(i > sl && i !=fl){
            sl=i
        }
    }



    return sl

}