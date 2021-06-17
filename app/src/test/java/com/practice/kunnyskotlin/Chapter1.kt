package com.practice.kunnyskotlin

import android.view.View
import android.widget.Toast
import org.junit.Test

class Chapter1 {

    @Test
    fun sample1() {
        val name = "John Doe"
        val integer = Integer(5)
        println("$name $integer")

        val foo: String? = null
        val bar: String = "bar"
    }

    @Test
    fun sample2() {
        val foo: String = "Foo"
//        foo = "foo"

        var bar: String = "Bar"
        bar = "bar"
    }

    @Test
    fun sample3() {
        val immutable: List<String> = listOf("foo", "bar", "baz")
//        immutable.add("Foo")
        val mutable: MutableList<String> = mutableListOf("foo", "bar", "baz")
        mutable.add("Foo")
    }

    @Test
    fun sample4() {
        val view = View(null)
        view.setOnClickListener {
            Toast.makeText(it.context, "Click", Toast.LENGTH_SHORT).show()
        }
    }

    @Test
    fun sample5() {
        val items = listOf(10, 2, 3, 5, 6)

        val sumOfEvens = items.filter { it % 2 == 0 }.sum()
        println(sumOfEvens)
    }

    fun greet(name: String) : Unit {
        println("Hello, $name!")
    }

    fun sum(a: Int, b: Int) : Int {
        return a + b
    }

    fun countItems(count: Int) {
        when(count) {
            1 -> println("There is $count item.")
            else -> println("There are $count items.")
        }
    }

    @Test
    fun sample6() {
        val items = listOf("foo", "bar", "baz")
        for (item in items) {
            println("item: $item")
        }
        var i = 0
        while (i < items.size) {
            println("item: ${items[i]}")
            i++
        }
    }
}