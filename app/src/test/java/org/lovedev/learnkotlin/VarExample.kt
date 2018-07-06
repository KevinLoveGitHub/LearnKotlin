package org.lovedev.learnkotlin

import org.junit.Test

/**
 * @author Kevin
 * @data 2018/7/6
 */
class VarExample {


    @Test
    fun test() {
////        varTest()
////        varTest1()
//        listTest()
//    whenTest("bb")
        rangeTest()
    }

    fun setVar() {
        val a = "1"
        var b: Int = 2
        val c = 3

        // 字符串模板使用变量
        var d = "d $a"

        // 字符串模板中使用任意表达式
        var e = "${a.replace("1", "2")}, $a"
        println(e)

        // 安全的调用，类型后面加上?，表示可空类型
        // ?. 表示安全调用操作符
        var f: String? = "ffff"
        f = null
        println(f?.length)

        // Elvis 操作符
        // ?: 左侧表达式非空，elvis 操作符就返回其左侧表达式，否则返回右侧表达式。 当且仅当左侧为空时，才会对右侧表达式求值
        var g = f?.length ?: -1
        var h = "hello"
        var i = h?.length ?: -1


        // 因为 throw 和 return 在 Kotlin 中都是表达式，所以它们也可以用在 elvis 操作符右侧
        var j = f?.length ?: throw NullPointerException("f is null")
    }

    fun varTest() {
        // !! 非空断言操作符可以将任何值转换为非空类型，若该值为空则抛出异常
        val str: String? = null
        println(str!!.length)
    }

    fun varTest1() {
        // as? 安全的类型转换，如果转换不成功就返回 null
        val var1: String = "var1"
        println(var1 as? String)
        println(var1 as? Int)
    }

    fun listTest() {
        // 可空类型集合，使用 filterNotNull 过滤空值
        val nullableList: List<String?> = listOf("a", "b", null, "c", null, "d")
        val list = nullableList.filterNotNull()
        println(list)
    }

    fun whenTest(str: String) {
        when (str) {
            "a" -> println("str $str")
            else -> {
                println("未匹配到值")
            }
        }

        when {
            str.length == 1 -> println("str $str")
            else -> {
                println("未匹配到值")
            }
        }
    }

    fun rangeTest() {
        val x = 0
        val y = 10
        if (x in 0..y + 1) {
            println(x)
        }

        var list = arrayOf("1")
        var li = listOf<String>("2")
    }

}