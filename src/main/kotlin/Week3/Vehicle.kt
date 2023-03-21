package Week3

open class Vehicle (var make:String, var model:String, var year:Int){
    open fun start(){
        println("start")
    }
    open fun stop(){
        println("stop")
    }
}
class Car(var _make:String, var _model:String, var _year:Int, var numDoors:Int):Vehicle(_make, _model, _year){
    override fun start() = println("Car start")
    override fun stop() = println("Car stop")
}
class Motorcycle(var _make:String, var _model:String, var _year:Int, var hasSidecar:Boolean):Vehicle(_make, _model, _year){
    override fun start() = println("MotorCyclr start")
    override fun stop() = println("MotorCycle stop")
}
class Bicycle(var _make:String, var _model:String, var _year:Int, var numGears:Int):Vehicle(_make, _model, _year){
    override fun start() = println("Bicycle start")
    override fun stop() = println("Bicycle stop")
}
fun main(){
    val car = Car("Honda", "Civic", 2022, 4)
    val motorcycle = Motorcycle("Harley Davidson", "Fat Boy", 2022, true)
    val bicycle = Bicycle("Trek", "FX 3", 2022, 24)

    car.start()
    car.stop()

    motorcycle.start()
    motorcycle.stop()

    bicycle.start()
    bicycle.stop()

}