package org.lovedev.learnkotlin

import org.junit.Test

/**
 * @author Kevin
 * @data 2018/7/6
 */
class LabelExample {
    fun lableTest() {
        start@ for (i in 1..100) {
            if (1 < 90) {

            }
        }
    }

    fun labelTest1() {
        listOf<Int>(1, 2, 3, 4, 5).forEach {
            if (it == 2) {
                return
            }
            println(it)
        }
        println("method destroy")
    }

    fun labelTest2() {
        listOf<Int>(1, 2, 3, 4, 5).forEach {
            if (it == 4) {
                return@forEach
            }
            print(it)
        }
        println("method destroy")
    }

    fun labelTest3() {
        listOf<Int>(1, 2, 3, 4, 5).forEach fore@{
            if (it == 4) {
                return@fore
            }

            print(it)
        }
        println("method destroy")
    }

    @Test
    fun test() {
//        var i = lableTest()
//        println(i)
        labelTest1()
        labelTest2()
        labelTest3()

    }
}