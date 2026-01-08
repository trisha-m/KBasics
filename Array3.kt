//Merge two arrays to form a third array e.g. First array: 10, 50, 20, 30, 70, 80, 40
//Second array: 25, 75, 5, 25
//Merged array should be: 10, 25, 50, 75, 20, 5, 30, 25, 70, 80, 40

fun main(){
    val arr1= arrayOf(10, 50, 20, 30, 70, 80, 40)
    val arr2= arrayOf(25, 75, 5, 25)

    val op= arr1 +arr2

    val mergedArr=arr1.plus(arr2)

    val op2= arr1.toMutableList()
    op2.addAll(arr2)

//    println(op.joinToString())
//    println(mergedArr.joinToString())
//    println(op2.joinToString())

    val all= arrayOf(arr1,arr2)
    val op3=all.flatMap{it.asList()}
    println(op3)
}
