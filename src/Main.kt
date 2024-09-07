fun main() {

    var array = intArrayOf(1,2,3,4,5,6,7,8,9)
    println(States<Int>().getAverage(array))
}

class States<T>() where T:Number{

    fun getAverage(array: IntArray): Number{
        return array.average()
    }
}