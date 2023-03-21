package Week3

class Vector(var x:Int, var y:Int) {
    operator fun plus(other:Vector):Vector{
        return Vector(x+other.x, y+other.y)
    }
    override fun toString(): String = "($x, $y)"
}
fun main(){
    val v1 = Vector(1, 2)
    val v2 = Vector(3, 4)

    println(v1 + v2) // Output: (4, 6)

}