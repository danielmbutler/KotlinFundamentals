fun main(args: Array<String>) {
    val str = "May the Force be with you"
    println(str)
    
    val rawCrawl = """|A long time a go
    |in a galaxy
    |far, far, away""".trimMargin()
    
    println(rawCrawl)
    
//     for (char in str) {
//         println(char)
//     }
	
    val contentEquals = str.contentEquals("May the Force be with you")
    println(contentEquals)
    
    val contains = str.contains("force", false) // true to ignore case of string (upper/lowercase)
    println(contains)
    
    val luke = "Luke Skywalker"
    val lightSaberColor ="green"
    val vehicle = "landspeeder"
    
    println("$luke has a $lightSaberColor lightsaber and drives a $vehicle")
    println("Lukes full name $luke has ${luke.length} characters")
   
}