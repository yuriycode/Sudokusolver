@file:JvmName("Main") // анотація
package com.yuricode.sudokusolver // пакет

fun main() {
    val firstArray = arrayOf(1,2,5,10)

    val modifiedArray = firstArray.map { number -> number * 10 }.toIntArray()

    println(modifiedArray.contentToString())
}