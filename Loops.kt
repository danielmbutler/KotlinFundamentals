fun main(args: Array<String>) {
    
    val rebels = arrayListOf("Leia","Luke","Han Solo","C3PO")  //mutable can be changed
    val rebelVehicles = hashMapOf("Solo" to "Millenium Falcon", "Luke" to "Landspeeder", "Boba" to "RocketPack")
	
    for(rebel in rebels){
        println("Name: $rebel")
    }
    
    for ((key, value) in rebelVehicles){
        println("$key gets around in their $value")
    }
    
    // while loop
    
    var x = 10
    
    while(x > 0){
        println(x)
        x-- // x-1  x++ for add 1
    }

}