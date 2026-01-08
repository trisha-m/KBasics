package com.trishala.example.dsa

import androidx.lifecycle.Lifecycle.Event.Companion.downTo
import java.util.Stack

//1.Check if a Given String is Palindrome or not without finding the reverse of the string.

fun isPalindrome(str: String): Boolean {
    var l=0
    var r=str.length-1
    while(l<r){
        if(str[l]!=str[r]){
            return false
        }
        l++
        r--
    }
    return true
}

//2.Count the number of occurrences of each char in the input string.

fun checkCount(str: String): Map<Char, Int> {
    val map = mutableMapOf<Char, Int>()

    for(char in str){
        map[char] = map.getOrDefault(char, 0) + 1
}
    return map
}

//3.Find the most recurring char in the input string.

fun getMostRecurringChar(str: String): Char? {
    if(str.isEmpty()) return null
    val charCount = mutableMapOf<Char, Int>()
    var mostRecurringChar= str[0]
    var maxCount = 0
    for (c in str) {
        val count = charCount.getOrDefault(c, 0) + 1
        charCount[c] = count

        if (count > maxCount) {
            maxCount = count
            mostRecurringChar = c

        }
    }
    return mostRecurringChar

}

//4
fun removeDuplicates(str: String): String {
    val seen = mutableSetOf<Char>()
    val result = StringBuilder()
    for (c in str) {
        if (seen.add(c)) {
            result.append(c)
        }
    }
    println(result)
    return result.toString()
}

//5
fun findNonRepeatingChar(str: String): Char? {
    val charCount = mutableMapOf<Char, Int>()

    for (c in str) {
        charCount[c] = charCount.getOrDefault(c, 0) + 1
    }

    for (c in str) {
        if (charCount[c] == 1) {
            return c
        }


    }
    return null
}

//6Print all the duplicate chars in the input string.

fun printDuplicateChars(str: String): Unit {
    val charCount = mutableMapOf<Char, Int>()

for (c in str) {
    charCount[c] = charCount.getOrDefault(c, 0) + 1
}
    for ((char, count) in charCount) {
        if (count > 1) {
            println("$char: $count")
        }
    }
}

//7Remove characters from the first string which are present in the second string
fun removechar(str: String, str2: String): String {
    val s2=str2.toSet()
    val result = StringBuilder()
    for (c in str){
        if (c !in s2){
            result.append(c)
        }
    }

    return result.toString()

}

//8Check if strings are rotations of each other or not
//did it on  leetcode  796


//9Reverse each word in a given string

fun reverseString(str: String): String{
    val op = StringBuilder()

    for(i in str.length-1 downTo 0){
        op.append(str[i])
    }
    return op.toString()

}


//10.Find the word with the longest length in the given sentence.

fun longestWord(sentence: String): String {
    val words= sentence.split(" ")
    var op=""
    var maxlen=0

    for(word in words){
        val count = word.length
        if(count> maxlen){
            maxlen=count
            op=word
        }
    }
    return op

}

//Program to remove the same consecutive char from the input string.
//E.g. input string: ssuuppperrrrr coooommpuuuuuuuuttttter output should be: super computer

fun removeConChar(str: String): String{
    var op=StringBuilder()
    var stk= Stack<Char>()
    stk.add(str[0])

    for( i in 1 until str.length){
        val top = stk.peek()
        val curr = str[i]

        if (curr != top) {
            stk.push(curr)
        }

    }

    for (ch in stk) op.append(ch)

    return op.toString()
}

//Check whether two strings are anagram of each other.
//Program to group anagram strings.

fun String.lastChar(): Char{
    return this[this.length-1]
}



fun main(){
    val str="madams"
    println(isPalindrome(str))
    val str1="helloc"
    val str2="hheellooz"
    val st3= "Android is the best"
    println(checkCount(str1))
    println(getMostRecurringChar(str1))
    println(removeDuplicates(str1))
    println(findNonRepeatingChar(str2))
    printDuplicateChars(str1)
    println(removechar(str1,str2))
    println(reverseString(st3))
    println(longestWord(st3))
    val st4= "ssuuppperrrrr coooommpuuuuuuuuttttter"
    println(removeConChar(st4))




}


