//Merge two sorted array to form third sorted array:
//e.g. First Array: 10, 28, 50, 75, 80, 95, 100
//Second array: 35, 60, 70, 78
//Expected Merged sorted array: 10, 28, 35, 50, 60, 70, 75, 78, 80, 95, 100

fun main(){

    val arr1= arrayOf(10, 28, 50, 75, 80, 95, 100)
    val arr2= arrayOf(35, 60, 70, 78)
    val op= arrayOf<Int>()


    mergedSorted(arr1,arr2)

}