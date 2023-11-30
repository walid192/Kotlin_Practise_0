package com.example.ici_hello

data class Point(var x: Int, var y: Int){
    fun distance(P:Point): Int{
        return ((Math.abs(this.x- P.x) + Math.abs(this.y - P.y)))
    }
}
