package com.example.ici_hello

fun main() {
    var tab = arrayOf<Rectangle>(
        Rectangle(),
        Rectangle(q=Point(2,3)),
        Rectangle(p=Point(2,3),q=Point(4,5)),
        Rectangle(p=Point(2,3)),)
    for (r in tab){
        println(r.toString())
        println(r.Surface())
    }
}

