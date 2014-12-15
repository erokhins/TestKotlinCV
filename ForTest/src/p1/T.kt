package p1

import p1.p2.*

trait Matrix<N> {
    val n: N
}

open class A {
    val k = 3
}

fun <T : Number> Matrix<T>.getN(): Int = n.toInt()



val m1 = object : Matrix<Int> {
    override val n: Int = 1
}

val m2 = object : Matrix<Float> {
    override val n: Float = 2.6f
}

val m3 = object : Matrix<A> {
    override val n: A = A()
}

fun main(args: Array<String>) {
    println(m1.getN())
    println(m2.getN())
    println(m3.getN())
}