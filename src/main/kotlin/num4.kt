fun getMin(list:List<Int>):Int{
    var min:Int = list[0]
    for(i in list)
        if(min>i) min = i

    return min
}
fun getAvg(list:List<Int>):Double{
    var sum : Double= 0.0
    for(i in list){
        sum+=i
    }
    return sum/list.size
}

fun main(){
    val quiz = listOf(15,4,8,9,13,12,10,9,11,6)
    var min = getMin(quiz)
    var avg = getAvg(quiz)

    println("최소점수 : $min, 평균점수 : $avg")
}