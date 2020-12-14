fun main(args: Array<String>) {
    
    val imperials = listOf("Emperor","Darth Vader","Boba Fett","Tarkin") //immutable, cannot be changed
    println(imperials)
    println(imperials.sorted())
    println(imperials[1])
    println(imperials.first()) //first, last
    println(imperials.contains("Boba Fett"))
    
    val rebels = arrayListOf("Leia","Luke","Han Solo","C3PO")  //mutable can be changed
    println(rebels.size)
    rebels.add("Chewbacca")
    println(rebels)
    rebels.add(0,"Lando")
    println(rebels)
    println(rebels.indexOf("Luke"))
    
    rebels.remove("Han Solo")
    println(rebels)
    
    //MAP
    
    val rebelVehiclesMap = mapOf("Solo" to "Millenium Falcon", "Luke" to "Landspeeder")
    println(rebelVehiclesMap["Solo"])
    println(rebelVehiclesMap.get("Solo"))
    println(rebelVehiclesMap.getOrDefault("Leia", "no ship found")) // if not present then use supplied value
    println(rebelVehiclesMap.values) // keys
    
    val rebelVehicles = hashMapOf("Solo" to "Millenium Falcon", "Luke" to "Landspeeder", "Boba" to "RocketPack")
    println(rebelVehicles)
    

    
    
    
}
    