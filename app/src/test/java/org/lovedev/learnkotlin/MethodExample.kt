package org.lovedev.learnkotlin

import android.app.Activity
import android.widget.Toast
import org.junit.Test

/**
 * @author Kevin
 * @data 2018/7/6
 */
class MethodExample {

    @Test
    fun sum1Test() {
        sum1(1, 2)
    }

    // 两个 int 参数
    fun sum1(x: Int, y: Int) {
        println(x + y)
    }

    // 两个 int 参数，返回值也为 int
    fun sum2(x: Int, y: Int): Int {
        return x + y
    }

    // 单表达式函数，自动推断返回值
    fun sum3(x: Int, y: Int) = x + y
    fun sum4(x: String, y: String) = x + y

    // 带有默认值的函数
    fun sum5(x: Int, y: Int = 2) = x * y

    // 如果默认参数在无默认参数之前，需要使用命名参数调用：sum5_1(y = 18)
    fun sum5_1(x: Int = 2, y: Int) = x * y

    // 所有位置参数都要放在第一个命名参数之前。例如，允许调用 sum5_2(1, y = 2) 但不允许 sum5_2(x = 1, 2)
    fun sum5_2(x: Int = 2, y: Int = 3) = x * y

    // vararg 修饰的参数是可变长参数，通过使用星号操作符将可变数量参数以命名形式传入
    // var array = arrayOf("a", "b", "c")
    // sum6(*array)
    fun sum6(vararg str: String?) = str.forEach {
        println(it)
    }

    // 函数作为参数
    fun sum7() {
        println("7 + 8 = ${sum2(7,8)}")
    }

    // Unit 对应 Java 中的 void，Unit 可以直接省略
    fun sum8(x: Int, y: Int): Unit {
        println(x + y)
    }

    // infix 表示中缀表示法，需要满足以下条件：
    // 1. 必须是成员函数或扩展函数
    // 2. 必须只有一个参数
    // 3. 参数不能有默认值，且不可是可变长参数
    // 中缀函数优先级低于算术操作符，类型转换和 rangeTo 操作符
    // 中缀函数优先级高于 && || is- in-
    infix fun Int.sum(x: Int) = this + x

    // 扩展函数可以给已有对象动态添加函数
    fun Activity.toast(message: CharSequence, duration: Int = Toast.LENGTH_SHORT) {
        Toast.makeText(this, message, duration).show()
    }

    // 局部函数：就是函数内部可以再有一个函数
    fun sum10(x: Int):Int {
        val y = 110
        fun sum11(z: Int):Int {
            return y * z
        }
        return sum11(x)
    }

    @Test
    fun sumTest() {
        println(sum4("hello", "world"))
        println(sum5(5))
        sum6("1","2","3")
        var array = arrayOf("a", "b", "c")
        sum6(*array)
        sum7()
        println(sum5_1(y = 18))
        println(2 sum 8)
        println(sum10(3))
    }
}