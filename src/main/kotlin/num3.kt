fun main(){
    val korea = arrayOf(0,0,0,0,1,0,0,2,0)
    val japan = arrayOf(1,1,0,0,0,0,0,0,0)
    var sum: Int = 0
    print("회     ")
    for(i in 1..9)
        print("$i ")
    println("Run")

    print("Korea ")
    for(i in korea) {
        print("$i ")
        sum+=i
    }
    println(" $sum")
    sum = 0
    print("Japan ")
    for(i in japan) {
        print("$i ")
        sum+=i
    }
    println(" $sum")
}