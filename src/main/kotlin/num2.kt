fun find_number(a : Int, list : List<Int>) : Int {
    var low = 0
    var high = list.size -1
    var mid : Int
    while(true){
        mid = (high + low)/2
        if(list[mid] == a) return mid;
        else if(list[mid] > a){
            high = mid-1;
        }
        else if(list[mid] < a){
            low = mid+1;
        }
    }
}

fun main()
{
    val a = listOf(1,2,3,4,5,6,7,8,9,10)
    println(find_number(2, a))   // 1
    println(find_number(9, a))   // 8
    println(find_number(5, a))   // 4
}
