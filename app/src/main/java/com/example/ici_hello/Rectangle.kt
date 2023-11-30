package com.example.ici_hello

class Rectangle(var p: Point = Point(0,0), var q: Point = Point(1,1)) {

    override fun toString(): String = "Rectangle de sommets p=$p et q=$q"

    fun Surface():Double{
        return (Math.abs(p.x-q.x)*Math.abs(p.y-q.y)).toDouble()
    }
}