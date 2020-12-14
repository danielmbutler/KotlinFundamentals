// class Car constructor(val make: String, val model: String, var color: String) {
    
//     fun accelerate(){
//         println("vroom")
//     }
    
//     fun details(){
//         println("this is a $color $make $model")
//     }
    
// }

// class Truck(val make: String, val model: String, val towing: Int){
    
//     fun tow(){
//         println("Taking horses to rodeo")
//     }
    
//     fun details(){
//         println("The $make $model has a towing capacity of $towing pounds")
//     }
// }
// 
// 

open class Vehicle(val make: String, val model: String){
    
    open fun accelerate(){
        println("vroom vroom")
    }
    
    fun park(){
        println("parking vehicle")
    }
    
    fun brake(){
        println("STOP")
    }
}

class Car(make: String, model: String, var color: String) : Vehicle(make, model) {
    override fun accelerate(){
        println("we are going faster")
    }
    
}

class Truck(make: String, model: String, var towing: Int) : Vehicle(make, model) {}

fun main(args: Array<String>) {
    
    val tesla = Car("Tesla", "ModelS", "Red")
    tesla.brake()
    tesla.accelerate()
    
    val truck = Truck("Ford", "F150", 1000)
    truck.park()
    
    
    
//     val car = Car("Toyato", "Prius", "Red")
//     println(car.make)
//     println(car.model)
//     car.accelerate()
//     car.details()
    
//     val truck  = Truck("Ford", "F1", 1000)
//     truck.tow()
//     truck.details()
}