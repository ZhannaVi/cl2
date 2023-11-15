import kotlin.math.sqrt

class Point(val x: Int, val y: Int)

fun calculate(point1: Point, point2: Point): Double {
    val X = point2.x - point1.x
    val Y = point2.y - point1.y

    return sqrt((X * X + Y * Y).toDouble())
}

fun main() {
    val point1 = Point(2, 6)
    val point2 = Point(1, 8)

    val distance = calculate(point1, point2)
    println("Расстояние между точками: $distance")
}